import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record afu(vb b, Optional<afu.b> c, Optional<afu.c> d, Optional<afu.a> e, boolean f) {
   public static final Codec<afu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vd.a.optionalFieldOf("description", va.a).forGetter(afu::a),
               afu.b.a.optionalFieldOf("players").forGetter(afu::b),
               afu.c.a.optionalFieldOf("version").forGetter(afu::c),
               afu.a.a.optionalFieldOf("favicon").forGetter(afu::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(afu::e)
            )
            .apply($$0, afu::new)
   );

   public vb a() {
      return this.b;
   }

   public Optional<afu.b> b() {
      return this.c;
   }

   public Optional<afu.c> c() {
      return this.d;
   }

   public Optional<afu.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<afu.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new afu.a($$2));
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
         $$0 -> $$0.group(iy.c.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<afu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(afu.b::a),
                  Codec.INT.fieldOf("online").forGetter(afu.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(afu.b::c)
               )
               .apply($$0, afu.b::new)
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
      public static final Codec<afu.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(afu.c::b), Codec.INT.fieldOf("protocol").forGetter(afu.c::c)).apply($$0, afu.c::new)
      );

      public static afu.c a() {
         ad $$0 = aa.b();
         return new afu.c($$0.c(), $$0.e());
      }
   }
}
