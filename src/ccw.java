import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccw extends ccp {
   @Nullable
   private ccw.b b;

   public ccw(blz<? extends ccw> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new ccw.b(this);
      this.bO.a(1, new btb(this));
      this.bO.a(1, new bsw(this, this.dM()));
      this.bO.a(3, this.b);
      this.bO.a(4, new btr(this, 1.0, false));
      this.bO.a(5, new ccw.a(this));
      this.bP.a(1, new buz(this).a());
      this.bP.a(2, new bva<>(this, cfi.class, true));
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 0.13F;
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.l, 8.0).a(bnr.m, 0.25).a(bnr.c, 1.0);
   }

   @Override
   protected blv.b aW() {
      return blv.b.c;
   }

   @Override
   protected arr y() {
      return ars.wa;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.wc;
   }

   @Override
   protected arr n_() {
      return ars.wb;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.wd, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(asj.y)) && this.b != null) {
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
   public float a(hx $$0, cts $$1) {
      return dao.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(blz<ccw> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfi $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmq eS() {
      return bmq.c;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bue {
      @Nullable
      private ic i;
      private boolean j;

      public a(ccw $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            auv $$0 = this.b.eg();
            if (this.b.dM().Z().b(ctl.c) && $$0.a(b(10)) == 0) {
               this.i = ic.b($$0);
               hx $$1 = hx.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               djh $$2 = this.b.dM().a_($$1);
               if (dao.h($$2)) {
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
            ctq $$0 = this.b.dM();
            hx $$1 = hx.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            djh $$2 = $$0.a_($$1);
            if (dao.h($$2)) {
               $$0.a($$1, dao.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bth {
      private final ccw a;
      private int b;

      public b(ccw $$0) {
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
            ctp $$0 = this.a.dM();
            auv $$1 = this.a.eg();
            hx $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hx $$6 = $$2.b($$4, $$3, $$5);
                     djh $$7 = $$0.a_($$6);
                     cwq $$8 = $$7.b();
                     if ($$8 instanceof dao) {
                        if ($$0.Z().b(ctl.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dao)$$8).o($$0.a_($$6)), 3);
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
