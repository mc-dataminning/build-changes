import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dae extends cxh implements cxb {
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ahg.a(ke.aw).fieldOf("feature").forGetter($$0x -> $$0x.e), kd.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dae::new)
   );
   protected static final emv b = cwy.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cwy d;
   private final ahg<drp<?, ?>> e;

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   protected dae(ahg<drp<?, ?>> $$0, cwy $$1, djo.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(asi.aK) || $$0.a(cxa.fl) || $$0.a(cxa.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ih<drp<?, ?>>> a(cua $$0) {
      return $$0.I_().d(ke.aw).b(this.e);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      djp $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      this.a($$0).ifPresent($$3x -> ((drp)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
