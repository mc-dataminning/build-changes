import java.util.Optional;
import javax.annotation.Nullable;

public class dve extends dup {
   private static final int b = 32;
   public static final int a = 1024;
   private static final int c = 1156;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 5;
   private static final int g = 20;
   private static final int h = 100;
   private static final int i = 10;
   private static final int j = 10;
   private static final int k = 50;
   @Nullable
   private cny l;
   private int m;
   private int n;
   @Nullable
   private fbs r;

   public dve(jh $$0, dxn $$1) {
      super(dur.k, $$0, $$1);
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dve $$3) {
      if ($$3.n > 0) {
         if ($$3.n > 50) {
            $$3.a((ash)$$0, 1, true);
            $$3.a((ash)$$0, 1, false);
         }

         if ($$3.n % 10 == 0 && $$0 instanceof ash $$4 && $$3.r != null) {
            if ($$3.l != null) {
               $$3.r = $$3.l.cR().f();
            }

            fbs $$5 = fbs.b($$1);
            float $$6 = 0.2F + 0.8F * (float)(100 - $$3.n) / 100.0F;
            fbs $$7 = $$5.d($$3.r).c((double)$$6).e($$3.r);
            jh $$8 = jh.a((ka)$$7);
            float $$9 = (float)$$3.n / 2.0F / 100.0F + 0.5F;
            $$4.a(null, $$8, axf.gw, axg.e, $$9, 1.0F);
         }

         $$3.n--;
      }

      if ($$3.m-- < 0) {
         $$3.m = 20;
         if ($$3.l != null) {
            if (dma.a($$0) && !($$3.l.f(fbs.c($$1)) > 1156.0)) {
               if ($$3.l.dQ()) {
                  $$3.l = null;
               }

               if (!dma.b($$2, $$0, $$1) && $$3.l == null) {
                  $$0.a($$1, $$2.b(dma.c, dma.a.a), 3);
               }
            } else {
               $$3.a(null);
            }
         } else if (!dma.b($$2, $$0, $$1)) {
            $$0.a($$1, $$2.b(dma.c, dma.a.a), 3);
         } else {
            if (!dma.a($$0)) {
               if ($$2.c(dma.c) == dma.a.c) {
                  $$0.a($$1, $$2.b(dma.c, dma.a.b), 3);
                  return;
               }
            } else if ($$2.c(dma.c) == dma.a.b) {
               $$0.a($$1, $$2.b(dma.c, dma.a.c), 3);
               return;
            }

            if ($$2.c(dma.c) == dma.a.c) {
               if ($$0.al() != btb.a) {
                  cps $$10 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                  if ($$10 != null) {
                     $$3.l = a((ash)$$0, $$3);
                     if ($$3.l != null) {
                        $$3.l.b(axf.gr);
                        $$0.a(null, $$3.aB_(), axf.gA, axg.e, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   private static cny a(ash $$0, dve $$1) {
      jh $$2 = $$1.aB_();
      Optional<cny> $$3 = bax.a(bvm.E, bvl.c, $$0, $$2, 5, 16, 8, bax.a.c);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cny $$4 = $$3.get();
         $$0.a($$4, ecj.t, $$4.dt());
         $$4.S();
         $$4.h($$2);
         return $$4;
      }
   }

   public acy b() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.l != null) {
         if (this.o instanceof ash $$0) {
            this.a($$0, 20, false);
            this.n = 100;
            this.r = this.l.cR().f();
         }
      }
   }

   private void a(ash $$0, int $$1, boolean $$2) {
      if (this.l != null) {
         int $$3 = $$2 ? 16545810 : 6250335;
         bam $$4 = $$0.A;

         for (double $$5 = 0.0; $$5 < (double)$$1; $$5++) {
            fbs $$6 = this.l.cR().h().b($$4.j() * this.l.cR().b(), $$4.j() * this.l.cR().c(), $$4.j() * this.l.cR().d());
            fbs $$7 = fbs.a(this.aB_()).b($$4.j(), $$4.j(), $$4.j());
            if ($$2) {
               fbs $$8 = $$6;
               $$6 = $$7;
               $$7 = $$8;
            }

            lx $$9 = new lx($$7, $$3);
            $$0.a($$9, $$6.d, $$6.e, $$6.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable btv $$0) {
      if (this.l != null) {
         this.l.h($$0);
         this.l = null;
      }
   }

   public boolean a(cnw $$0) {
      return this.l == $$0;
   }
}
