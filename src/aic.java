import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aic(vs b, Optional<aic.b> c, Optional<aic.c> d, Optional<aic.a> e, boolean f) {
   public static final Codec<aic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vu.a.optionalFieldOf("description", vr.a).forGetter(aic::a),
               aic.b.a.optionalFieldOf("players").forGetter(aic::b),
               aic.c.a.optionalFieldOf("version").forGetter(aic::c),
               aic.a.a.optionalFieldOf("favicon").forGetter(aic::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(aic::e)
            )
            .apply($$0, aic::new)
   );

   public vs a() {
      return this.b;
   }

   public Optional<aic.b> b() {
      return this.c;
   }

   public Optional<aic.c> c() {
      return this.d;
   }

   public Optional<aic.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aic.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aic.a($$2));
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
         $$0 -> $$0.group(je.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aic.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aic.b::a),
                  Codec.INT.fieldOf("online").forGetter(aic.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(aic.b::c)
               )
               .apply($$0, aic.b::new)
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
      public static final Codec<aic.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aic.c::b), Codec.INT.fieldOf("protocol").forGetter(aic.c::c)).apply($$0, aic.c::new)
      );

      public static aic.c a() {
         ad $$0 = aa.b();
         return new aic.c($$0.c(), $$0.e());
      }
   }
}
