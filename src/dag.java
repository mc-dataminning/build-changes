import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dag extends czo {
   public static final MapCodec<dag> a = b(dag::new);
   public static final dns[] b = new dns[]{dnr.k, dnr.l, dnr.m};
   protected static final eqm c = eqj.a(dac.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dac.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public dag(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? null : a($$2, dkk.l, dkl::a);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dkl) {
            $$3.a((dkl)$$5);
            $$3.a(aui.aa);
         }

         return bnd.b;
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dkl) {
            ((dkl)$$5).a($$4.z());
         }
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(kc.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
