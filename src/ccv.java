import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccv extends cco {
   @Nullable
   private ccv.b b;

   public ccv(bly<? extends ccv> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new ccv.b(this);
      this.bO.a(1, new bta(this));
      this.bO.a(1, new bsv(this, this.dM()));
      this.bO.a(3, this.b);
      this.bO.a(4, new btq(this, 1.0, false));
      this.bO.a(5, new ccv.a(this));
      this.bP.a(1, new buy(this).a());
      this.bP.a(2, new buz<>(this, cfh.class, true));
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.13F;
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 8.0).a(bnq.m, 0.25).a(bnq.c, 1.0);
   }

   @Override
   protected blu.b aW() {
      return blu.b.c;
   }

   @Override
   protected arq y() {
      return arr.wa;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.wc;
   }

   @Override
   protected arq n_() {
      return arr.wb;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.wd, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(asi.y)) && this.b != null) {
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
   public float a(hx $$0, ctr $$1) {
      return dan.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bly<ccv> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmp eS() {
      return bmp.c;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bud {
      @Nullable
      private ic i;
      private boolean j;

      public a(ccv $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            auu $$0 = this.b.eg();
            if (this.b.dM().Z().b(ctk.c) && $$0.a(b(10)) == 0) {
               this.i = ic.b($$0);
               hx $$1 = hx.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               djg $$2 = this.b.dM().a_($$1);
               if (dan.h($$2)) {
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
            ctp $$0 = this.b.dM();
            hx $$1 = hx.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            djg $$2 = $$0.a_($$1);
            if (dan.h($$2)) {
               $$0.a($$1, dan.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends btg {
      private final ccv a;
      private int b;

      public b(ccv $$0) {
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
            cto $$0 = this.a.dM();
            auu $$1 = this.a.eg();
            hx $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hx $$6 = $$2.b($$4, $$3, $$5);
                     djg $$7 = $$0.a_($$6);
                     cwp $$8 = $$7.b();
                     if ($$8 instanceof dan) {
                        if ($$0.Z().b(ctk.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dan)$$8).o($$0.a_($$6)), 3);
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
