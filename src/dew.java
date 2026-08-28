import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dew(jq<axe> d, bsm e, bsm f) implements deq {
   public static final MapCodec<dew> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axe.b.fieldOf("sound").forGetter(dew::b),
               bsm.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dew::c),
               bsm.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dew::d)
            )
            .apply($$0, dew::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      bam $$5 = $$3.dZ();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public jq<axe> b() {
      return this.d;
   }

   public bsm c() {
      return this.e;
   }

   public bsm d() {
      return this.f;
   }
}
