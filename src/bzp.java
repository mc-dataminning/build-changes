import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzp extends bzi {
   @Nullable
   private bzp.b b;

   public bzp(biu<? extends bzp> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new bzp.b(this);
      this.bO.a(1, new bpv(this));
      this.bO.a(1, new bpq(this, this.dL()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bql(this, 1.0, false));
      this.bO.a(5, new bzp.a(this));
      this.bP.a(1, new brt(this).a());
      this.bP.a(2, new bru<>(this, cbu.class, true));
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.13F;
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 8.0).a(bkm.d, 0.25).a(bkm.f, 1.0);
   }

   @Override
   protected biq.b aV() {
      return biq.b.c;
   }

   @Override
   protected apd w() {
      return ape.vk;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.vm;
   }

   @Override
   protected apd l_() {
      return ape.vl;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.vn, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(apv.x)) && this.b != null) {
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
   public float a(gw $$0, cpy $$1) {
      return cwr.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(biu<bzp> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjl eR() {
      return bjl.c;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bqy {
      @Nullable
      private hc i;
      private boolean j;

      public a(bzp $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.L().l()) {
            return false;
         } else {
            asc $$0 = this.b.ef();
            if (this.b.dL().X().b(cpr.c) && $$0.a(b(10)) == 0) {
               this.i = hc.b($$0);
               gw $$1 = gw.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
               dfj $$2 = this.b.dL().a_($$1);
               if (cwr.h($$2)) {
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
            cpw $$0 = this.b.dL();
            gw $$1 = gw.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
            dfj $$2 = $$0.a_($$1);
            if (cwr.h($$2)) {
               $$0.a($$1, cwr.n($$2), 3);
               this.b.Q();
               this.b.al();
            }
         }
      }
   }

   static class b extends bqb {
      private final bzp a;
      private int b;

      public b(bzp $$0) {
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
            cpv $$0 = this.a.dL();
            asc $$1 = this.a.ef();
            gw $$2 = this.a.dl();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gw $$6 = $$2.b($$4, $$3, $$5);
                     dfj $$7 = $$0.a_($$6);
                     csv $$8 = $$7.b();
                     if ($$8 instanceof cwr) {
                        if ($$0.X().b(cpr.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cwr)$$8).o($$0.a_($$6)), 3);
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
