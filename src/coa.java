import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coa extends cnv implements cnl {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bto> c = $$0 -> $$0.fp() || $$0.bQ();

   public coa(bsz<? extends coa> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public coa(dbx $$0, bto $$1) {
      super(bsz.aE, $$1, $$0);
   }

   public coa(dbx $$0, double $$1, double $$2, double $$3) {
      super(bsz.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuj u() {
      return cur.vo;
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cuo $$1 = this.p();
         je $$2 = $$0.b();
         iz $$3 = $$0.a();
         iz $$4 = $$3.a($$2);
         cwp $$5 = $$1.a(km.G, cwp.a);
         if ($$5.a(cwq.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (je $$6 : je.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (!this.dP().B) {
         cuo $$1 = this.p();
         cwp $$2 = $$1.a(km.G, cwp.a);
         if ($$2.a(cwq.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == evo.a.c ? ((evn)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dP().c($$3, this.dp(), $$2.b());
         this.ao();
      }
   }

   private void v() {
      evl $$0 = this.cK().c(4.0, 2.0, 4.0);

      for (bto $$2 : this.dP().a(bto.class, $$0, c)) {
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

      for (cgq $$5 : this.dP().a(cgq.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<bsb> $$0, @Nullable bst $$1) {
      evl $$2 = this.cK().c(4.0, 2.0, 4.0);
      List<bto> $$3 = this.dP().a(bto.class, $$2);
      if (!$$3.isEmpty()) {
         bst $$4 = this.I();

         for (bto $$5 : $$3) {
            if ($$5.fG()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bsb $$9 : $$0) {
                     ji<brz> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bsb $$12 = new bsb($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cwp $$0) {
      bsp $$1 = new bsp(this.dP(), this.du(), this.dw(), this.dA());
      if (this.s() instanceof bto $$2) {
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
      return this.p().a(cur.vr);
   }

   private void a(iz $$0) {
      dsb $$1 = this.dP().a_($$0);
      if ($$1.a(awo.aK)) {
         this.dP().a($$0, false, this);
      } else if (ddq.c($$1)) {
         ddq.a(null, $$1, this.dP(), $$0);
      } else if (dfm.g($$1)) {
         this.dP().a(null, 1009, $$0, 0);
         dfm.a(this.s(), this.dP(), $$0, $$1);
         this.dP().b($$0, $$1.a(dfm.c, Boolean.valueOf(false)));
      }
   }
}
