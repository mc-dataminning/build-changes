import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceu extends cen {
   @Nullable
   private ceu.b b;

   public ceu(bnu<? extends ceu> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new ceu.b(this);
      this.bO.a(1, new buv(this));
      this.bO.a(1, new buq(this, this.dM()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bvl(this, 1.0, false));
      this.bO.a(5, new ceu.a(this));
      this.bP.a(1, new bwt(this).a());
      this.bP.a(2, new bwu<>(this, chh.class, true));
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 8.0).a(bpl.o, 0.25).a(bpl.c, 1.0);
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
   }

   @Override
   protected atj y() {
      return atk.wp;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.wr;
   }

   @Override
   protected atj n_() {
      return atk.wq;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.ws, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(aub.y)) && this.b != null) {
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
   public float a(hz $$0, cvq $$1) {
      return dcm.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bnu<ceu> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         chh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends bvy {
      @Nullable
      private ie i;
      private boolean j;

      public a(ceu $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            awo $$0 = this.b.eh();
            if (this.b.dM().Z().b(cvj.c) && $$0.a(b(10)) == 0) {
               this.i = ie.b($$0);
               hz $$1 = hz.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dlf $$2 = this.b.dM().a_($$1);
               if (dcm.m($$2)) {
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
            cvo $$0 = this.b.dM();
            hz $$1 = hz.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dlf $$2 = $$0.a_($$1);
            if (dcm.m($$2)) {
               $$0.a($$1, dcm.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends bvb {
      private final ceu a;
      private int b;

      public b(ceu $$0) {
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
            cvn $$0 = this.a.dM();
            awo $$1 = this.a.eh();
            hz $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hz $$6 = $$2.b($$4, $$3, $$5);
                     dlf $$7 = $$0.a_($$6);
                     cyo $$8 = $$7.b();
                     if ($$8 instanceof dcm) {
                        if ($$0.Z().b(cvj.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dcm)$$8).o($$0.a_($$6)), 3);
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
