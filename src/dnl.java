import com.mojang.serialization.MapCodec;

public class dnl extends dhj {
   public static final MapCodec<dnl> a = b(dnl::new);
   public static final dvf b = dno.d;

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dun.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(duo $$0, deg $$1, je $$2, cnu $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
      if (!$$3.cb()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (brp)($$0.h() instanceof ctr && new czk($$4, $$5, $$0, $$6).b() ? brp.e : brp.a);
   }

   private static void d(duo $$0, deg $$1, je $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bra.a(1, 5));
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(deg $$0, je $$1) {
      double $$2 = 0.5625;
      azl $$3 = $$0.z;

      for (jj $$4 : jj.values()) {
         je $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jj.a $$6 = $$4.o();
            double $$7 = $$6 == jj.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jj.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jj.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(li.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
