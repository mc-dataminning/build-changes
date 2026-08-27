import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzd extends dzg {
   public static final Codec<dzd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter($$0x -> $$0x.b),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter($$0x -> $$0x.e),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dzd::new)
   );
   private final float b;
   private final float d;
   private final int e;
   private final int f;

   public dzd(float $$0, float $$1, int $$2, int $$3) {
      if ($$2 >= $$3) {
         throw new IllegalArgumentException("Invalid range: [" + $$2 + "," + $$3 + "]");
      } else {
         this.b = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }
   }

   @Override
   public boolean a(ht $$0, ht $$1, ht $$2, ate $$3) {
      int $$4 = $$1.k($$2);
      float $$5 = $$3.i();
      return $$5 <= asy.b(this.b, this.d, asy.g((float)$$4, (float)this.e, (float)this.f));
   }

   @Override
   protected dzh<?> a() {
      return dzh.b;
   }
}
