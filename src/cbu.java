import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbu extends cbn {
   @Nullable
   private cbu.b b;

   public cbu(bkz<? extends cbu> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new cbu.b(this);
      this.bO.a(1, new bsa(this));
      this.bO.a(1, new brv(this, this.dN()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bsq(this, 1.0, false));
      this.bO.a(5, new cbu.a(this));
      this.bP.a(1, new bty(this).a());
      this.bP.a(2, new btz<>(this, cdz.class, true));
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 0.13F;
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 8.0).a(bmr.m, 0.25).a(bmr.c, 1.0);
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.c;
   }

   @Override
   protected aqu y() {
      return aqv.vF;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.vH;
   }

   @Override
   protected aqu n_() {
      return aqv.vG;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.vI, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(arm.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dD();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return czd.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bkz<cbu> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cdz $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public blq eT() {
      return blq.c;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends btd {
      @Nullable
      private ib i;
      private boolean j;

      public a(cbu $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            atw $$0 = this.b.eh();
            if (this.b.dN().Y().b(csb.c) && $$0.a(b(10)) == 0) {
               this.i = ib.b($$0);
               hx $$1 = hx.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
               dhn $$2 = this.b.dN().a_($$1);
               if (czd.h($$2)) {
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
            csg $$0 = this.b.dN();
            hx $$1 = hx.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
            dhn $$2 = $$0.a_($$1);
            if (czd.h($$2)) {
               $$0.a($$1, czd.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bsg {
      private final cbu a;
      private int b;

      public b(cbu $$0) {
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
            csf $$0 = this.a.dN();
            atw $$1 = this.a.eh();
            hx $$2 = this.a.dn();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hx $$6 = $$2.b($$4, $$3, $$5);
                     dhn $$7 = $$0.a_($$6);
                     cvf $$8 = $$7.b();
                     if ($$8 instanceof czd) {
                        if ($$0.Y().b(csb.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((czd)$$8).o($$0.a_($$6)), 3);
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
