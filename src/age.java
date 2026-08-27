import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record age(vd b, Optional<age.b> c, Optional<age.c> d, Optional<age.a> e, boolean f) {
   public static final Codec<age> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vf.a.optionalFieldOf("description", vc.a).forGetter(age::a),
               age.b.a.optionalFieldOf("players").forGetter(age::b),
               age.c.a.optionalFieldOf("version").forGetter(age::c),
               age.a.a.optionalFieldOf("favicon").forGetter(age::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(age::e)
            )
            .apply($$0, age::new)
   );

   public vd a() {
      return this.b;
   }

   public Optional<age.b> b() {
      return this.c;
   }

   public Optional<age.c> c() {
      return this.d;
   }

   public Optional<age.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<age.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new age.a($$2));
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
         $$0 -> $$0.group(ja.c.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<age.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(age.b::a),
                  Codec.INT.fieldOf("online").forGetter(age.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(age.b::c)
               )
               .apply($$0, age.b::new)
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
      public static final Codec<age.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(age.c::b), Codec.INT.fieldOf("protocol").forGetter(age.c::c)).apply($$0, age.c::new)
      );

      public static age.c a() {
         ad $$0 = aa.b();
         return new age.c($$0.c(), $$0.e());
      }
   }
}
