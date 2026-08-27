import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cck extends cco {
   protected static final int c = 80;
   private static final agm<Boolean> b = agp.a(cck.class, ago.k);
   private static final agm<Integer> e = agp.a(cck.class, ago.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bmk bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bud d;

   public cck(bly<? extends cck> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(efb.j, 0.0F);
      this.bL = new cck.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void B() {
      btu $$0 = new btu(this, 1.0);
      this.d = new bud(this, 1.0, 80);
      this.bO.a(4, new cck.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bto(this, cfh.class, 8.0F));
      this.bO.a(8, new bto(this, cck.class, 12.0F, 0.01F));
      this.bO.a(9, new bub(this));
      this.d.a(EnumSet.of(btg.a.a, btg.a.b));
      $$0.a(EnumSet.of(btg.a.a, btg.a.b));
      this.bP.a(1, new buz<>(this, bmk.class, 10, true, false, new cck.b(this)));
   }

   public static bnp.a ge() {
      return cco.gk().a(bnq.c, 6.0).a(bnq.m, 0.5).a(bnq.g, 16.0).a(bnq.l, 30.0);
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvw(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public bmp eS() {
      return bmp.e;
   }

   public boolean gf() {
      return this.an.b(b);
   }

   void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int w() {
      return 80;
   }

   void b(int $$0) {
      this.an.b(e, $$0);
   }

   public boolean gg() {
      return this.an.b(e) != 0;
   }

   @Nullable
   public bmk gh() {
      if (!this.gg()) {
         return null;
      } else if (this.dM().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            blu $$0 = this.dM().a(this.an.b(e));
            if ($$0 instanceof bmk) {
               this.bY = (bmk)$$0;
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
   public void a(agm<?> $$0) {
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
   protected arq y() {
      return this.bc() ? arr.kM : arr.kN;
   }

   @Override
   protected arq d(bks $$0) {
      return this.bc() ? arr.kS : arr.kT;
   }

   @Override
   protected arq n_() {
      return this.bc() ? arr.kP : arr.kQ;
   }

   @Override
   protected blu.b aW() {
      return blu.b.c;
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      return $$1.b_($$0).a(asl.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bx()) {
         if (this.dM().B) {
            this.bU = this.bT;
            if (!this.aZ()) {
               this.bV = 2.0F;
               els $$0 = this.dp();
               if ($$0.d > 0.0 && this.ca && !this.aU()) {
                  this.dM().a(this.dr(), this.dt(), this.dx(), this.A(), this.db(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dM().a(this.dm().d(), this);
            } else if (this.gf()) {
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
               this.bW = this.ag.i();
            } else if (this.gf()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.gf() && this.aZ()) {
               els $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dM().a(jx.e, this.d(0.5) - $$1.c * 1.5, this.du() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gg()) {
               if (this.bZ < this.w()) {
                  this.bZ++;
               }

               bmk $$3 = this.gh();
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
                  double $$9 = this.ag.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ag.j() * (1.7 - $$4);
                     this.dM().a(jx.e, this.dr() + $$5 * $$9, this.dv() + $$6 * $$9, this.dx() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bc()) {
            this.j(300);
         } else if (this.aC()) {
            this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gg()) {
            this.r(this.aW);
         }
      }

      super.d_();
   }

   protected arq A() {
      return arr.kR;
   }

   public float E(float $$0) {
      return aun.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return aun.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.w();
   }

   public float gi() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(ctr $$0) {
      return $$0.f(this);
   }

   public static boolean b(bly<? extends cck> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bjx.a && (bmo.a($$2) || $$1.b_($$3).a(asl.a)) && $$1.b_($$3.d()).a(asl.a);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.dM().B) {
         return false;
      } else {
         if (!this.gf() && !$$0.a(asi.x) && !$$0.a(bkv.L) && $$0.c() instanceof bmk $$2) {
            $$2.a(this.dN().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void a(els $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bmq.a, this.dp());
         this.g(this.dp().a(0.9));
         if (!this.gf() && this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends btg {
      private final cck a;
      private int b;
      private final boolean c;

      public a(cck $$0) {
         this.a = $$0;
         this.c = $$0 instanceof ccd;
         this.a(EnumSet.of(btg.a.a, btg.a.b));
      }

      @Override
      public boolean a() {
         bmk $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((blu)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         bmk $$0 = this.a.q();
         if ($$0 != null) {
            this.a.I().a($$0, 90.0F, 90.0F);
         }

         this.a.au = true;
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
         bmk $$0 = this.a.q();
         if ($$0 != null) {
            this.a.N().n();
            this.a.I().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
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
                  if (this.a.dM().ak() == bjx.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dN().c(this.a, this.a), $$1);
                  $$0.a(this.a.dN().b((bmk)this.a), (float)this.a.b(bnq.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bmk> {
      private final cck a;

      public b(cck $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bmk $$0) {
         return ($$0 instanceof cfh || $$0 instanceof byw || $$0 instanceof bze) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bsj {
      private final cck l;

      public c(cck $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bsj.a.b && !this.l.N().l()) {
            els $$0 = new els(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(aun.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.b(bnq.m));
            float $$7 = aun.i(0.125F, this.l.ff(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dp().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bsi $$12 = this.l.I();
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

            this.l.I().a(aun.d(0.125, $$16, $$13), aun.d(0.125, $$17, $$14), aun.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
