import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccl extends ccp {
   protected static final int c = 80;
   private static final agm<Boolean> b = agp.a(ccl.class, ago.k);
   private static final agm<Integer> e = agp.a(ccl.class, ago.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bml bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bue d;

   public ccl(blz<? extends ccl> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(efc.j, 0.0F);
      this.bL = new ccl.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void B() {
      btv $$0 = new btv(this, 1.0);
      this.d = new bue(this, 1.0, 80);
      this.bO.a(4, new ccl.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new btp(this, cfi.class, 8.0F));
      this.bO.a(8, new btp(this, ccl.class, 12.0F, 0.01F));
      this.bO.a(9, new buc(this));
      this.d.a(EnumSet.of(bth.a.a, bth.a.b));
      $$0.a(EnumSet.of(bth.a.a, bth.a.b));
      this.bP.a(1, new bva<>(this, bml.class, 10, true, false, new ccl.b(this)));
   }

   public static bnq.a ge() {
      return ccp.gk().a(bnr.c, 6.0).a(bnr.m, 0.5).a(bnr.g, 16.0).a(bnr.l, 30.0);
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bvx(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public bmq eS() {
      return bmq.e;
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
   public bml gh() {
      if (!this.gg()) {
         return null;
      } else if (this.dM().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            blv $$0 = this.dM().a(this.an.b(e));
            if ($$0 instanceof bml) {
               this.bY = (bml)$$0;
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
   protected arr y() {
      return this.bc() ? ars.kM : ars.kN;
   }

   @Override
   protected arr d(bkt $$0) {
      return this.bc() ? ars.kS : ars.kT;
   }

   @Override
   protected arr n_() {
      return this.bc() ? ars.kP : ars.kQ;
   }

   @Override
   protected blv.b aW() {
      return blv.b.c;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return $$1.b_($$0).a(asm.a) ? 10.0F + $$1.w($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bx()) {
         if (this.dM().B) {
            this.bU = this.bT;
            if (!this.aZ()) {
               this.bV = 2.0F;
               elt $$0 = this.dp();
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
               elt $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dM().a(jx.e, this.d(0.5) - $$1.c * 1.5, this.du() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gg()) {
               if (this.bZ < this.w()) {
                  this.bZ++;
               }

               bml $$3 = this.gh();
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

   protected arr A() {
      return ars.kR;
   }

   public float E(float $$0) {
      return auo.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return auo.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.w();
   }

   public float gi() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(cts $$0) {
      return $$0.f(this);
   }

   public static boolean b(blz<? extends ccl> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return ($$4.a(20) == 0 || !$$1.v($$3)) && $$1.ak() != bjy.a && (bmp.a($$2) || $$1.b_($$3).a(asm.a)) && $$1.b_($$3.d()).a(asm.a);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.dM().B) {
         return false;
      } else {
         if (!this.gf() && !$$0.a(asj.x) && !$$0.a(bkw.L) && $$0.c() instanceof bml $$2) {
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
   public void a(elt $$0) {
      if (this.cX() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(bmr.a, this.dp());
         this.g(this.dp().a(0.9));
         if (!this.gf() && this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends bth {
      private final ccl a;
      private int b;
      private final boolean c;

      public a(ccl $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cce;
         this.a(EnumSet.of(bth.a.a, bth.a.b));
      }

      @Override
      public boolean a() {
         bml $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((blv)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         bml $$0 = this.a.q();
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
         bml $$0 = this.a.q();
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
                  if (this.a.dM().ak() == bjy.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dN().c(this.a, this.a), $$1);
                  $$0.a(this.a.dN().b((bml)this.a), (float)this.a.b(bnr.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bml> {
      private final ccl a;

      public b(ccl $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bml $$0) {
         return ($$0 instanceof cfi || $$0 instanceof byx || $$0 instanceof bzf) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bsk {
      private final ccl l;

      public c(ccl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bsk.a.b && !this.l.N().l()) {
            elt $$0 = new elt(this.e - this.l.dr(), this.f - this.l.dt(), this.g - this.l.dx());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(auo.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.b(bnr.m));
            float $$7 = auo.i(0.125F, this.l.ff(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dC() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dp().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bsj $$12 = this.l.I();
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

            this.l.I().a(auo.d(0.125, $$16, $$13), auo.d(0.125, $$17, $$14), auo.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
