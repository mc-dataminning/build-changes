import com.mojang.serialization.MapCodec;

public class dno extends dhm {
   public static final MapCodec<dno> a = b(dno::new);
   public static final dvj b = dnr.d;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dur.d $$0) {
      super($$0);
      this.l(this.n().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dus $$0, dej $$1, jf $$2, cnx $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
      if (!$$3.cb()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (brs)($$0.h() instanceof ctu && new czn($$4, $$5, $$0, $$6).b() ? brs.e : brs.a);
   }

   private static void d(dus $$0, dej $$1, jf $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dus $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brd.a(1, 5));
      }
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dej $$0, jf $$1) {
      double $$2 = 0.5625;
      azn $$3 = $$0.z;

      for (jk $$4 : jk.values()) {
         jf $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jk.a $$6 = $$4.o();
            double $$7 = $$6 == jk.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jk.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jk.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lj.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }
}
