import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dns extends dkv implements dko {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), ma.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dns::new)
   );
   protected static final fcr b = dkl.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dkl d;
   private final aly<egh<?, ?>> e;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(aly<egh<?, ?>> $$0, dkl $$1, dxt.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dkn.fz) || $$0.a(dkn.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jq<egh<?, ?>>> a(dhk $$0) {
      return $$0.K_().e(mb.aL).a(this.e);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      dxu $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      this.a($$0).ifPresent($$3x -> ((egh)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
