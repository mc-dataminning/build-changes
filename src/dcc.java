import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcc extends dbk {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final dpq[] b = new dpq[]{dpp.k, dpp.l, dpp.m};
   protected static final est c = esq.a(dby.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dby.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dcc(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? null : a($$2, dmh.l, dmi::a);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dmi) {
            $$3.a((dmi)$$5);
            $$3.a(auw.aa);
         }

         return boa.b;
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(kl.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      bnw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return cmp.a($$1.c_($$2));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
