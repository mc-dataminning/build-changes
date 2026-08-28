import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjy extends cjr {
   @Nullable
   private cjy.b b;

   public cjy(bsn<? extends cjy> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cjy.b(this);
      this.bU.a(1, new bzu(this));
      this.bU.a(1, new bzp(this, this.dR()));
      this.bU.a(3, this.b);
      this.bU.a(4, new cak(this, 1.0, false));
      this.bU.a(5, new cjy.a(this));
      this.bV.a(1, new cbs(this).a());
      this.bV.a(2, new cbt<>(this, cml.class, true));
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 8.0).a(buk.v, 0.25).a(buk.c, 1.0);
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   protected avg v() {
      return avh.wX;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.wZ;
   }

   @Override
   protected avg n_() {
      return avh.wY;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.xa, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
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
      this.aZ = this.dH();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return djh.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsn<cjy> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cml $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cax {
      @Nullable
      private jf i;
      private boolean j;

      public a(cjy $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.J().l()) {
            return false;
         } else {
            ayo $$0 = this.b.dU();
            if (this.b.dR().ab().b(dcc.c) && $$0.a(b(10)) == 0) {
               this.i = jf.b($$0);
               ja $$1 = ja.a(this.b.dw(), this.b.dy() + 0.5, this.b.dC()).a(this.i);
               dsl $$2 = this.b.dR().a_($$1);
               if (djh.m($$2)) {
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
            dch $$0 = this.b.dR();
            ja $$1 = ja.a(this.b.dw(), this.b.dy() + 0.5, this.b.dC()).a(this.i);
            dsl $$2 = $$0.a_($$1);
            if (djh.m($$2)) {
               $$0.a($$1, djh.n($$2), 3);
               this.b.R();
               this.b.aq();
            }
         }
      }
   }

   static class b extends caa {
      private final cjy a;
      private int b;

      public b(cjy $$0) {
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
            dcg $$0 = this.a.dR();
            ayo $$1 = this.a.dU();
            ja $$2 = this.a.dr();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ja $$6 = $$2.b($$4, $$3, $$5);
                     dsl $$7 = $$0.a_($$6);
                     dfi $$8 = $$7.b();
                     if ($$8 instanceof djh) {
                        if ($$0.ab().b(dcc.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((djh)$$8).o($$0.a_($$6)), 3);
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
