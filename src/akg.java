import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record akg(xj b, Optional<akg.b> c, Optional<akg.c> d, Optional<akg.a> e, boolean f) {
   public static final Codec<akg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xl.a.lenientOptionalFieldOf("description", xi.a).forGetter(akg::a),
               akg.b.a.lenientOptionalFieldOf("players").forGetter(akg::b),
               akg.c.a.lenientOptionalFieldOf("version").forGetter(akg::c),
               akg.a.a.lenientOptionalFieldOf("favicon").forGetter(akg::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(akg::e)
            )
            .apply($$0, akg::new)
   );

   public xj a() {
      return this.b;
   }

   public Optional<akg.b> b() {
      return this.c;
   }

   public Optional<akg.c> c() {
      return this.d;
   }

   public Optional<akg.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<akg.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new akg.a($$2));
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
      public static final Codec<akg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(akg.b::a),
                  Codec.INT.fieldOf("online").forGetter(akg.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(akg.b::c)
               )
               .apply($$0, akg.b::new)
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
      public static final Codec<akg.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(akg.c::b), Codec.INT.fieldOf("protocol").forGetter(akg.c::c)).apply($$0, akg.c::new)
      );

      public static akg.c a() {
         af $$0 = ab.b();
         return new akg.c($$0.c(), $$0.e());
      }
   }
}
