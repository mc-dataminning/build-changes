import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record akw(xv b, Optional<akw.b> c, Optional<akw.c> d, Optional<akw.a> e, boolean f) {
   public static final Codec<akw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xx.a.lenientOptionalFieldOf("description", xu.a).forGetter(akw::a),
               akw.b.a.lenientOptionalFieldOf("players").forGetter(akw::b),
               akw.c.a.lenientOptionalFieldOf("version").forGetter(akw::c),
               akw.a.a.lenientOptionalFieldOf("favicon").forGetter(akw::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(akw::e)
            )
            .apply($$0, akw::new)
   );

   public xv a() {
      return this.b;
   }

   public Optional<akw.b> b() {
      return this.c;
   }

   public Optional<akw.c> c() {
      return this.d;
   }

   public Optional<akw.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<akw.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new akw.a($$2));
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
         $$0 -> $$0.group(kk.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<akw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(akw.b::a),
                  Codec.INT.fieldOf("online").forGetter(akw.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(akw.b::c)
               )
               .apply($$0, akw.b::new)
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
      public static final Codec<akw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(akw.c::b), Codec.INT.fieldOf("protocol").forGetter(akw.c::c)).apply($$0, akw.c::new)
      );

      public static akw.c a() {
         af $$0 = ab.b();
         return new akw.c($$0.c(), $$0.e());
      }
   }
}
