import com.mojang.serialization.MapCodec;

public class die extends dal implements daf {
   public static final MapCodec<die> a = b(die::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dob c = dnr.as;
   private static final eqm e = dac.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eqm f = dac.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(cqp.wn);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dnb $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(drp.c, $$2, drp.a.a($$5));
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if ($$3 instanceof bpp && $$3.ai() != bpd.R && $$3.ai() != bpd.i) {
         $$3.a($$0, new ept(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dr() || $$3.ae != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ac);
            double $$5 = Math.abs($$3.dx() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ah().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cqp.rx) ? bnf.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cqm(cqp.wn, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, aty.yT, atz.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dnb $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(drp.c, $$2, drp.a.a($$3, $$8));
         return bnd.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
