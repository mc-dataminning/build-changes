import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkp extends dkl implements dko {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dkp::new)
   );
   private final aly<egh<?, ?>> b;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(aly<egh<?, ?>> $$0, dxt.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      $$0.K_().a(mb.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((egh)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dko.a ar_() {
      return dko.a.a;
   }
}
