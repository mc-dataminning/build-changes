import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record akm(xk b, Optional<akm.b> c, Optional<akm.c> d, Optional<akm.a> e, boolean f) {
   public static final Codec<akm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xm.a.lenientOptionalFieldOf("description", xj.a).forGetter(akm::a),
               akm.b.a.lenientOptionalFieldOf("players").forGetter(akm::b),
               akm.c.a.lenientOptionalFieldOf("version").forGetter(akm::c),
               akm.a.a.lenientOptionalFieldOf("favicon").forGetter(akm::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(akm::e)
            )
            .apply($$0, akm::new)
   );

   public xk a() {
      return this.b;
   }

   public Optional<akm.b> b() {
      return this.c;
   }

   public Optional<akm.c> c() {
      return this.d;
   }

   public Optional<akm.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<akm.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new akm.a($$2));
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
      public static final Codec<akm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(akm.b::a),
                  Codec.INT.fieldOf("online").forGetter(akm.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(akm.b::c)
               )
               .apply($$0, akm.b::new)
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
      public static final Codec<akm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(akm.c::b), Codec.INT.fieldOf("protocol").forGetter(akm.c::c)).apply($$0, akm.c::new)
      );

      public static akm.c a() {
         af $$0 = ab.b();
         return new akm.c($$0.c(), $$0.e());
      }
   }
}
