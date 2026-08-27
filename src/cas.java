import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cas extends cal {
   @Nullable
   private cas.b b;

   public cas(bjx<? extends cas> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cas.b(this);
      this.bO.a(1, new bqy(this));
      this.bO.a(1, new bqt(this, this.dL()));
      this.bO.a(3, this.b);
      this.bO.a(4, new bro(this, 1.0, false));
      this.bO.a(5, new cas.a(this));
      this.bP.a(1, new bsw(this).a());
      this.bP.a(2, new bsx<>(this, ccx.class, true));
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.13F;
   }

   public static blo.a s() {
      return cal.gk().a(blp.l, 8.0).a(blp.m, 0.25).a(blp.c, 1.0);
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.c;
   }

   @Override
   protected aqc w() {
      return aqd.vm;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.vo;
   }

   @Override
   protected aqc m_() {
      return aqd.vn;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.vp, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(aqu.x)) && this.b != null) {
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
   public float a(ht $$0, crc $$1) {
      return cxx.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bjx<cas> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         ccx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bko eR() {
      return bko.c;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bsb {
      @Nullable
      private hx i;
      private boolean j;

      public a(cas $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.L().l()) {
            return false;
         } else {
            ate $$0 = this.b.ef();
            if (this.b.dL().X().b(cqv.c) && $$0.a(b(10)) == 0) {
               this.i = hx.b($$0);
               ht $$1 = ht.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
               dgb $$2 = this.b.dL().a_($$1);
               if (cxx.h($$2)) {
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
            cra $$0 = this.b.dL();
            ht $$1 = ht.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
            dgb $$2 = $$0.a_($$1);
            if (cxx.h($$2)) {
               $$0.a($$1, cxx.n($$2), 3);
               this.b.Q();
               this.b.ak();
            }
         }
      }
   }

   static class b extends bre {
      private final cas a;
      private int b;

      public b(cas $$0) {
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
            cqz $$0 = this.a.dL();
            ate $$1 = this.a.ef();
            ht $$2 = this.a.dl();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ht $$6 = $$2.b($$4, $$3, $$5);
                     dgb $$7 = $$0.a_($$6);
                     cua $$8 = $$7.b();
                     if ($$8 instanceof cxx) {
                        if ($$0.X().b(cqv.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cxx)$$8).o($$0.a_($$6)), 3);
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
