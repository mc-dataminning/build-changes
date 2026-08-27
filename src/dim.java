import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dim extends dfl implements dff {
   public static final MapCodec<dim> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aks.a(li.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lh.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dim::new)
   );
   protected static final exn b = dfc.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfc d;
   private final aks<ebm<?, ?>> e;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   protected dim(aks<ebm<?, ?>> $$0, dfc $$1, dtb.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(awe.aN) || $$0.a(dfe.gd) || $$0.a(dfe.eL) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ja<ebm<?, ?>>> a(dcd $$0) {
      return $$0.I_().d(li.aC).b(this.e);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      this.a($$0).ifPresent($$3x -> ((ebm)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
