import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdd extends ccw {
   @Nullable
   private cdd.b b;

   public cdd(bmc<? extends cdd> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new cdd.b(this);
      this.bP.a(1, new bte(this));
      this.bP.a(1, new bsz(this, this.dL()));
      this.bP.a(3, this.b);
      this.bP.a(4, new btu(this, 1.0, false));
      this.bP.a(5, new cdd.a(this));
      this.bQ.a(1, new bvc(this).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, true));
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 8.0).a(bnu.o, 0.25).a(bnu.c, 1.0);
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   protected ars y() {
      return art.wp;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.wr;
   }

   @Override
   protected ars n_() {
      return art.wq;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.ws, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(ask.y)) && this.b != null) {
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
   public float a(hx $$0, cua $$1) {
      return daw.h($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bmc<cdd> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfq $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmt eS() {
      return bmt.c;
   }

   static class a extends buh {
      @Nullable
      private ic i;
      private boolean j;

      public a(cdd $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.q() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            auw $$0 = this.b.eg();
            if (this.b.dL().Z().b(ctt.c) && $$0.a(b(10)) == 0) {
               this.i = ic.b($$0);
               hx $$1 = hx.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
               djp $$2 = this.b.dL().a_($$1);
               if (daw.h($$2)) {
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
            cty $$0 = this.b.dL();
            hx $$1 = hx.a(this.b.dq(), this.b.ds() + 0.5, this.b.dw()).a(this.i);
            djp $$2 = $$0.a_($$1);
            if (daw.h($$2)) {
               $$0.a($$1, daw.n($$2), 3);
               this.b.S();
               this.b.am();
            }
         }
      }
   }

   static class b extends btk {
      private final cdd a;
      private int b;

      public b(cdd $$0) {
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
            ctx $$0 = this.a.dL();
            auw $$1 = this.a.eg();
            hx $$2 = this.a.dl();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     hx $$6 = $$2.b($$4, $$3, $$5);
                     djp $$7 = $$0.a_($$6);
                     cwy $$8 = $$7.b();
                     if ($$8 instanceof daw) {
                        if ($$0.Z().b(ctt.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((daw)$$8).o($$0.a_($$6)), 3);
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
