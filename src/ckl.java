import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckl extends cke {
   @Nullable
   private ckl.b b;

   public ckl(btb<? extends ckl> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new ckl.b(this);
      this.bS.a(1, new cai(this));
      this.bS.a(1, new cad(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new cay(this, 1.0, false));
      this.bS.a(5, new ckl.a(this));
      this.bT.a(1, new ccg(this).a());
      this.bT.a(2, new cch<>(this, cmy.class, true));
   }

   public static bux.a s() {
      return cke.gw().a(buy.q, 8.0).a(buy.r, 0.25).a(buy.c, 1.0);
   }

   @Override
   protected bsv.b bb() {
      return bsv.b.c;
   }

   @Override
   protected avz v() {
      return awa.wU;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.wW;
   }

   @Override
   protected avz o_() {
      return awa.wV;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awr.y)) && this.b != null) {
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
   public float a(iz $$0, dcc $$1) {
      return diz.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(btb<ckl> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmy $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbl {
      @Nullable
      private je i;
      private boolean j;

      public a(ckl $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            azh $$0 = this.b.el();
            if (this.b.dP().ab().b(dbv.c) && $$0.a(b(10)) == 0) {
               this.i = je.b($$0);
               iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               dsd $$2 = this.b.dP().a_($$1);
               if (diz.m($$2)) {
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
            dca $$0 = this.b.dP();
            iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            dsd $$2 = $$0.a_($$1);
            if (diz.m($$2)) {
               $$0.a($$1, diz.n($$2), 3);
               this.b.R();
               this.b.ao();
            }
         }
      }
   }

   static class b extends cao {
      private final ckl a;
      private int b;

      public b(ckl $$0) {
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
            dbz $$0 = this.a.dP();
            azh $$1 = this.a.el();
            iz $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iz $$6 = $$2.b($$4, $$3, $$5);
                     dsd $$7 = $$0.a_($$6);
                     dfa $$8 = $$7.b();
                     if ($$8 instanceof diz) {
                        if ($$0.ab().b(dbv.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((diz)$$8).o($$0.a_($$6)), 3);
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
