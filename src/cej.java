import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cej extends cen {
   protected static final int c = 80;
   private static final aie<Boolean> b = aih.a(cej.class, aig.k);
   private static final aie<Integer> e = aih.a(cej.class, aig.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bog bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bvy d;

   public cej(bnu<? extends cej> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(eha.j, 0.0F);
      this.bL = new cej.c(this);
      this.bT = this.af.i();
      this.bU = this.bT;
   }

   @Override
   protected void B() {
      bvp $$0 = new bvp(this, 1.0);
      this.d = new bvy(this, 1.0, 80);
      this.bO.a(4, new cej.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bvj(this, chh.class, 8.0F));
      this.bO.a(8, new bvj(this, cej.class, 12.0F, 0.01F));
      this.bO.a(9, new bvw(this));
      this.d.a(EnumSet.of(bvb.a.a, bvb.a.b));
      $$0.a(EnumSet.of(bvb.a.a, bvb.a.b));
      this.bP.a(1, new bwu<>(this, bog.class, 10, true, false, new cej.b(this)));
   }

   public static bpk.a gg() {
      return cen.gm().a(bpl.c, 6.0).a(bpl.o, 0.5).a(bpl.i, 16.0).a(bpl.n, 30.0);
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxr(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
      this.am.a(e, 0);
   }

   public boolean gh() {
      return this.am.b(b);
   }

   void w(boolean $$0) {
      this.am.b(b, $$0);
   }

   public int w() {
      return 80;
   }

   void b(int $$0) {
      this.am.b(e, $$0);
   }

   public boolean gi() {
      return this.am.b(e) != 0;
   }

   @Nullable
   public bog gj() {
      if (!this.gi()) {
         return null;
      } else if (this.dM().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            bno $$0 = this.dM().a(this.am.b(e));
            if ($$0 instanceof bog) {
               this.bY = (bog)$$0;
               return this.bY;
            } else {
               return null;
            }
         }
      } else {
         return this.q();
      }
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.bZ = 0;
         this.bY = null;
      }
   }

   @Override
   public int Q() {
      return 160;
   }

   @Override
   protected atj y() {
      return this.bc() ? atk.lb : atk.lc;
   }

   @Override
   protected atj d(bmn $$0) {
      return this.bc() ? atk.lh : atk.li;
   }

   @Override
   protected atj n_() {
      return this.bc() ? atk.le : atk.lf;
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return $$1.b_($$0).a(aue.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bx()) {
         if (this.dM().B) {
            this.bU = this.bT;
            if (!this.aZ()) {
               this.bV = 2.0F;
               ens $$0 = this.dp();
               if ($$0.d > 0.0 && this.ca && !this.aU()) {
                  this.dM().a(this.dr(), this.dt(), this.dx(), this.A(), this.db(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dM().a(this.dm().d(), this);
            } else if (this.gh()) {
               if (this.bV < 0.5F) {
                  this.bV = 4.0F;
               } else {
                  this.bV = this.bV + (0.5F - this.bV) * 0.1F;
               }
            } else {
               this.bV = this.bV + (0.125F - this.bV) * 0.2F;
            }

            this.bT = this.bT + this.bV;
            this.bX = this.bW;
            if (!this.bc()) {
               this.bW = this.af.i();
            } else if (this.gh()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.gh() && this.aZ()) {
               ens $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dM().a(jz.e, this.d(0.5) - $$1.c * 1.5, this.du() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gi()) {
               if (this.bZ < this.w()) {
                  this.bZ++;
               }

               bog $$3 = this.gj();
               if ($$3 != null) {
                  this.I().a($$3, 90.0F, 90.0F);
                  this.I().a();
                  double $$4 = (double)this.G(0.0F);
                  double $$5 = $$3.dr() - this.dr();
                  double $$6 = $$3.e(0.5) - this.dv();
                  double $$7 = $$3.dx() - this.dx();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.af.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.af.j() * (1.7 - $$4);
                     this.dM().a(jz.e, this.dr() + $$5 * $$9, this.dv() + $$6 * $$9, this.dx() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bc()) {
            this.k(300);
         } else if (this.aC()) {
            this.g(this.dp().b((double)((this.af.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.af.i() * 360.0F);
            this.c(false);
            this.at = true;
         }

         if (this.gi()) {
            this.r(this.aW);
         }
      }

      super.d_();
   }

   protected atj A() {
      return atk.lg;
   }

   public float E(float $$0) {
      return awh.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return awh.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.w();
   }

   public float gk() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(cvq $$0) {
      return $$0.f(this);
   }

   public static boolean b(bnu<? extends cej> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != blr.a && (bok.a($$2) || $$1.b_($$3).a(aue.a)) && $$1.b_($$3.d()).a(aue.a);
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.dM().B) {
         return false;
      } else {
         if (!this.gh() && !$$0.a(aub.x) && !$$0.a(bmq.N) && $$0.c() instanceof bog $$2) {
            $$2.a(this.dN().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public void a(ens $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bol.a, this.dp());
         this.g(this.dp().a(0.9));
         if (!this.gh() && this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   static class a extends bvb {
      private final cej a;
      private int b;
      private final boolean c;

      public a(cej $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cec;
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
      }

      @Override
      public boolean a() {
         bog $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((bno)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         bog $$0 = this.a.q();
         if ($$0 != null) {
            this.a.I().a($$0, 90.0F, 90.0F);
         }

         this.a.at = true;
      }

      @Override
      public void d() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bog $$0 = this.a.q();
         if ($$0 != null) {
            this.a.N().n();
            this.a.I().a($$0, 90.0F, 90.0F);
            if (!this.a.D($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.aj());
                  if (!this.a.aU()) {
                     this.a.dM().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.w()) {
                  float $$1 = 1.0F;
                  if (this.a.dM().ak() == blr.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dN().c(this.a, (bno)this.a), $$1);
                  $$0.a(this.a.dN().b((bog)this.a), (float)this.a.g(bpl.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bog> {
      private final cej a;

      public b(cej $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bog $$0) {
         return ($$0 instanceof chh || $$0 instanceof cas || $$0 instanceof cbd) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bue {
      private final cej l;

      public c(cej $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bue.a.b && !this.l.N().l()) {
            ens $$0 = new ens(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(awh.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.g(bpl.o));
            float $$7 = awh.i(0.125F, this.l.ff(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ag + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ag + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dp().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bud $$12 = this.l.I();
            double $$13 = this.l.dr() + $$2 * 2.0;
            double $$14 = this.l.dv() + $$3 / $$1;
            double $$15 = this.l.dx() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.I().a(awh.d(0.125, $$16, $$13), awh.d(0.125, $$17, $$14), awh.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
