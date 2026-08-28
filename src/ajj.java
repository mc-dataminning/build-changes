import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajj(wu b, Optional<ajj.b> c, Optional<ajj.c> d, Optional<ajj.a> e, boolean f) {
   public static final Codec<ajj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.lenientOptionalFieldOf("description", wt.a).forGetter(ajj::a),
               ajj.b.a.lenientOptionalFieldOf("players").forGetter(ajj::b),
               ajj.c.a.lenientOptionalFieldOf("version").forGetter(ajj::c),
               ajj.a.a.lenientOptionalFieldOf("favicon").forGetter(ajj::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajj::e)
            )
            .apply($$0, ajj::new)
   );

   public wu a() {
      return this.b;
   }

   public Optional<ajj.b> b() {
      return this.c;
   }

   public Optional<ajj.c> c() {
      return this.d;
   }

   public Optional<ajj.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajj.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajj.a($$2));
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
         $$0 -> $$0.group(kd.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajj.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajj.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajj.b::c)
               )
               .apply($$0, ajj.b::new)
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
      public static final Codec<ajj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajj.c::b), Codec.INT.fieldOf("protocol").forGetter(ajj.c::c)).apply($$0, ajj.c::new)
      );

      public static ajj.c a() {
         ad $$0 = aa.b();
         return new ajj.c($$0.c(), $$0.e());
      }
   }
}
