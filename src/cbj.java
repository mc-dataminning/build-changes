import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbj extends cbn {
   protected static final int c = 80;
   private static final afs<Boolean> b = afv.a(cbj.class, afu.k);
   private static final afs<Integer> e = afv.a(cbj.class, afu.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bll bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected btd d;

   public cbj(bkz<? extends cbj> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(edi.j, 0.0F);
      this.bL = new cbj.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void B() {
      bsu $$0 = new bsu(this, 1.0);
      this.d = new btd(this, 1.0, 80);
      this.bO.a(4, new cbj.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bso(this, cdz.class, 8.0F));
      this.bO.a(8, new bso(this, cbj.class, 12.0F, 0.01F));
      this.bO.a(9, new btb(this));
      this.d.a(EnumSet.of(bsg.a.a, bsg.a.b));
      $$0.a(EnumSet.of(bsg.a.a, bsg.a.b));
      this.bP.a(1, new btz<>(this, bll.class, 10, true, false, new cbj.b(this)));
   }

   public static bmq.a gf() {
      return cbn.gl().a(bmr.c, 6.0).a(bmr.m, 0.5).a(bmr.g, 16.0).a(bmr.l, 30.0);
   }

   @Override
   protected buu b(csf $$0) {
      return new buw(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public blq eT() {
      return blq.e;
   }

   public boolean gg() {
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

   public boolean gh() {
      return this.an.b(e) != 0;
   }

   @Nullable
   public bll gi() {
      if (!this.gh()) {
         return null;
      } else if (this.dN().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            bkv $$0 = this.dN().a(this.an.b(e));
            if ($$0 instanceof bll) {
               this.bY = (bll)$$0;
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
   public void a(afs<?> $$0) {
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
   protected aqu y() {
      return this.bc() ? aqv.kD : aqv.kE;
   }

   @Override
   protected aqu d(bjt $$0) {
      return this.bc() ? aqv.kJ : aqv.kK;
   }

   @Override
   protected aqu n_() {
      return this.bc() ? aqv.kG : aqv.kH;
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.c;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return $$1.b_($$0).a(arp.a) ? 10.0F + $$1.v($$0) : super.a($$0, $$1);
   }

   @Override
   public void d_() {
      if (this.bx()) {
         if (this.dN().B) {
            this.bU = this.bT;
            if (!this.aZ()) {
               this.bV = 2.0F;
               ejz $$0 = this.dq();
               if ($$0.d > 0.0 && this.ca && !this.aU()) {
                  this.dN().a(this.ds(), this.du(), this.dy(), this.A(), this.dc(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dN().a(this.dn().d(), this);
            } else if (this.gg()) {
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
            } else if (this.gg()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.gg() && this.aZ()) {
               ejz $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dN().a(jw.e, this.d(0.5) - $$1.c * 1.5, this.dv() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gh()) {
               if (this.bZ < this.w()) {
                  this.bZ++;
               }

               bll $$3 = this.gi();
               if ($$3 != null) {
                  this.I().a($$3, 90.0F, 90.0F);
                  this.I().a();
                  double $$4 = (double)this.G(0.0F);
                  double $$5 = $$3.ds() - this.ds();
                  double $$6 = $$3.e(0.5) - this.dw();
                  double $$7 = $$3.dy() - this.dy();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ag.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ag.j() * (1.7 - $$4);
                     this.dN().a(jw.e, this.ds() + $$5 * $$9, this.dw() + $$6 * $$9, this.dy() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.bc()) {
            this.j(300);
         } else if (this.aC()) {
            this.g(this.dq().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gh()) {
            this.r(this.aW);
         }
      }

      super.d_();
   }

   protected aqu A() {
      return aqv.kI;
   }

   public float E(float $$0) {
      return atq.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return atq.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.w();
   }

   public float gj() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this);
   }

   public static boolean b(bkz<? extends cbj> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return ($$4.a(20) == 0 || !$$1.u($$3)) && $$1.aj() != biy.a && ($$2 == blp.c || $$1.b_($$3).a(arp.a)) && $$1.b_($$3.d()).a(arp.a);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.dN().B) {
         return false;
      } else {
         if (!this.gg() && !$$0.a(arm.w) && !$$0.a(bjw.L) && $$0.c() instanceof bll $$2) {
            $$2.a(this.dO().d(this), 2.0F);
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
   public void a(ejz $$0) {
      if (this.cY() && this.aZ()) {
         this.a(0.1F, $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
         if (!this.gg() && this.q() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends bsg {
      private final cbj a;
      private int b;
      private final boolean c;

      public a(cbj $$0) {
         this.a = $$0;
         this.c = $$0 instanceof cbc;
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         bll $$0 = this.a.q();
         return $$0 != null && $$0.bx();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.q() != null && this.a.f((bkv)this.a.q()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.N().n();
         bll $$0 = this.a.q();
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
         bll $$0 = this.a.q();
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
                     this.a.dN().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.w()) {
                  float $$1 = 1.0F;
                  if (this.a.dN().aj() == biy.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dO().c(this.a, this.a), $$1);
                  $$0.a(this.a.dO().b((bll)this.a), (float)this.a.b(bmr.c));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bll> {
      private final cbj a;

      public b(cbj $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bll $$0) {
         return ($$0 instanceof cdz || $$0 instanceof bxv || $$0 instanceof byd) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends brj {
      private final cbj l;

      public c(cbj $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == brj.a.b && !this.l.N().l()) {
            ejz $$0 = new ejz(this.e - this.l.ds(), this.f - this.l.du(), this.g - this.l.dy());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(atq.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dD(), $$5, 90.0F));
            this.l.aU = this.l.dD();
            float $$6 = (float)(this.h * this.l.b(bmr.m));
            float $$7 = atq.i(0.125F, this.l.fg(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dD() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.aj()) * 0.75) * 0.05;
            this.l.g(this.l.dq().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bri $$12 = this.l.I();
            double $$13 = this.l.ds() + $$2 * 2.0;
            double $$14 = this.l.dw() + $$3 / $$1;
            double $$15 = this.l.dy() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.I().a(atq.d(0.125, $$16, $$13), atq.d(0.125, $$17, $$14), atq.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
