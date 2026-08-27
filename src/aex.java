import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aex(ui b, Optional<aex.b> c, Optional<aex.c> d, Optional<aex.a> e, boolean f) {
   public static final Codec<aex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               uk.a.optionalFieldOf("description", uh.a).forGetter(aex::a),
               aex.b.a.optionalFieldOf("players").forGetter(aex::b),
               aex.c.a.optionalFieldOf("version").forGetter(aex::c),
               aex.a.a.optionalFieldOf("favicon").forGetter(aex::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(aex::e)
            )
            .apply($$0, aex::new)
   );

   public ui a() {
      return this.b;
   }

   public Optional<aex.b> b() {
      return this.c;
   }

   public Optional<aex.c> c() {
      return this.d;
   }

   public Optional<aex.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aex.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aex.a($$2));
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
         $$0 -> $$0.group(iv.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aex.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aex.b::a),
                  Codec.INT.fieldOf("online").forGetter(aex.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(aex.b::c)
               )
               .apply($$0, aex.b::new)
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
      public static final Codec<aex.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aex.c::b), Codec.INT.fieldOf("protocol").forGetter(aex.c::c)).apply($$0, aex.c::new)
      );

      public static aex.c a() {
         ad $$0 = aa.b();
         return new aex.c($$0.c(), $$0.e());
      }
   }
}
