import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzb extends bin implements byr {
   public static final float b = 7.448451F;
   public static final int c = aro.f(24.166098F);
   private static final adx<Integer> d = aea.a(bzb.class, adz.b);
   ehf e = ehf.b;
   gv bS = gv.b;
   bzb.a bT = bzb.a.a;

   public bzb(bik<? extends bzb> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzb.g(this);
      this.bK = new bzb.f(this);
   }

   @Override
   public boolean aR() {
      return (this.q() + this.ah) % c == 0;
   }

   @Override
   protected boq B() {
      return new bzb.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bzb.c());
      this.bO.a(2, new bzb.i());
      this.bO.a(3, new bzb.e());
      this.bP.a(1, new bzb.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, aro.a($$0, 0, 64));
   }

   private void t() {
      this.e_();
      this.a(bkd.f).a((double)(6 + this.p()));
   }

   public int p() {
      return this.an.b(d);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(adx<?> $$0) {
      if (d.equals($$0)) {
         this.t();
      }

      super.a($$0);
   }

   public int q() {
      return this.ah() * 3;
   }

   @Override
   protected boolean S() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B) {
         float $$0 = aro.b((float)(this.q() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aro.b((float)(this.q() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aou.rL, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.p();
         float $$3 = aro.b(this.dA() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = aro.a(this.dA() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dK().a(iw.U, this.dp() + (double)$$3, this.dr() + (double)$$5, this.dv() + (double)$$4, 0.0, 0.0, 0.0);
         this.dK().a(iw.U, this.dp() - (double)$$3, this.dr() + (double)$$5, this.dv() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void b_() {
      if (this.bv() && this.fT()) {
         this.g(8);
      }

      super.b_();
   }

   @Override
   protected void V() {
      super.V();
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.bS = this.dk().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gv($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.p());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aov da() {
      return aov.f;
   }

   @Override
   protected aot r() {
      return aou.rI;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.rM;
   }

   @Override
   protected aot h_() {
      return aou.rK;
   }

   @Override
   public bjb eQ() {
      return bjb.b;
   }

   @Override
   protected float eU() {
      return 1.0F;
   }

   @Override
   public boolean a(bik<?> $$0) {
      return true;
   }

   @Override
   public bih a(bji $$0) {
      int $$1 = this.p();
      bih $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(big $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bps {
      private final btj b = btj.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cbl> $$0 = bzb.this.dK().a(this.b, bzb.this, bzb.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(big::dr).reversed());

               for (cbl $$1 : $$0) {
                  if (bzb.this.a($$1, btj.a)) {
                     bzb.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         biw $$0 = bzb.this.j();
         return $$0 != null ? bzb.this.a($$0, btj.a) : false;
      }
   }

   class c extends bps {
      private int b;

      @Override
      public boolean a() {
         biw $$0 = bzb.this.j();
         return $$0 != null ? bzb.this.a($$0, btj.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzb.this.bT = bzb.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzb.this.bS = bzb.this.dK().a(dkh.a.e, bzb.this.bS).b(10 + bzb.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzb.this.bT == bzb.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzb.this.bT = bzb.a.b;
               this.h();
               this.b = this.a((8 + bzb.this.ag.a(4)) * 20);
               bzb.this.a(aou.rN, 10.0F, 0.95F + bzb.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzb.this.bS = bzb.this.j().dk().b(20 + bzb.this.ag.a(20));
         if (bzb.this.bS.v() < bzb.this.dK().t_()) {
            bzb.this.bS = new gv(bzb.this.bS.u(), bzb.this.dK().t_() + 1, bzb.this.bS.w());
         }
      }
   }

   class d extends boq {
      public d(biy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzb.this.aW = bzb.this.aU;
         bzb.this.aU = bzb.this.dA();
      }
   }

   class e extends bzb.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzb.this.j() == null || bzb.this.bT == bzb.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzb.this.ag.i() * 10.0F;
         this.e = -4.0F + bzb.this.ag.i() * 9.0F;
         this.f = bzb.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzb.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzb.this.ag.i() * 9.0F;
         }

         if (bzb.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzb.this.ag.a(this.a(450)) == 0) {
            this.c = bzb.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzb.this.e.d < bzb.this.dr() && !bzb.this.dK().t(bzb.this.dk().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzb.this.e.d > bzb.this.dr() && !bzb.this.dK().t(bzb.this.dk().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gv.b.equals(bzb.this.bS)) {
            bzb.this.bS = bzb.this.dk();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzb.this.e = ehf.a(bzb.this.bS).b((double)(this.d * aro.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aro.a(this.c)));
      }
   }

   class f extends bou {
      public f(biy $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bov {
      private float m = 0.1F;

      public g(biy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzb.this.P) {
            bzb.this.r(bzb.this.dA() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzb.this.e.c - bzb.this.dp();
         double $$1 = bzb.this.e.d - bzb.this.dr();
         double $$2 = bzb.this.e.e - bzb.this.dv();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzb.this.dA();
            float $$7 = (float)aro.d($$2, $$0);
            float $$8 = aro.g(bzb.this.dA() + 90.0F);
            float $$9 = aro.g($$7 * (180.0F / (float)Math.PI));
            bzb.this.r(aro.e($$8, $$9, 4.0F) - 90.0F);
            bzb.this.aU = bzb.this.dA();
            if (aro.d($$6, bzb.this.dA()) < 3.0F) {
               this.m = aro.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aro.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aro.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzb.this.s($$10);
            float $$11 = bzb.this.dA() + 90.0F;
            double $$12 = (double)(this.m * aro.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aro.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aro.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehf $$15 = bzb.this.dn();
            bzb.this.f($$15.e(new ehf($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bps {
      public h() {
         this.a(EnumSet.of(bps.a.a));
      }

      protected boolean h() {
         return bzb.this.e.c(bzb.this.dp(), bzb.this.dr(), bzb.this.dv()) < 4.0;
      }
   }

   class i extends bzb.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzb.this.j() != null && bzb.this.bT == bzb.a.b;
      }

      @Override
      public boolean b() {
         biw $$0 = bzb.this.j();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cbl $$1 && ($$0.G_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzb.this.ah > this.e) {
                  this.e = bzb.this.ah + 20;
                  List<bul> $$2 = bzb.this.dK().a(bul.class, bzb.this.cG().g(16.0), bij.a);

                  for (bul $$3 : $$2) {
                     $$3.gk();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
         bzb.this.h(null);
         bzb.this.bT = bzb.a.a;
      }

      @Override
      public void e() {
         biw $$0 = bzb.this.j();
         if ($$0 != null) {
            bzb.this.e = new ehf($$0.dp(), $$0.e(0.5), $$0.dv());
            if (bzb.this.cG().g(0.2F).c($$0.cG())) {
               bzb.this.C($$0);
               bzb.this.bT = bzb.a.a;
               if (!bzb.this.aS()) {
                  bzb.this.dK().c(1039, bzb.this.dk(), 0);
               }
            } else if (bzb.this.P || bzb.this.aK > 0) {
               bzb.this.bT = bzb.a.a;
            }
         }
      }
   }
}
