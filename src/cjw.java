import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjw extends cjr implements cjh {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bpo> c = $$0 -> $$0.fm() || $$0.bN();

   public cjw(bpc<? extends cjw> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cjw(cwz $$0, bpo $$1) {
      super(bpc.aD, $$1, $$0);
   }

   public cjw(cwz $$0, double $$1, double $$2, double $$3) {
      super(bpc.aD, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cqf r() {
      return cqn.vl;
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   @Override
   protected void a(epn $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cqk $$1 = this.p();
         il<csh> $$2 = csj.d($$1);
         List<boj> $$3 = csj.a($$1);
         boolean $$4 = $$2.a(csk.c) && $$3.isEmpty();
         ih $$5 = $$0.b();
         ib $$6 = $$0.a();
         ib $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ih $$8 : ih.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(epp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         cqk $$1 = this.p();
         il<csh> $$2 = csj.d($$1);
         List<boj> $$3 = csj.a($$1);
         boolean $$4 = $$2.a(csk.c) && $$3.isEmpty();
         if ($$4) {
            this.s();
         } else if (!$$3.isEmpty()) {
            if (this.w()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == epp.a.c ? ((epo)$$0).a() : null);
            }
         }

         int $$5 = $$2.a().b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), csj.c($$1));
         this.am();
      }
   }

   private void s() {
      epm $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bpo $$2 : this.dM().a(bpo.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fm()) {
               $$2.a(this.dN().c(this, this.af_()), 1.0F);
            }

            if ($$2.bN() && $$2.bA()) {
               $$2.aF();
            }
         }
      }

      for (ccn $$5 : this.dM().a(ccn.class, $$0)) {
         $$5.r();
      }
   }

   private void a(List<boj> $$0, @Nullable bow $$1) {
      epm $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bpo> $$3 = this.dM().a(bpo.class, $$2);
      if (!$$3.isEmpty()) {
         bow $$4 = this.H();

         for (bpo $$5 : $$3) {
            if ($$5.fD()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (boj $$9 : $$0) {
                     il<boh> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.af_(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        boj $$12 = new boj($$10, $$11, $$9.d(), $$9.e(), $$9.f());
                        if (!$$12.a(20)) {
                           $$5.b($$12, $$4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cqk $$0, il<csh> $$1) {
      bot $$2 = new bot(this.dM(), this.dr(), this.dt(), this.dx());
      if (this.af_() instanceof bpo $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.g() / (float)$$2.k());
      $$2.a($$1);

      for (boj $$4 : csj.b($$0)) {
         $$2.a(new boj($$4));
      }

      ta $$5 = $$0.w();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean w() {
      return this.p().a(cqn.vo);
   }

   private void a(ib $$0) {
      dmz $$1 = this.dM().a_($$0);
      if ($$1.a(aun.aK)) {
         this.dM().a($$0, false, this);
      } else if (cys.c($$1)) {
         cys.a(null, $$1, this.dM(), $$0);
      } else if (dao.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         dao.a(this.af_(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(dao.c, Boolean.valueOf(false)));
      }
   }
}
