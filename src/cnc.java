import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnc extends cmx implements cmn {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bsq> c = $$0 -> $$0.fp() || $$0.bQ();

   public cnc(bsc<? extends cnc> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cnc(daz $$0, bsq $$1) {
      super(bsc.aE, $$1, $$0);
   }

   public cnc(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctl u() {
      return ctt.vo;
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   @Override
   protected void a(eui $$0) {
      super.a($$0);
      if (!this.dP().B) {
         ctq $$1 = this.p();
         it $$2 = $$0.b();
         io $$3 = $$0.a();
         io $$4 = $$3.a($$2);
         cvr $$5 = $$1.a(kb.F, cvr.a);
         if ($$5.a(cvs.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (it $$6 : it.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(euk $$0) {
      super.a($$0);
      if (!this.dP().B) {
         ctq $$1 = this.p();
         cvr $$2 = $$1.a(kb.F, cvr.a);
         if ($$2.a(cvs.a)) {
            this.v();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == euk.a.c ? ((euj)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dP().c($$3, this.dp(), $$2.b());
         this.ao();
      }
   }

   private void v() {
      euh $$0 = this.cK().c(4.0, 2.0, 4.0);

      for (bsq $$2 : this.dP().a(bsq.class, $$0, c)) {
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

      for (cfs $$5 : this.dP().a(cfs.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<bre> $$0, @Nullable brw $$1) {
      euh $$2 = this.cK().c(4.0, 2.0, 4.0);
      List<bsq> $$3 = this.dP().a(bsq.class, $$2);
      if (!$$3.isEmpty()) {
         brw $$4 = this.I();

         for (bsq $$5 : $$3) {
            if ($$5.fG()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bre $$9 : $$0) {
                     ix<brc> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bre $$12 = new bre($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cvr $$0) {
      brs $$1 = new brs(this.dP(), this.du(), this.dw(), this.dA());
      if (this.s() instanceof bsq $$2) {
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
      return this.p().a(ctt.vr);
   }

   private void a(io $$0) {
      drd $$1 = this.dP().a_($$0);
      if ($$1.a(avx.aK)) {
         this.dP().a($$0, false, this);
      } else if (dcs.c($$1)) {
         dcs.a(null, $$1, this.dP(), $$0);
      } else if (deo.g($$1)) {
         this.dP().a(null, 1009, $$0, 0);
         deo.a(this.s(), this.dP(), $$0, $$1);
         this.dP().b($$0, $$1.a(deo.c, Boolean.valueOf(false)));
      }
   }
}
