import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbp extends czo implements dhc {
   public static final MapCodec<dbp> a = b(dbp::new);
   public static final dns b = dnr.C;
   private static final int d = 3;
   protected static final eqm c = dac.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   public dbp(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dku($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.z, $$0.B ? dku::a : dku::b);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.b;
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(b) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dkd) {
            ((dkd)$$5).a($$4.z());
         }
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(aus.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
