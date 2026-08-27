import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbh extends cba {
   @Nullable
   private cbh.b b;

   public cbh(bkm<? extends cbh> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cbh.b(this);
      this.bO.a(1, new brn(this));
      this.bO.a(1, new bri(this, this.dL()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bsd(this, 1.0, false));
      this.bO.a(5, new cbh.a(this));
      this.bP.a(1, new btl(this).a());
      this.bP.a(2, new btm<>(this, cdm.class, true));
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.13F;
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 8.0).a(bme.m, 0.25).a(bme.c, 1.0);
   }

   @Override
   protected bki.b aU() {
      return bki.b.c;
   }

   @Override
   protected aqm w() {
      return aqn.vo;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.vq;
   }

   @Override
   protected aqm m_() {
      return aqn.vp;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.vr, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(are.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dB();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return cyr.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bkm<cbh> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cdm $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bld eR() {
      return bld.c;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bsq {
      @Nullable
      private hx i;
      private boolean j;

      public a(cbh $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.L().l()) {
            return false;
         } else {
            ato $$0 = this.b.ef();
            if (this.b.dL().X().b(cro.c) && $$0.a(b(10)) == 0) {
               this.i = hx.b($$0);
               ht $$1 = ht.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
               dgw $$2 = this.b.dL().a_($$1);
               if (cyr.h($$2)) {
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
            crt $$0 = this.b.dL();
            ht $$1 = ht.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
            dgw $$2 = $$0.a_($$1);
            if (cyr.h($$2)) {
               $$0.a($$1, cyr.n($$2), 3);
               this.b.Q();
               this.b.ak();
            }
         }
      }
   }

   static class b extends brt {
      private final cbh a;
      private int b;

      public b(cbh $$0) {
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
            crs $$0 = this.a.dL();
            ato $$1 = this.a.ef();
            ht $$2 = this.a.dl();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ht $$6 = $$2.b($$4, $$3, $$5);
                     dgw $$7 = $$0.a_($$6);
                     cut $$8 = $$7.b();
                     if ($$8 instanceof cyr) {
                        if ($$0.X().b(cro.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cyr)$$8).o($$0.a_($$6)), 3);
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
