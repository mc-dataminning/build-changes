import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cil extends cig implements chw {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bog> c = $$0 -> $$0.fh() || $$0.bN();

   public cil(bnu<? extends cil> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cil(cvn $$0, bog $$1) {
      super(bnu.aC, $$1, $$0);
   }

   public cil(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.aC, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cou s() {
      return cpc.vk;
   }

   @Override
   protected float x() {
      return 0.05F;
   }

   @Override
   protected void a(eno $$0) {
      super.a($$0);
      if (!this.dM().B) {
         coz $$1 = this.q();
         ij<cqv> $$2 = cqx.d($$1);
         List<bnb> $$3 = cqx.a($$1);
         boolean $$4 = $$2.a(cqy.c) && $$3.isEmpty();
         ie $$5 = $$0.b();
         hz $$6 = $$0.a();
         hz $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ie $$8 : ie.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(enq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         coz $$1 = this.q();
         ij<cqv> $$2 = cqx.d($$1);
         List<bnb> $$3 = cqx.a($$1);
         boolean $$4 = $$2.a(cqy.c) && $$3.isEmpty();
         if ($$4) {
            this.y();
         } else if (!$$3.isEmpty()) {
            if (this.z()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == enq.a.c ? ((enp)$$0).a() : null);
            }
         }

         int $$5 = $$2.a().b() ? 2007 : 2002;
         this.dM().c($$5, this.dm(), cqx.c($$1));
         this.am();
      }
   }

   private void y() {
      enn $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bog $$2 : this.dM().a(bog.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fh()) {
               $$2.a(this.dN().c(this, this.w()), 1.0F);
            }

            if ($$2.bN() && $$2.bx()) {
               $$2.aF();
            }
         }
      }

      for (cbd $$5 : this.dM().a(cbd.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bnb> $$0, @Nullable bno $$1) {
      enn $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bog> $$3 = this.dM().a(bog.class, $$2);
      if (!$$3.isEmpty()) {
         bno $$4 = this.I();

         for (bog $$5 : $$3) {
            if ($$5.fy()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bnb $$9 : $$0) {
                     ij<bmz> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.w(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bnb $$12 = new bnb($$10, $$11, $$9.d(), $$9.e(), $$9.f());
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

   private void a(coz $$0, ij<cqv> $$1) {
      bnl $$2 = new bnl(this.dM(), this.dr(), this.dt(), this.dx());
      if (this.w() instanceof bog $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bnb $$4 : cqx.b($$0)) {
         $$2.a(new bnb($$4));
      }

      sw $$5 = $$0.w();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dM().b($$2);
   }

   private boolean z() {
      return this.q().a(cpc.vn);
   }

   private void a(hz $$0) {
      dlf $$1 = this.dM().a_($$0);
      if ($$1.a(atz.aJ)) {
         this.dM().a($$0, false, this);
      } else if (cxg.c($$1)) {
         cxg.a(null, $$1, this.dM(), $$0);
      } else if (czc.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         czc.a(this.w(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(czc.c, Boolean.valueOf(false)));
      }
   }
}
