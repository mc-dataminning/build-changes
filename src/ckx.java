import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckx extends cks implements cki {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bqo> c = $$0 -> $$0.fm() || $$0.bN();

   public ckx(bqb<? extends ckx> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckx(cyx $$0, bqo $$1) {
      super(bqb.aD, $$1, $$0);
   }

   public ckx(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.aD, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cre r() {
      return crm.vm;
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   @Override
   protected void a(erw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         crj $$1 = this.p();
         ih $$2 = $$0.b();
         ib $$3 = $$0.a();
         ib $$4 = $$3.a($$2);
         cth $$5 = $$1.a(jp.x, cth.a);
         if ($$5.a(cti.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ih $$6 : ih.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);
      if (!this.dM().B) {
         crj $$1 = this.p();
         cth $$2 = $$1.a(jp.x, cth.a);
         if ($$2.a(cti.a)) {
            this.v();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == ery.a.c ? ((erx)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dM().c($$3, this.dm(), $$2.b());
         this.am();
      }
   }

   private void v() {
      erv $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bqo $$2 : this.dM().a(bqo.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fm()) {
               $$2.a(this.dN().c(this, this.u()), 1.0F);
            }

            if ($$2.bN() && $$2.bA()) {
               $$2.aF();
            }
         }
      }

      for (cdn $$5 : this.dM().a(cdn.class, $$0)) {
         $$5.r();
      }
   }

   private void a(Iterable<bph> $$0, @Nullable bpv $$1) {
      erv $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bqo> $$3 = this.dM().a(bqo.class, $$2);
      if (!$$3.isEmpty()) {
         bpv $$4 = this.I();

         for (bqo $$5 : $$3) {
            if ($$5.fD()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bph $$9 : $$0) {
                     il<bpf> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.u(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bph $$12 = new bph($$10, $$11, $$9.d(), $$9.e(), $$9.f());
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

   private void a(cth $$0) {
      bpr $$1 = new bpr(this.dM(), this.dr(), this.dt(), this.dx());
      if (this.u() instanceof bqo $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.k());
      $$1.a($$0);
      this.dM().b($$1);
   }

   private boolean w() {
      return this.p().a(crm.vp);
   }

   private void a(ib $$0) {
      doz $$1 = this.dM().a_($$0);
      if ($$1.a(avc.aK)) {
         this.dM().a($$0, false, this);
      } else if (daq.c($$1)) {
         daq.a(null, $$1, this.dM(), $$0);
      } else if (dcm.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         dcm.a(this.u(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(dcm.c, Boolean.valueOf(false)));
      }
   }
}
