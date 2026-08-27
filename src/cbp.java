import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbp extends cbi {
   @Nullable
   private cbp.b b;

   public cbp(bku<? extends cbp> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new cbp.b(this);
      this.bO.a(1, new brv(this));
      this.bO.a(1, new brq(this, this.dN()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bsl(this, 1.0, false));
      this.bO.a(5, new cbp.a(this));
      this.bP.a(1, new btt(this).a());
      this.bP.a(2, new btu<>(this, cdu.class, true));
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.13F;
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 8.0).a(bmm.m, 0.25).a(bmm.c, 1.0);
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.c;
   }

   @Override
   protected aqq y() {
      return aqr.vF;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.vH;
   }

   @Override
   protected aqq m_() {
      return aqr.vG;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.vI, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(ari.x)) && this.b != null) {
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
   public float a(ht $$0, csd $$1) {
      return cyy.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bku<cbp> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cdu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bll eT() {
      return bll.c;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bsy {
      @Nullable
      private hx i;
      private boolean j;

      public a(cbp $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            ats $$0 = this.b.eh();
            if (this.b.dN().Y().b(crw.c) && $$0.a(b(10)) == 0) {
               this.i = hx.b($$0);
               ht $$1 = ht.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
               dhi $$2 = this.b.dN().a_($$1);
               if (cyy.h($$2)) {
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
            csb $$0 = this.b.dN();
            ht $$1 = ht.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
            dhi $$2 = $$0.a_($$1);
            if (cyy.h($$2)) {
               $$0.a($$1, cyy.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bsb {
      private final cbp a;
      private int b;

      public b(cbp $$0) {
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
            csa $$0 = this.a.dN();
            ats $$1 = this.a.eh();
            ht $$2 = this.a.dn();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ht $$6 = $$2.b($$4, $$3, $$5);
                     dhi $$7 = $$0.a_($$6);
                     cva $$8 = $$7.b();
                     if ($$8 instanceof cyy) {
                        if ($$0.Y().b(crw.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cyy)$$8).o($$0.a_($$6)), 3);
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
