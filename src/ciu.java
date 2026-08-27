import java.util.EnumSet;
import javax.annotation.Nullable;

public class ciu extends cin {
   @Nullable
   private ciu.b b;

   public ciu(brn<? extends ciu> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new ciu.b(this);
      this.bS.a(1, new byr(this));
      this.bS.a(1, new bym(this, this.dN()));
      this.bS.a(3, this.b);
      this.bS.a(4, new bzh(this, 1.0, false));
      this.bS.a(5, new ciu.a(this));
      this.bT.a(1, new cap(this).a());
      this.bT.a(2, new caq<>(this, clh.class, true));
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 8.0).a(bth.r, 0.25).a(bth.c, 1.0);
   }

   @Override
   protected brh.b aZ() {
      return brh.b.c;
   }

   @Override
   protected avb v() {
      return avc.wJ;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.wL;
   }

   @Override
   protected avb o_() {
      return avc.wK;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.wM, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(avt.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aZ = this.dD();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(in $$0, dag $$1) {
      return dhd.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(brn<ciu> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         clh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends bzu {
      @Nullable
      private is i;
      private boolean j;

      public a(ciu $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            ayg $$0 = this.b.ej();
            if (this.b.dN().aa().b(czz.c) && $$0.a(b(10)) == 0) {
               this.i = is.b($$0);
               in $$1 = in.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
               dqh $$2 = this.b.dN().a_($$1);
               if (dhd.m($$2)) {
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
            dae $$0 = this.b.dN();
            in $$1 = in.a(this.b.ds(), this.b.du() + 0.5, this.b.dy()).a(this.i);
            dqh $$2 = $$0.a_($$1);
            if (dhd.m($$2)) {
               $$0.a($$1, dhd.n($$2), 3);
               this.b.Q();
               this.b.am();
            }
         }
      }
   }

   static class b extends byx {
      private final ciu a;
      private int b;

      public b(ciu $$0) {
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
            dad $$0 = this.a.dN();
            ayg $$1 = this.a.ej();
            in $$2 = this.a.dn();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     in $$6 = $$2.b($$4, $$3, $$5);
                     dqh $$7 = $$0.a_($$6);
                     dde $$8 = $$7.b();
                     if ($$8 instanceof dhd) {
                        if ($$0.aa().b(czz.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dhd)$$8).o($$0.a_($$6)), 3);
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
