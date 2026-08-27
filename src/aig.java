import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aig(vu b, Optional<aig.b> c, Optional<aig.c> d, Optional<aig.a> e, boolean f) {
   public static final Codec<aig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vw.a.optionalFieldOf("description", vt.a).forGetter(aig::a),
               aig.b.a.optionalFieldOf("players").forGetter(aig::b),
               aig.c.a.optionalFieldOf("version").forGetter(aig::c),
               aig.a.a.optionalFieldOf("favicon").forGetter(aig::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(aig::e)
            )
            .apply($$0, aig::new)
   );

   public vu a() {
      return this.b;
   }

   public Optional<aig.b> b() {
      return this.c;
   }

   public Optional<aig.c> c() {
      return this.d;
   }

   public Optional<aig.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aig.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aig.a($$2));
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
         $$0 -> $$0.group(jf.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aig.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aig.b::a),
                  Codec.INT.fieldOf("online").forGetter(aig.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(aig.b::c)
               )
               .apply($$0, aig.b::new)
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
      public static final Codec<aig.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aig.c::b), Codec.INT.fieldOf("protocol").forGetter(aig.c::c)).apply($$0, aig.c::new)
      );

      public static aig.c a() {
         ad $$0 = aa.b();
         return new aig.c($$0.c(), $$0.e());
      }
   }
}
