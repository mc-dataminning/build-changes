import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzd extends bip implements byt {
   public static final float b = 7.448451F;
   public static final int c = arp.f(24.166098F);
   private static final adz<Integer> d = aec.a(bzd.class, aeb.b);
   ehe e = ehe.b;
   gu bS = gu.b;
   bzd.a bT = bzd.a.a;

   public bzd(bim<? extends bzd> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzd.g(this);
      this.bK = new bzd.f(this);
   }

   @Override
   public boolean aR() {
      return (this.q() + this.ah) % c == 0;
   }

   @Override
   protected bos B() {
      return new bzd.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bzd.c());
      this.bO.a(2, new bzd.i());
      this.bO.a(3, new bzd.e());
      this.bP.a(1, new bzd.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, arp.a($$0, 0, 64));
   }

   private void t() {
      this.e_();
      this.a(bkf.f).a((double)(6 + this.p()));
   }

   public int p() {
      return this.an.b(d);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(adz<?> $$0) {
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
         float $$0 = arp.b((float)(this.q() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = arp.b((float)(this.q() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.rL, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.p();
         float $$3 = arp.b(this.dA() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = arp.a(this.dA() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dK().a(iv.U, this.dp() + (double)$$3, this.dr() + (double)$$5, this.dv() + (double)$$4, 0.0, 0.0, 0.0);
         this.dK().a(iv.U, this.dp() - (double)$$3, this.dr() + (double)$$5, this.dv() - (double)$$4, 0.0, 0.0, 0.0);
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
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      this.bS = this.dk().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gu($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qr $$0) {
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
   public aox da() {
      return aox.f;
   }

   @Override
   protected aov r() {
      return aow.rI;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.rM;
   }

   @Override
   protected aov h_() {
      return aow.rK;
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   protected float eU() {
      return 1.0F;
   }

   @Override
   public boolean a(bim<?> $$0) {
      return true;
   }

   @Override
   public bij a(bjk $$0) {
      int $$1 = this.p();
      bij $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bii $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bpu {
      private final btl b = btl.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cbn> $$0 = bzd.this.dK().a(this.b, bzd.this, bzd.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bii::dr).reversed());

               for (cbn $$1 : $$0) {
                  if (bzd.this.a($$1, btl.a)) {
                     bzd.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         biy $$0 = bzd.this.j();
         return $$0 != null ? bzd.this.a($$0, btl.a) : false;
      }
   }

   class c extends bpu {
      private int b;

      @Override
      public boolean a() {
         biy $$0 = bzd.this.j();
         return $$0 != null ? bzd.this.a($$0, btl.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzd.this.bT = bzd.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzd.this.bS = bzd.this.dK().a(dkj.a.e, bzd.this.bS).b(10 + bzd.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzd.this.bT == bzd.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzd.this.bT = bzd.a.b;
               this.h();
               this.b = this.a((8 + bzd.this.ag.a(4)) * 20);
               bzd.this.a(aow.rN, 10.0F, 0.95F + bzd.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzd.this.bS = bzd.this.j().dk().b(20 + bzd.this.ag.a(20));
         if (bzd.this.bS.v() < bzd.this.dK().t_()) {
            bzd.this.bS = new gu(bzd.this.bS.u(), bzd.this.dK().t_() + 1, bzd.this.bS.w());
         }
      }
   }

   class d extends bos {
      public d(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzd.this.aW = bzd.this.aU;
         bzd.this.aU = bzd.this.dA();
      }
   }

   class e extends bzd.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzd.this.j() == null || bzd.this.bT == bzd.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzd.this.ag.i() * 10.0F;
         this.e = -4.0F + bzd.this.ag.i() * 9.0F;
         this.f = bzd.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzd.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzd.this.ag.i() * 9.0F;
         }

         if (bzd.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzd.this.ag.a(this.a(450)) == 0) {
            this.c = bzd.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzd.this.e.d < bzd.this.dr() && !bzd.this.dK().t(bzd.this.dk().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzd.this.e.d > bzd.this.dr() && !bzd.this.dK().t(bzd.this.dk().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gu.b.equals(bzd.this.bS)) {
            bzd.this.bS = bzd.this.dk();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzd.this.e = ehe.a(bzd.this.bS).b((double)(this.d * arp.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * arp.a(this.c)));
      }
   }

   class f extends bow {
      public f(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends box {
      private float m = 0.1F;

      public g(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzd.this.P) {
            bzd.this.r(bzd.this.dA() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzd.this.e.c - bzd.this.dp();
         double $$1 = bzd.this.e.d - bzd.this.dr();
         double $$2 = bzd.this.e.e - bzd.this.dv();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzd.this.dA();
            float $$7 = (float)arp.d($$2, $$0);
            float $$8 = arp.g(bzd.this.dA() + 90.0F);
            float $$9 = arp.g($$7 * (180.0F / (float)Math.PI));
            bzd.this.r(arp.e($$8, $$9, 4.0F) - 90.0F);
            bzd.this.aU = bzd.this.dA();
            if (arp.d($$6, bzd.this.dA()) < 3.0F) {
               this.m = arp.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = arp.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(arp.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzd.this.s($$10);
            float $$11 = bzd.this.dA() + 90.0F;
            double $$12 = (double)(this.m * arp.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * arp.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * arp.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehe $$15 = bzd.this.dn();
            bzd.this.f($$15.e(new ehe($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bpu {
      public h() {
         this.a(EnumSet.of(bpu.a.a));
      }

      protected boolean h() {
         return bzd.this.e.c(bzd.this.dp(), bzd.this.dr(), bzd.this.dv()) < 4.0;
      }
   }

   class i extends bzd.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzd.this.j() != null && bzd.this.bT == bzd.a.b;
      }

      @Override
      public boolean b() {
         biy $$0 = bzd.this.j();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cbn $$1 && ($$0.G_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzd.this.ah > this.e) {
                  this.e = bzd.this.ah + 20;
                  List<bun> $$2 = bzd.this.dK().a(bun.class, bzd.this.cG().g(16.0), bil.a);

                  for (bun $$3 : $$2) {
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
         bzd.this.h(null);
         bzd.this.bT = bzd.a.a;
      }

      @Override
      public void e() {
         biy $$0 = bzd.this.j();
         if ($$0 != null) {
            bzd.this.e = new ehe($$0.dp(), $$0.e(0.5), $$0.dv());
            if (bzd.this.cG().g(0.2F).c($$0.cG())) {
               bzd.this.C($$0);
               bzd.this.bT = bzd.a.a;
               if (!bzd.this.aS()) {
                  bzd.this.dK().c(1039, bzd.this.dk(), 0);
               }
            } else if (bzd.this.P || bzd.this.aK > 0) {
               bzd.this.bT = bzd.a.a;
            }
         }
      }
   }
}
