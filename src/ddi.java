import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ddi extends dal implements daf {
   public static final MapCodec<ddi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajg.a(kj.ax).fieldOf("feature").forGetter($$0x -> $$0x.e), ki.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, ddi::new)
   );
   protected static final eqm b = dac.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dac d;
   private final ajg<dvf<?, ?>> e;

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   protected ddi(ajg<dvf<?, ?>> $$0, dac $$1, dna.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(aun.aL) || $$0.a(dae.fl) || $$0.a(dae.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends il<dvf<?, ?>>> a(cxe $$0) {
      return $$0.H_().d(kj.ax).b(this.e);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      dnb $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      this.a($$0).ifPresent($$3x -> ((dvf)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
