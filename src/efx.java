import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efx(efx.a b, bmt<dar.c> c) {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efx.a.c.fieldOf("bounding_box").forGetter(efx::a), bmt.c(dar.c.a).fieldOf("spawns").forGetter(efx::b)).apply($$0, efx::new)
   );

   public efx.a a() {
      return this.b;
   }

   public bmt<dar.c> b() {
      return this.c;
   }

   public static enum a implements ayg {
      a("piece"),
      b("full");

      public static final Codec<efx.a> c = ayg.a(efx.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
