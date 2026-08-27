import java.util.EnumSet;
import javax.annotation.Nullable;

public class cey extends cer {
   @Nullable
   private cey.b b;

   public cey(bnw<? extends cey> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new cey.b(this);
      this.bO.a(1, new buz(this));
      this.bO.a(1, new buu(this, this.dM()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bvp(this, 1.0, false));
      this.bO.a(5, new cey.a(this));
      this.bP.a(1, new bwx(this).a());
      this.bP.a(2, new bwy<>(this, chl.class, true));
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 8.0).a(bpp.o, 0.25).a(bpp.c, 1.0);
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.c;
   }

   @Override
   protected atk y() {
      return atl.wq;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.ws;
   }

   @Override
   protected atk n_() {
      return atl.wr;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.wt, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(auc.y)) && this.b != null) {
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
   public float a(hz $$0, cvu $$1) {
      return dcq.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bnw<cey> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         chl $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends bwc {
      @Nullable
      private ie i;
      private boolean j;

      public a(cey $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bvf.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            awp $$0 = this.b.eh();
            if (this.b.dM().Z().b(cvn.c) && $$0.a(b(10)) == 0) {
               this.i = ie.b($$0);
               hz $$1 = hz.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dlj $$2 = this.b.dM().a_($$1);
               if (dcq.m($$2)) {
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
            cvs $$0 = this.b.dM();
            hz $$1 = hz.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dlj $$2 = $$0.a_($$1);
            if (dcq.m($$2)) {
               $$0.a($$1, dcq.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bvf {
      private final cey a;
      private int b;

      public b(cey $$0) {
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
            cvr $$0 = this.a.dM();
            awp $$1 = this.a.eh();
            hz $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hz $$6 = $$2.b($$4, $$3, $$5);
                     dlj $$7 = $$0.a_($$6);
                     cys $$8 = $$7.b();
                     if ($$8 instanceof dcq) {
                        if ($$0.Z().b(cvn.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dcq)$$8).o($$0.a_($$6)), 3);
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
