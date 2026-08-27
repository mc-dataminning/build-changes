import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ads(te b, Optional<ads.b> c, Optional<ads.c> d, Optional<ads.a> e, boolean f) {
   public static final Codec<ads> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqw.b.optionalFieldOf("description", td.a).forGetter(ads::a),
               ads.b.a.optionalFieldOf("players").forGetter(ads::b),
               ads.c.a.optionalFieldOf("version").forGetter(ads::c),
               ads.a.a.optionalFieldOf("favicon").forGetter(ads::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(ads::e)
            )
            .apply($$0, ads::new)
   );

   public te a() {
      return this.b;
   }

   public Optional<ads.b> b() {
      return this.c;
   }

   public Optional<ads.c> c() {
      return this.d;
   }

   public Optional<ads.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ads.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ads.a($$2));
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
         $$0 -> $$0.group(hz.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ads.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ads.b::a),
                  Codec.INT.fieldOf("online").forGetter(ads.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(ads.b::c)
               )
               .apply($$0, ads.b::new)
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
      public static final Codec<ads.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ads.c::b), Codec.INT.fieldOf("protocol").forGetter(ads.c::c)).apply($$0, ads.c::new)
      );

      public static ads.c a() {
         ad $$0 = aa.b();
         return new ads.c($$0.c(), $$0.e());
      }
   }
}
