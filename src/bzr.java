import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzr extends bzm implements bzd {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bfz> c = $$0 -> $$0.fb() || $$0.bL();

   public bzr(bfn<? extends bzr> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzr(cmm $$0, bfz $$1) {
      super(bfn.aA, $$1, $$0);
   }

   public bzr(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.aA, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cfu k() {
      return cgc.uu;
   }

   @Override
   protected float p() {
      return 0.05F;
   }

   @Override
   protected void a(eee $$0) {
      super.a($$0);
      if (!this.dI().B) {
         cfz $$1 = this.j();
         chw $$2 = chy.d($$1);
         List<bfa> $$3 = chy.a($$1);
         boolean $$4 = $$2 == chz.c && $$3.isEmpty();
         ha $$5 = $$0.b();
         gu $$6 = $$0.a();
         gu $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for (ha $$8 : ha.c.a) {
               this.a($$7.a($$8));
            }
         }
      }
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      if (!this.dI().B) {
         cfz $$1 = this.j();
         chw $$2 = chy.d($$1);
         List<bfa> $$3 = chy.a($$1);
         boolean $$4 = $$2 == chz.c && $$3.isEmpty();
         if ($$4) {
            this.q();
         } else if (!$$3.isEmpty()) {
            if (this.r()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == eeg.a.c ? ((eef)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.dI().c($$5, this.di(), chy.c($$1));
         this.ai();
      }
   }

   private void q() {
      eed $$0 = this.cE().c(4.0, 2.0, 4.0);

      for (bfz $$2 : this.dI().a(bfz.class, $$0, c)) {
         double $$3 = this.f($$2);
         if ($$3 < 16.0) {
            if ($$2.fb()) {
               $$2.a(this.dJ().c(this, this.v()), 1.0F);
            }

            if ($$2.bL() && $$2.bs()) {
               $$2.aB();
            }
         }
      }

      for (bss $$5 : this.dI().a(bss.class, $$0)) {
         $$5.q();
      }
   }

   private void a(List<bfa> $$0, @Nullable bfj $$1) {
      eed $$2 = this.cE().c(4.0, 2.0, 4.0);
      List<bfz> $$3 = this.dI().a(bfz.class, $$2);
      if (!$$3.isEmpty()) {
         bfj $$4 = this.A();

         for (bfz $$5 : $$3) {
            if ($$5.ft()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bfa $$9 : $$0) {
                     bey $$10 = $$9.c();
                     if ($$10.a()) {
                        $$10.a(this, this.v(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bfa $$12 = new bfa($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cfz $$0, chw $$1) {
      bfg $$2 = new bfg(this.dI(), this.dn(), this.dp(), this.dt());
      bfj $$3 = this.v();
      if ($$3 instanceof bfz) {
         $$2.a((bfz)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.m());
      $$2.a($$1);

      for (bfa $$4 : chy.b($$0)) {
         $$2.a(new bfa($$4));
      }

      qr $$5 = $$0.v();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.dI().b($$2);
   }

   private boolean r() {
      return this.j().a(cgc.ux);
   }

   private void a(gu $$0) {
      dcb $$1 = this.dI().a_($$0);
      if ($$1.a(amw.aI)) {
         this.dI().a($$0, false);
      } else if (coe.c($$1)) {
         coe.a(null, $$1, this.dI(), $$0);
      } else if (cqa.g($$1)) {
         this.dI().a(null, 1009, $$0, 0);
         cqa.a(this.v(), this.dI(), $$0, $$1);
         this.dI().b($$0, $$1.a(cqa.b, Boolean.valueOf(false)));
      }
   }
}
