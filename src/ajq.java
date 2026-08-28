import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajq(wz b, Optional<ajq.b> c, Optional<ajq.c> d, Optional<ajq.a> e, boolean f) {
   public static final Codec<ajq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xb.a.lenientOptionalFieldOf("description", wy.a).forGetter(ajq::a),
               ajq.b.a.lenientOptionalFieldOf("players").forGetter(ajq::b),
               ajq.c.a.lenientOptionalFieldOf("version").forGetter(ajq::c),
               ajq.a.a.lenientOptionalFieldOf("favicon").forGetter(ajq::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajq::e)
            )
            .apply($$0, ajq::new)
   );

   public wz a() {
      return this.b;
   }

   public Optional<ajq.b> b() {
      return this.c;
   }

   public Optional<ajq.c> c() {
      return this.d;
   }

   public Optional<ajq.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajq.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajq.a($$2));
            } catch (IllegalArgumentException var3) {
               return DataResult.error(() -> "Malformed base64 server icon");
            }
         }
      }, $$0 -> "data:image/png;base64," + new String(Base64.getEncoder().encode($$0.b), StandardCharsets.UTF_8));

      public byte[] a() {
         return this.b;
      }
   }

   public static record b(int b, int c, List<GameProfile> d) {
      private static final Codec<GameProfile> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(kg.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajq.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajq.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajq.b::c)
               )
               .apply($$0, ajq.b::new)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public List<GameProfile> c() {
         return this.d;
      }
   }

   public static record c(String b, int c) {
      public static final Codec<ajq.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajq.c::b), Codec.INT.fieldOf("protocol").forGetter(ajq.c::c)).apply($$0, ajq.c::new)
      );

      public static ajq.c a() {
         ae $$0 = ab.b();
         return new ajq.c($$0.c(), $$0.e());
      }
   }
}
