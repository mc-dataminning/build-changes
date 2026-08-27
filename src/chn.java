import java.util.EnumSet;
import javax.annotation.Nullable;

public class chn extends chg {
   @Nullable
   private chn.b b;

   public chn(bqg<? extends chn> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new chn.b(this);
      this.bR.a(1, new bxk(this));
      this.bR.a(1, new bxf(this, this.dM()));
      this.bR.a(3, this.b);
      this.bR.a(4, new bya(this, 1.0, false));
      this.bR.a(5, new chn.a(this));
      this.bS.a(1, new bzi(this).a());
      this.bS.a(2, new bzj<>(this, cka.class, true));
   }

   public static brz.a r() {
      return chg.gt().a(bsa.q, 8.0).a(bsa.r, 0.25).a(bsa.c, 1.0);
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.c;
   }

   @Override
   protected aun v() {
      return auo.wB;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.wD;
   }

   @Override
   protected aun o_() {
      return auo.wC;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.wE, 0.15F, 1.0F);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(avg.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aX = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(id $$0, czj $$1) {
      return dgf.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bqg<chn> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cka $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends byn {
      @Nullable
      private ij i;
      private boolean j;

      public a(chn $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            axt $$0 = this.b.ei();
            if (this.b.dM().aa().b(czc.c) && $$0.a(b(10)) == 0) {
               this.i = ij.b($$0);
               id $$1 = id.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dpi $$2 = this.b.dM().a_($$1);
               if (dgf.m($$2)) {
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
            czh $$0 = this.b.dM();
            id $$1 = id.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dpi $$2 = $$0.a_($$1);
            if (dgf.m($$2)) {
               $$0.a($$1, dgf.n($$2), 3);
               this.b.Q();
               this.b.am();
            }
         }
      }
   }

   static class b extends bxq {
      private final chn a;
      private int b;

      public b(chn $$0) {
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
            czg $$0 = this.a.dM();
            axt $$1 = this.a.ei();
            id $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     id $$6 = $$2.b($$4, $$3, $$5);
                     dpi $$7 = $$0.a_($$6);
                     dch $$8 = $$7.b();
                     if ($$8 instanceof dgf) {
                        if ($$0.aa().b(czc.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dgf)$$8).o($$0.a_($$6)), 3);
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
