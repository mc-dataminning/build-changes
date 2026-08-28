import com.mojang.serialization.MapCodec;

public class dnz extends dhy {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final dvu b = doc.d;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dvd $$0, dev $$1, jg $$2, coh $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
      if (!$$3.cf()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bry)($$0.h() instanceof cuc && new czm($$4, $$5, $$0, $$6).b() ? bry.e : bry.a);
   }

   private static void e(dvd $$0, dev $$1, jg $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brj.a(1, 5));
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dev $$0, jg $$1) {
      double $$2 = 0.5625;
      azr $$3 = $$0.A;

      for (jl $$4 : jl.values()) {
         jg $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jl.a $$6 = $$4.o();
            double $$7 = $$6 == jl.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jl.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jl.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ll.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }
}
