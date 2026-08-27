import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czd extends cyp implements czq {
   public static final MapCodec<czd> c = b(czd::new);
   protected static final ekn g = cva.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<czd> a() {
      return c;
   }

   protected czd(dhh.d $$0) {
      super($$0, hx.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dhi $$0) {
      return $$0.a(cvc.G);
   }

   @Override
   protected cva b() {
      return cvc.md;
   }

   @Override
   protected boolean h(dhi $$0) {
      return !$$0.a(cvc.kJ);
   }

   @Override
   public boolean a(@Nullable cdu $$0, crg $$1, ht $$2, dhi $$3, ecr $$4) {
      return false;
   }

   @Override
   public boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      return false;
   }

   @Override
   protected int a(ats $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return $$1.a(arl.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public ecs c_(dhi $$0) {
      return ect.c.a(false);
   }
}
