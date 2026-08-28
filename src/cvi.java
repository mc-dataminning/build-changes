import java.util.List;

public class cvi extends cvx implements cww {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvi(cvx.a $$0) {
      super($$0);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      if ($$1 instanceof arn $$2) {
         cwb $$3 = $$0.n();
         ezn $$4 = $$0.l();
         jm $$5 = $$0.k();
         cpg.a(new cpb($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsd.a;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      if ($$1.fL()) {
         cwb $$3 = $$1.b($$2);
         if ($$0 instanceof arn $$4) {
            cpg.a(new cpb($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awv.c.b(this));
         }

         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      cyr $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpg a(dfb $$0, ka $$1, cwb $$2, jm $$3) {
      return new cpb($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cww.a b() {
      return cww.a.a().a(cvi::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ezn a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}
