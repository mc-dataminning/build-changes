import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjl extends cje {
   @Nullable
   private cjl.b b;

   public cjl(bsc<? extends cjl> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cjl.b(this);
      this.bS.a(1, new bzi(this));
      this.bS.a(1, new bzd(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new bzy(this, 1.0, false));
      this.bS.a(5, new cjl.a(this));
      this.bT.a(1, new cbg(this).a());
      this.bT.a(2, new cbh<>(this, cly.class, true));
   }

   public static btx.a s() {
      return cje.gv().a(bty.q, 8.0).a(bty.r, 0.25).a(bty.c, 1.0);
   }

   @Override
   protected brw.b bb() {
      return brw.b.c;
   }

   @Override
   protected avh v() {
      return avi.wU;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.wW;
   }

   @Override
   protected avh o_() {
      return avi.wV;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(avz.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(io $$0, dbc $$1) {
      return dhz.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsc<cjl> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cly $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cal {
      @Nullable
      private it i;
      private boolean j;

      public a(cjl $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            aym $$0 = this.b.el();
            if (this.b.dP().aa().b(dav.c) && $$0.a(b(10)) == 0) {
               this.i = it.b($$0);
               io $$1 = io.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               drd $$2 = this.b.dP().a_($$1);
               if (dhz.m($$2)) {
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
            dba $$0 = this.b.dP();
            io $$1 = io.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            drd $$2 = $$0.a_($$1);
            if (dhz.m($$2)) {
               $$0.a($$1, dhz.n($$2), 3);
               this.b.Q();
               this.b.ao();
            }
         }
      }
   }

   static class b extends bzo {
      private final cjl a;
      private int b;

      public b(cjl $$0) {
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
            daz $$0 = this.a.dP();
            aym $$1 = this.a.el();
            io $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     io $$6 = $$2.b($$4, $$3, $$5);
                     drd $$7 = $$0.a_($$6);
                     dea $$8 = $$7.b();
                     if ($$8 instanceof dhz) {
                        if ($$0.aa().b(dav.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dhz)$$8).o($$0.a_($$6)), 3);
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
