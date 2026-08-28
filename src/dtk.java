import com.mojang.serialization.MapCodec;

public class dtk extends dnc {
   public static final MapCodec<dtk> a = b(dtk::new);
   public static final ebv b = dtn.b;

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   public dtk(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(ebe $$0, djx $$1, iv $$2, crx $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
      if (!$$3.cd()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bur)($$0.h() instanceof cyg && new ddr($$4, $$5, $$0, $$6).b() ? bur.e : bur.a);
   }

   private static void d(ebe $$0, djx $$1, iv $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, buc.a(1, 5));
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(djx $$0, iv $$1) {
      double $$2 = 0.5625;
      azx $$3 = $$0.A;

      for (jb $$4 : jb.values()) {
         iv $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jb.a $$6 = $$4.o();
            double $$7 = $$6 == jb.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jb.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jb.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(lt.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
