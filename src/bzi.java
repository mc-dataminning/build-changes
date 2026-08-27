import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzi extends bzb {
   @Nullable
   private bzi.b b;

   public bzi(bim<? extends bzi> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.b = new bzi.b(this);
      this.bO.a(1, new bpo(this));
      this.bO.a(1, new bpj(this, this.dK()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bqe(this, 1.0, false));
      this.bO.a(5, new bzi.a(this));
      this.bP.a(1, new brm(this).a());
      this.bP.a(2, new brn<>(this, cbn.class, true));
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.13F;
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.a, 8.0).a(bkf.d, 0.25).a(bkf.f, 1.0);
   }

   @Override
   protected bii.b aU() {
      return bii.b.c;
   }

   @Override
   protected aov r() {
      return aow.vk;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.vm;
   }

   @Override
   protected aov h_() {
      return aow.vl;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.vn, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(apn.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dA();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      return cwi.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bim<bzi> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbn $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjd eQ() {
      return bjd.c;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bqr {
      @Nullable
      private ha i;
      private boolean j;

      public a(bzi $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.j() != null) {
            return false;
         } else if (!this.b.H().l()) {
            return false;
         } else {
            aru $$0 = this.b.ee();
            if (this.b.dK().X().b(cpi.c) && $$0.a(b(10)) == 0) {
               this.i = ha.b($$0);
               gu $$1 = gu.a(this.b.dp(), this.b.dr() + 0.5, this.b.dv()).a(this.i);
               dfa $$2 = this.b.dK().a_($$1);
               if (cwi.h($$2)) {
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
            cpn $$0 = this.b.dK();
            gu $$1 = gu.a(this.b.dp(), this.b.dr() + 0.5, this.b.dv()).a(this.i);
            dfa $$2 = $$0.a_($$1);
            if (cwi.h($$2)) {
               $$0.a($$1, cwi.n($$2), 3);
               this.b.N();
               this.b.ak();
            }
         }
      }
   }

   static class b extends bpu {
      private final bzi a;
      private int b;

      public b(bzi $$0) {
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
            cpm $$0 = this.a.dK();
            aru $$1 = this.a.ee();
            gu $$2 = this.a.dk();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gu $$6 = $$2.b($$4, $$3, $$5);
                     dfa $$7 = $$0.a_($$6);
                     csm $$8 = $$7.b();
                     if ($$8 instanceof cwi) {
                        if ($$0.X().b(cpi.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cwi)$$8).o($$0.a_($$6)), 3);
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
