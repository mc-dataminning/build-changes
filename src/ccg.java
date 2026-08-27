import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccg extends cbz {
   @Nullable
   private ccg.b b;

   public ccg(blj<? extends ccg> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new ccg.b(this);
      this.bO.a(1, new bsl(this));
      this.bO.a(1, new bsg(this, this.dM()));
      this.bO.a(3, this.b);
      this.bO.a(4, new btb(this, 1.0, false));
      this.bO.a(5, new ccg.a(this));
      this.bP.a(1, new buj(this).a());
      this.bP.a(2, new buk<>(this, cer.class, true));
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 0.13F;
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 8.0).a(bnb.m, 0.25).a(bnb.c, 1.0);
   }

   @Override
   protected blf.b aW() {
      return blf.b.c;
   }

   @Override
   protected arb y() {
      return arc.wa;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.wc;
   }

   @Override
   protected arb n_() {
      return arc.wb;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.wd, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(art.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return czx.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(blj<ccg> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cer $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bma eS() {
      return bma.c;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bto {
      @Nullable
      private ia i;
      private boolean j;

      public a(ccg $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            auf $$0 = this.b.eg();
            if (this.b.dM().Y().b(csu.c) && $$0.a(b(10)) == 0) {
               this.i = ia.b($$0);
               hv $$1 = hv.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dip $$2 = this.b.dM().a_($$1);
               if (czx.h($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.a();
         }
      }

      @Override
      public boolean b() {
         return this.j ? false : super.b();
      }

      @Override
      public void c() {
         if (!this.j) {
            super.c();
         } else {
            csz $$0 = this.b.dM();
            hv $$1 = hv.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dip $$2 = $$0.a_($$1);
            if (czx.h($$2)) {
               $$0.a($$1, czx.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bsr {
      private final ccg a;
      private int b;

      public b(ccg $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean a() {
         return this.b > 0;
      }

      @Override
      public void e() {
         this.b--;
         if (this.b <= 0) {
            csy $$0 = this.a.dM();
            auf $$1 = this.a.eg();
            hv $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hv $$6 = $$2.b($$4, $$3, $$5);
                     dip $$7 = $$0.a_($$6);
                     cvz $$8 = $$7.b();
                     if ($$8 instanceof czx) {
                        if ($$0.Y().b(csu.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((czx)$$8).o($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
