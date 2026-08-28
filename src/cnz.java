import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnz extends cnu implements cnk {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<btn> c = $$0 -> $$0.fp() || $$0.bQ();

   public cnz(bsy<? extends cnz> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cnz(dbw $$0, btn $$1) {
      super(bsy.aE, $$1, $$0);
   }

   public cnz(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cui u() {
      return cuq.vo;
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   @Override
   protected void a(evl $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cun $$1 = this.p();
         je $$2 = $$0.b();
         iz $$3 = $$0.a();
         iz $$4 = $$3.a($$2);
         cwo $$5 = $$1.a(km.F, cwo.a);
         if ($$5.a(cwp.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (je $$6 : je.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cun $$1 = this.p();
         cwo $$2 = $$1.a(km.F, cwo.a);
         if ($$2.a(cwp.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == evn.a.c ? ((evm)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dP().c($$3, this.dp(), $$2.b());
         this.ao();
      }
   }

   private void v() {
      evk $$0 = this.cK().c(4.0, 2.0, 4.0);

      for (btn $$2 : this.dP().a(btn.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fp()) {
               $$2.a(this.dQ().c(this, this.s()), 1.0F);
            }

            if ($$2.bQ() && $$2.bD()) {
               $$2.aH();
            }
         }
      }

      for (cgp $$5 : this.dP().a(cgp.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<bsa> $$0, @Nullable bss $$1) {
      evk $$2 = this.cK().c(4.0, 2.0, 4.0);
      List<btn> $$3 = this.dP().a(btn.class, $$2);
      if (!$$3.isEmpty()) {
         bss $$4 = this.I();

         for (btn $$5 : $$3) {
            if ($$5.fG()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bsa $$9 : $$0) {
                     ji<bry> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bsa $$12 = new bsa($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cwo $$0) {
      bso $$1 = new bso(this.dP(), this.du(), this.dw(), this.dA());
      if (this.s() instanceof btn $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dP().b($$1);
   }

   private boolean w() {
      return this.p().a(cuq.vr);
   }

   private void a(iz $$0) {
      dsa $$1 = this.dP().a_($$0);
      if ($$1.a(awo.aK)) {
         this.dP().a($$0, false, this);
      } else if (ddp.c($$1)) {
         ddp.a(null, $$1, this.dP(), $$0);
      } else if (dfl.g($$1)) {
         this.dP().a(null, 1009, $$0, 0);
         dfl.a(this.s(), this.dP(), $$0, $$1);
         this.dP().b($$0, $$1.a(dfl.c, Boolean.valueOf(false)));
      }
   }
}
