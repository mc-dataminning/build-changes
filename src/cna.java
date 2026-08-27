import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cna extends cmv implements cml {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bso> c = $$0 -> $$0.fp() || $$0.bQ();

   public cna(bsa<? extends cna> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cna(dax $$0, bso $$1) {
      super(bsa.aE, $$1, $$0);
   }

   public cna(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctj u() {
      return ctr.vo;
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   @Override
   protected void a(eug $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cto $$1 = this.p();
         it $$2 = $$0.b();
         io $$3 = $$0.a();
         io $$4 = $$3.a($$2);
         cvp $$5 = $$1.a(kb.F, cvp.a);
         if ($$5.a(cvq.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (it $$6 : it.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cto $$1 = this.p();
         cvp $$2 = $$1.a(kb.F, cvp.a);
         if ($$2.a(cvq.a)) {
            this.v();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == eui.a.c ? ((euh)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dP().c($$3, this.dp(), $$2.b());
         this.ao();
      }
   }

   private void v() {
      euf $$0 = this.cK().c(4.0, 2.0, 4.0);

      for (bso $$2 : this.dP().a(bso.class, $$0, c)) {
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

      for (cfq $$5 : this.dP().a(cfq.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<brc> $$0, @Nullable bru $$1) {
      euf $$2 = this.cK().c(4.0, 2.0, 4.0);
      List<bso> $$3 = this.dP().a(bso.class, $$2);
      if (!$$3.isEmpty()) {
         bru $$4 = this.I();

         for (bso $$5 : $$3) {
            if ($$5.fG()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (brc $$9 : $$0) {
                     ix<bra> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        brc $$12 = new brc($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cvp $$0) {
      brq $$1 = new brq(this.dP(), this.du(), this.dw(), this.dA());
      if (this.s() instanceof bso $$2) {
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
      return this.p().a(ctr.vr);
   }

   private void a(io $$0) {
      drb $$1 = this.dP().a_($$0);
      if ($$1.a(avw.aK)) {
         this.dP().a($$0, false, this);
      } else if (dcq.c($$1)) {
         dcq.a(null, $$1, this.dP(), $$0);
      } else if (dem.g($$1)) {
         this.dP().a(null, 1009, $$0, 0);
         dem.a(this.s(), this.dP(), $$0, $$1);
         this.dP().b($$0, $$1.a(dem.c, Boolean.valueOf(false)));
      }
   }
}
