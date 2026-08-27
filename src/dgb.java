import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dgb extends dde implements dcy {
   public static final MapCodec<dgb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ake.a(ld.aB).fieldOf("feature").forGetter($$0x -> $$0x.e), lc.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dgb::new)
   );
   protected static final ety b = dcv.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dcv d;
   private final ake<dyh<?, ?>> e;

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   protected dgb(ake<dyh<?, ?>> $$0, dcv $$1, dpx.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(avo.aL) || $$0.a(dcx.fl) || $$0.a(dcx.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends iv<dyh<?, ?>>> a(czx $$0) {
      return $$0.H_().d(ld.aB).b(this.e);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      dpy $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      this.a($$0).ifPresent($$3x -> ((dyh)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
