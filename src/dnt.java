import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnt extends dkw implements dkp {
   public static final MapCodec<dnt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), ma.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dnt::new)
   );
   protected static final fcs b = dkm.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dkm d;
   private final aly<egi<?, ?>> e;

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   protected dnt(aly<egi<?, ?>> $$0, dkm $$1, dxu.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dko.fz) || $$0.a(dko.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<egi<?, ?>>> a(dhl $$0) {
      return $$0.K_().e(mb.aL).a(this.e);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      dxv $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      this.a($$0).ifPresent($$3x -> ((egi)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
