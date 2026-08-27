import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cyg extends cvj implements cvd {
   public static final MapCodec<cyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(agh.a(jz.au).fieldOf("feature").forGetter($$0x -> $$0x.e), jy.f.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, cyg::new)
   );
   protected static final ekn b = cva.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cva d;
   private final agh<dpi<?, ?>> e;

   @Override
   public MapCodec<cyg> a() {
      return a;
   }

   protected cyg(agh<dpi<?, ?>> $$0, cva $$1, dhh.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(arg.aK) || $$0.a(cvc.fl) || $$0.a(cvc.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ib<dpi<?, ?>>> a(csd $$0) {
      return $$0.H_().d(jz.au).b(this.e);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      dhi $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      this.a($$0).ifPresent($$3x -> ((dpi)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
