import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzv extends bzo {
   @Nullable
   private bzv.b b;

   public bzv(bja<? extends bzv> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new bzv.b(this);
      this.bO.a(1, new bqb(this));
      this.bO.a(1, new bpw(this, this.dL()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bqr(this, 1.0, false));
      this.bO.a(5, new bzv.a(this));
      this.bP.a(1, new brz(this).a());
      this.bP.a(2, new bsa<>(this, cca.class, true));
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 0.13F;
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 8.0).a(bks.m, 0.25).a(bks.c, 1.0);
   }

   @Override
   protected biw.b aU() {
      return biw.b.c;
   }

   @Override
   protected apf w() {
      return apg.vk;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.vm;
   }

   @Override
   protected apf l_() {
      return apg.vl;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.vn, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(apx.x)) && this.b != null) {
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
   public float a(gw $$0, cqe $$1) {
      return cwz.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bja<bzv> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cca $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjr eR() {
      return bjr.c;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bre {
      @Nullable
      private ha i;
      private boolean j;

      public a(bzv $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.L().l()) {
            return false;
         } else {
            ash $$0 = this.b.ef();
            if (this.b.dL().X().b(cpx.c) && $$0.a(b(10)) == 0) {
               this.i = ha.b($$0);
               gw $$1 = gw.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
               dfd $$2 = this.b.dL().a_($$1);
               if (cwz.h($$2)) {
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
            cqc $$0 = this.b.dL();
            gw $$1 = gw.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
            dfd $$2 = $$0.a_($$1);
            if (cwz.h($$2)) {
               $$0.a($$1, cwz.n($$2), 3);
               this.b.Q();
               this.b.ak();
            }
         }
      }
   }

   static class b extends bqh {
      private final bzv a;
      private int b;

      public b(bzv $$0) {
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
            cqb $$0 = this.a.dL();
            ash $$1 = this.a.ef();
            gw $$2 = this.a.dl();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gw $$6 = $$2.b($$4, $$3, $$5);
                     dfd $$7 = $$0.a_($$6);
                     ctc $$8 = $$7.b();
                     if ($$8 instanceof cwz) {
                        if ($$0.X().b(cpx.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cwz)$$8).o($$0.a_($$6)), 3);
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
