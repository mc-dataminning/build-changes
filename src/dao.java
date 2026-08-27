import com.mojang.serialization.MapCodec;

public class dao extends dac {
   public static final MapCodec<dao> a = b(dao::new);
   public static final int b = 6;
   public static final dob c = dnr.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eqm[] g = new eqm[]{
      dac.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dac.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dac.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dac.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dac.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dac.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dac.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   protected dao(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      cqh $$7 = $$0.d();
      if ($$0.a(auv.ai) && $$1.c(c) == 0 && dac.a($$7) instanceof dar $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, aty.dq, atz.e, 1.0F, 1.0F);
         $$2.b($$3, das.a($$8));
         $$2.a($$4, drp.c, $$3);
         $$4.b(aui.c.b($$7));
         return bnf.a;
      } else {
         return bnf.d;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bnd.a;
         }

         if ($$3.b(bnc.a).b()) {
            return bnd.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bnd a(cxc $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$3.s(false)) {
         return bnd.d;
      } else {
         $$3.a(aui.U);
         $$3.gj().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, drp.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, drp.f, $$1);
         }

         return bnd.a;
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
