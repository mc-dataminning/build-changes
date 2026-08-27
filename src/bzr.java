import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzr extends bzk {
   @Nullable
   private bzr.b b;

   public bzr(biw<? extends bzr> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new bzr.b(this);
      this.bO.a(1, new bpx(this));
      this.bO.a(1, new bps(this, this.dL()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bqn(this, 1.0, false));
      this.bO.a(5, new bzr.a(this));
      this.bP.a(1, new brv(this).a());
      this.bP.a(2, new brw<>(this, cbw.class, true));
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.13F;
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 8.0).a(bko.d, 0.25).a(bko.f, 1.0);
   }

   @Override
   protected bis.b aU() {
      return bis.b.c;
   }

   @Override
   protected ape w() {
      return apf.vk;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.vm;
   }

   @Override
   protected ape l_() {
      return apf.vl;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.vn, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(apw.x)) && this.b != null) {
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
   public float a(gw $$0, cqa $$1) {
      return cwt.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(biw<bzr> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cbw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bjn eR() {
      return bjn.c;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bra {
      @Nullable
      private hc i;
      private boolean j;

      public a(bzr $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.L().l()) {
            return false;
         } else {
            ase $$0 = this.b.ef();
            if (this.b.dL().X().b(cpt.c) && $$0.a(b(10)) == 0) {
               this.i = hc.b($$0);
               gw $$1 = gw.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
               dfl $$2 = this.b.dL().a_($$1);
               if (cwt.h($$2)) {
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
            cpy $$0 = this.b.dL();
            gw $$1 = gw.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
            dfl $$2 = $$0.a_($$1);
            if (cwt.h($$2)) {
               $$0.a($$1, cwt.n($$2), 3);
               this.b.Q();
               this.b.ak();
            }
         }
      }
   }

   static class b extends bqd {
      private final bzr a;
      private int b;

      public b(bzr $$0) {
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
            cpx $$0 = this.a.dL();
            ase $$1 = this.a.ef();
            gw $$2 = this.a.dl();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gw $$6 = $$2.b($$4, $$3, $$5);
                     dfl $$7 = $$0.a_($$6);
                     csx $$8 = $$7.b();
                     if ($$8 instanceof cwt) {
                        if ($$0.X().b(cpt.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cwt)$$8).o($$0.a_($$6)), 3);
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
