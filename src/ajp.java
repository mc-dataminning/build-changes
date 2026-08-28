import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajp(wy b, Optional<ajp.b> c, Optional<ajp.c> d, Optional<ajp.a> e, boolean f) {
   public static final Codec<ajp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.lenientOptionalFieldOf("description", wx.a).forGetter(ajp::a),
               ajp.b.a.lenientOptionalFieldOf("players").forGetter(ajp::b),
               ajp.c.a.lenientOptionalFieldOf("version").forGetter(ajp::c),
               ajp.a.a.lenientOptionalFieldOf("favicon").forGetter(ajp::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajp::e)
            )
            .apply($$0, ajp::new)
   );

   public wy a() {
      return this.b;
   }

   public Optional<ajp.b> b() {
      return this.c;
   }

   public Optional<ajp.c> c() {
      return this.d;
   }

   public Optional<ajp.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajp.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajp.a($$2));
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
      public static final Codec<ajp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajp.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajp.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajp.b::c)
               )
               .apply($$0, ajp.b::new)
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
      public static final Codec<ajp.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajp.c::b), Codec.INT.fieldOf("protocol").forGetter(ajp.c::c)).apply($$0, ajp.c::new)
      );

      public static ajp.c a() {
         ae $$0 = ab.b();
         return new ajp.c($$0.c(), $$0.e());
      }
   }
}
