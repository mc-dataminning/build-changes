import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccq extends ccj {
   @Nullable
   private ccq.b b;

   public ccq(blt<? extends ccq> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new ccq.b(this);
      this.bO.a(1, new bsv(this));
      this.bO.a(1, new bsq(this, this.dM()));
      this.bO.a(3, this.b);
      this.bO.a(4, new btl(this, 1.0, false));
      this.bO.a(5, new ccq.a(this));
      this.bP.a(1, new but(this).a());
      this.bP.a(2, new buu<>(this, cfb.class, true));
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 0.13F;
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 8.0).a(bnl.m, 0.25).a(bnl.c, 1.0);
   }

   @Override
   protected blp.b aW() {
      return blp.b.c;
   }

   @Override
   protected arl y() {
      return arm.wa;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.wc;
   }

   @Override
   protected arl n_() {
      return arm.wb;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.wd, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(asd.y)) && this.b != null) {
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
   public float a(hx $$0, ctl $$1) {
      return dah.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(blt<ccq> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfb $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmk eS() {
      return bmk.c;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a extends bty {
      @Nullable
      private ic i;
      private boolean j;

      public a(ccq $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            aup $$0 = this.b.eg();
            if (this.b.dM().Z().b(cte.c) && $$0.a(b(10)) == 0) {
               this.i = ic.b($$0);
               hx $$1 = hx.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dja $$2 = this.b.dM().a_($$1);
               if (dah.h($$2)) {
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
            ctj $$0 = this.b.dM();
            hx $$1 = hx.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dja $$2 = $$0.a_($$1);
            if (dah.h($$2)) {
               $$0.a($$1, dah.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends btb {
      private final ccq a;
      private int b;

      public b(ccq $$0) {
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
            cti $$0 = this.a.dM();
            aup $$1 = this.a.eg();
            hx $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hx $$6 = $$2.b($$4, $$3, $$5);
                     dja $$7 = $$0.a_($$6);
                     cwj $$8 = $$7.b();
                     if ($$8 instanceof dah) {
                        if ($$0.Z().b(cte.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dah)$$8).o($$0.a_($$6)), 3);
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
