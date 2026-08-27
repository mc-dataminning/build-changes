import com.mojang.serialization.MapCodec;

public class dba extends cva {
   public static final MapCodec<dba> a = b(dba::new);
   public static final dhz b = dbd.d;

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   public dba(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, bkq $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      clj $$6 = $$3.b($$4);
      return $$6.d() instanceof cjc && new cnr($$3, $$4, $$6, $$5).b() ? bix.d : bix.a;
   }

   private static void d(dhi $$0, csa $$1, ht $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cpw.a(cpy.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(csa $$0, ht $$1) {
      double $$2 = 0.5625;
      ats $$3 = $$0.z;

      for (hx $$4 : hx.values()) {
         ht $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            hx.a $$6 = $$4.o();
            double $$7 = $$6 == hx.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == hx.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == hx.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jm.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }
}
