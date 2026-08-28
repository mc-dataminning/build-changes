import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpw extends dvy implements dmp {
   public static final MapCodec<dpw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mg.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dpw::new)
   );
   private static final double b = 0.4;
   private static final ffr c = dmm.b(8.0, 0.0, 9.0);
   private final dmm d;
   private final alf<ejf<?, ?>> e;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   protected dpw(alf<ejf<?, ?>> $$0, dmm $$1, ean.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(axc.aO) || $$0.a(dmo.fE) || $$0.a(dmo.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jf<ejf<?, ?>>> a(djk $$0) {
      return $$0.F_().f(mh.aL).a(this.e);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      eao $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      this.a($$0).ifPresent($$3x -> ((ejf)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
