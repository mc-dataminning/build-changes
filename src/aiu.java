import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aiu(wi b, Optional<aiu.b> c, Optional<aiu.c> d, Optional<aiu.a> e, boolean f) {
   public static final Codec<aiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wk.a.optionalFieldOf("description", wh.a).forGetter(aiu::a),
               aiu.b.a.optionalFieldOf("players").forGetter(aiu::b),
               aiu.c.a.optionalFieldOf("version").forGetter(aiu::c),
               aiu.a.a.optionalFieldOf("favicon").forGetter(aiu::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(aiu::e)
            )
            .apply($$0, aiu::new)
   );

   public wi a() {
      return this.b;
   }

   public Optional<aiu.b> b() {
      return this.c;
   }

   public Optional<aiu.c> c() {
      return this.d;
   }

   public Optional<aiu.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aiu.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aiu.a($$2));
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
         $$0 -> $$0.group(jh.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aiu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aiu.b::a),
                  Codec.INT.fieldOf("online").forGetter(aiu.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(aiu.b::c)
               )
               .apply($$0, aiu.b::new)
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
      public static final Codec<aiu.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aiu.c::b), Codec.INT.fieldOf("protocol").forGetter(aiu.c::c)).apply($$0, aiu.c::new)
      );

      public static aiu.c a() {
         ad $$0 = aa.b();
         return new aiu.c($$0.c(), $$0.e());
      }
   }
}
