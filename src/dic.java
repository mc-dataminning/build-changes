import com.mojang.serialization.MapCodec;

public class dic extends daj implements dad {
   public static final MapCodec<dic> a = b(dic::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dnz c = dnp.as;
   private static final eqk e = daa.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eqk f = daa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(cqn.wm);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dmz $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(drn.c, $$2, drn.a.a($$5));
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if ($$3 instanceof bpo && $$3.ai() != bpc.Q && $$3.ai() != bpc.i) {
         $$3.a($$0, new epr(0.8F, 0.75, 0.8F));
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
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cqn.rx) ? bne.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cqk(cqn.wm, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, aty.yO, atz.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dmz $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(drn.c, $$2, drn.a.a($$3, $$8));
         return bnc.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
