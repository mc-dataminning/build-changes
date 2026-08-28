import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkq extends dkm implements dkp {
   public static final MapCodec<dkq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aL).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dkq::new)
   );
   private final aly<egi<?, ?>> b;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(aly<egi<?, ?>> $$0, dxu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      $$0.K_().a(mb.aL).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((egi)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2.d()));
   }

   @Override
   public dkp.a ar_() {
      return dkp.a.a;
   }
}
