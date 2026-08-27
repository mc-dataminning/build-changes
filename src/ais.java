import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ais(wg b, Optional<ais.b> c, Optional<ais.c> d, Optional<ais.a> e, boolean f) {
   public static final Codec<ais> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wi.a.optionalFieldOf("description", wf.a).forGetter(ais::a),
               ais.b.a.optionalFieldOf("players").forGetter(ais::b),
               ais.c.a.optionalFieldOf("version").forGetter(ais::c),
               ais.a.a.optionalFieldOf("favicon").forGetter(ais::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(ais::e)
            )
            .apply($$0, ais::new)
   );

   public wg a() {
      return this.b;
   }

   public Optional<ais.b> b() {
      return this.c;
   }

   public Optional<ais.c> c() {
      return this.d;
   }

   public Optional<ais.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ais.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ais.a($$2));
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
      public static final Codec<ais.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ais.b::a),
                  Codec.INT.fieldOf("online").forGetter(ais.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(ais.b::c)
               )
               .apply($$0, ais.b::new)
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
      public static final Codec<ais.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ais.c::b), Codec.INT.fieldOf("protocol").forGetter(ais.c::c)).apply($$0, ais.c::new)
      );

      public static ais.c a() {
         ad $$0 = aa.b();
         return new ais.c($$0.c(), $$0.e());
      }
   }
}
