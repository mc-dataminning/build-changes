import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjx extends cjq {
   @Nullable
   private cjx.b b;

   public cjx(bsm<? extends cjx> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cjx.b(this);
      this.bU.a(1, new bzt(this));
      this.bU.a(1, new bzo(this, this.dQ()));
      this.bU.a(3, this.b);
      this.bU.a(4, new caj(this, 1.0, false));
      this.bU.a(5, new cjx.a(this));
      this.bV.a(1, new cbr(this).a());
      this.bV.a(2, new cbs<>(this, cmk.class, true));
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 8.0).a(buj.v, 0.25).a(buj.c, 1.0);
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   protected avg v() {
      return avh.wX;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.wZ;
   }

   @Override
   protected avg o_() {
      return avh.wY;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.xa, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
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
      this.aY = this.dG();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return djg.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsm<cjx> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmk $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends caw {
      @Nullable
      private jf i;
      private boolean j;

      public a(cjx $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            ayo $$0 = this.b.dT();
            if (this.b.dQ().ab().b(dcb.c) && $$0.a(b(10)) == 0) {
               this.i = jf.b($$0);
               ja $$1 = ja.a(this.b.dv(), this.b.dx() + 0.5, this.b.dB()).a(this.i);
               dsk $$2 = this.b.dQ().a_($$1);
               if (djg.m($$2)) {
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
            dcg $$0 = this.b.dQ();
            ja $$1 = ja.a(this.b.dv(), this.b.dx() + 0.5, this.b.dB()).a(this.i);
            dsk $$2 = $$0.a_($$1);
            if (djg.m($$2)) {
               $$0.a($$1, djg.n($$2), 3);
               this.b.R();
               this.b.ap();
            }
         }
      }
   }

   static class b extends bzz {
      private final cjx a;
      private int b;

      public b(cjx $$0) {
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
            dcf $$0 = this.a.dQ();
            ayo $$1 = this.a.dT();
            ja $$2 = this.a.dq();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ja $$6 = $$2.b($$4, $$3, $$5);
                     dsk $$7 = $$0.a_($$6);
                     dfh $$8 = $$7.b();
                     if ($$8 instanceof djg) {
                        if ($$0.ab().b(dcb.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((djg)$$8).o($$0.a_($$6)), 3);
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
