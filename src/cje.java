import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cje extends ciz implements cip {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<box> c = $$0 -> $$0.fj() || $$0.bK();

   public cje(bol<? extends cje> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cje(cwe $$0, box $$1) {
      super(bol.aC, $$1, $$0);
   }

   public cje(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.aC, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cpl s() {
      return cpt.vk;
   }

   @Override
   protected float u() {
      return 0.05F;
   }

   @Override
   protected void a(eor $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         cpq $$1 = this.q();
         il<crm> $$2 = cro.d($$1);
         List<bns> $$3 = cro.a($$1);
         boolean $$4 = $$2.a(crp.c) && $$3.isEmpty();
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
   protected void a(eot $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         cpq $$1 = this.q();
         il<crm> $$2 = cro.d($$1);
         List<bns> $$3 = cro.a($$1);
         boolean $$4 = $$2.a(crp.c) && $$3.isEmpty();
         if ($$4) {
            this.x();
         } else if (!$$3.isEmpty()) {
            if (this.y()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == eot.a.c ? ((eos)$$0).a() : null);
            }
         }

         int $$5 = $$2.a().b() ? 2007 : 2002;
         this.dJ().c($$5, this.dj(), cro.c($$1));
         this.am();
      }
   }

   private void x() {
      eoq $$0 = this.cE().c(4.0, 2.0, 4.0);

      for (box $$2 : this.dJ().a(box.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fj()) {
               $$2.a(this.dK().c(this, this.w()), 1.0F);
            }

            if ($$2.bK() && $$2.bx()) {
               $$2.aF();
            }
         }
      }

      for (cbw $$5 : this.dJ().a(cbw.class, $$0)) {
         $$5.u();
      }
   }

   private void a(List<bns> $$0, @Nullable bof $$1) {
      eoq $$2 = this.cE().c(4.0, 2.0, 4.0);
      List<box> $$3 = this.dJ().a(box.class, $$2);
      if (!$$3.isEmpty()) {
         bof $$4 = this.I();

         for (box $$5 : $$3) {
            if ($$5.fA()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bns $$9 : $$0) {
                     il<bnq> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.w(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bns $$12 = new bns($$10, $$11, $$9.d(), $$9.e(), $$9.f());
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

   private void a(cpq $$0, il<crm> $$1) {
      boc $$2 = new boc(this.dJ(), this.do(), this.dq(), this.du());
      if (this.w() instanceof box $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bns $$4 : cro.b($$0)) {
         $$2.a(new bns($$4));
      }

      sy $$5 = $$0.w();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dJ().b($$2);
   }

   private boolean y() {
      return this.q().a(cpt.vn);
   }

   private void a(ib $$0) {
      dme $$1 = this.dJ().a_($$0);
      if ($$1.a(aue.aJ)) {
         this.dJ().a($$0, false, this);
      } else if (cxx.c($$1)) {
         cxx.a(null, $$1, this.dJ(), $$0);
      } else if (czt.g($$1)) {
         this.dJ().a(null, 1009, $$0, 0);
         czt.a(this.w(), this.dJ(), $$0, $$1);
         this.dJ().b($$0, $$1.a(czt.c, Boolean.valueOf(false)));
      }
   }
}
