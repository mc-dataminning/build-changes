import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjj extends cjc {
   @Nullable
   private cjj.b b;

   public cjj(bsa<? extends cjj> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cjj.b(this);
      this.bS.a(1, new bzg(this));
      this.bS.a(1, new bzb(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new bzw(this, 1.0, false));
      this.bS.a(5, new cjj.a(this));
      this.bT.a(1, new cbe(this).a());
      this.bT.a(2, new cbf<>(this, clw.class, true));
   }

   public static btv.a s() {
      return cjc.gv().a(btw.q, 8.0).a(btw.r, 0.25).a(btw.c, 1.0);
   }

   @Override
   protected bru.b bb() {
      return bru.b.c;
   }

   @Override
   protected avg v() {
      return avh.wU;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.wW;
   }

   @Override
   protected avg o_() {
      return avh.wV;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(avy.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aZ = this.dF();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(io $$0, dba $$1) {
      return dhx.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsa<cjj> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         clw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends caj {
      @Nullable
      private it i;
      private boolean j;

      public a(cjj $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            ayk $$0 = this.b.el();
            if (this.b.dP().aa().b(dat.c) && $$0.a(b(10)) == 0) {
               this.i = it.b($$0);
               io $$1 = io.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               drb $$2 = this.b.dP().a_($$1);
               if (dhx.m($$2)) {
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
            day $$0 = this.b.dP();
            io $$1 = io.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            drb $$2 = $$0.a_($$1);
            if (dhx.m($$2)) {
               $$0.a($$1, dhx.n($$2), 3);
               this.b.Q();
               this.b.ao();
            }
         }
      }
   }

   static class b extends bzm {
      private final cjj a;
      private int b;

      public b(cjj $$0) {
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
            dax $$0 = this.a.dP();
            ayk $$1 = this.a.el();
            io $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     io $$6 = $$2.b($$4, $$3, $$5);
                     drb $$7 = $$0.a_($$6);
                     ddy $$8 = $$7.b();
                     if ($$8 instanceof dhx) {
                        if ($$0.aa().b(dat.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dhx)$$8).o($$0.a_($$6)), 3);
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
