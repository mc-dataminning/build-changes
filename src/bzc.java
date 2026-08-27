import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzc extends bip implements bys {
   public static final float b = 7.448451F;
   public static final int c = arp.f(24.166098F);
   private static final adz<Integer> d = aec.a(bzc.class, aeb.b);
   ehd e = ehd.b;
   gu bS = gu.b;
   bzc.a bT = bzc.a.a;

   public bzc(bim<? extends bzc> $$0, cpl $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzc.g(this);
      this.bK = new bzc.f(this);
   }

   @Override
   public boolean aR() {
      return (this.q() + this.ah) % c == 0;
   }

   @Override
   protected bor B() {
      return new bzc.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bzc.c());
      this.bO.a(2, new bzc.i());
      this.bO.a(3, new bzc.e());
      this.bP.a(1, new bzc.b());
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
      this.a(bke.f).a((double)(6 + this.p()));
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
      if (this.bv() && this.fU()) {
         this.g(8);
      }

      super.b_();
   }

   @Override
   protected void V() {
      super.V();
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
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

   class b extends bpt {
      private final btk b = btk.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cbm> $$0 = bzc.this.dK().a(this.b, bzc.this, bzc.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bii::dr).reversed());

               for (cbm $$1 : $$0) {
                  if (bzc.this.a($$1, btk.a)) {
                     bzc.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         biy $$0 = bzc.this.j();
         return $$0 != null ? bzc.this.a($$0, btk.a) : false;
      }
   }

   class c extends bpt {
      private int b;

      @Override
      public boolean a() {
         biy $$0 = bzc.this.j();
         return $$0 != null ? bzc.this.a($$0, btk.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzc.this.bT = bzc.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzc.this.bS = bzc.this.dK().a(dki.a.e, bzc.this.bS).b(10 + bzc.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzc.this.bT == bzc.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzc.this.bT = bzc.a.b;
               this.h();
               this.b = this.a((8 + bzc.this.ag.a(4)) * 20);
               bzc.this.a(aow.rN, 10.0F, 0.95F + bzc.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzc.this.bS = bzc.this.j().dk().b(20 + bzc.this.ag.a(20));
         if (bzc.this.bS.v() < bzc.this.dK().t_()) {
            bzc.this.bS = new gu(bzc.this.bS.u(), bzc.this.dK().t_() + 1, bzc.this.bS.w());
         }
      }
   }

   class d extends bor {
      public d(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzc.this.aW = bzc.this.aU;
         bzc.this.aU = bzc.this.dA();
      }
   }

   class e extends bzc.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzc.this.j() == null || bzc.this.bT == bzc.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzc.this.ag.i() * 10.0F;
         this.e = -4.0F + bzc.this.ag.i() * 9.0F;
         this.f = bzc.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzc.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzc.this.ag.i() * 9.0F;
         }

         if (bzc.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzc.this.ag.a(this.a(450)) == 0) {
            this.c = bzc.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzc.this.e.d < bzc.this.dr() && !bzc.this.dK().t(bzc.this.dk().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzc.this.e.d > bzc.this.dr() && !bzc.this.dK().t(bzc.this.dk().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gu.b.equals(bzc.this.bS)) {
            bzc.this.bS = bzc.this.dk();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzc.this.e = ehd.a(bzc.this.bS).b((double)(this.d * arp.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * arp.a(this.c)));
      }
   }

   class f extends bov {
      public f(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bow {
      private float m = 0.1F;

      public g(bja $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzc.this.P) {
            bzc.this.r(bzc.this.dA() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzc.this.e.c - bzc.this.dp();
         double $$1 = bzc.this.e.d - bzc.this.dr();
         double $$2 = bzc.this.e.e - bzc.this.dv();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzc.this.dA();
            float $$7 = (float)arp.d($$2, $$0);
            float $$8 = arp.g(bzc.this.dA() + 90.0F);
            float $$9 = arp.g($$7 * (180.0F / (float)Math.PI));
            bzc.this.r(arp.e($$8, $$9, 4.0F) - 90.0F);
            bzc.this.aU = bzc.this.dA();
            if (arp.d($$6, bzc.this.dA()) < 3.0F) {
               this.m = arp.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = arp.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(arp.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzc.this.s($$10);
            float $$11 = bzc.this.dA() + 90.0F;
            double $$12 = (double)(this.m * arp.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * arp.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * arp.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehd $$15 = bzc.this.dn();
            bzc.this.f($$15.e(new ehd($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bpt {
      public h() {
         this.a(EnumSet.of(bpt.a.a));
      }

      protected boolean h() {
         return bzc.this.e.c(bzc.this.dp(), bzc.this.dr(), bzc.this.dv()) < 4.0;
      }
   }

   class i extends bzc.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzc.this.j() != null && bzc.this.bT == bzc.a.b;
      }

      @Override
      public boolean b() {
         biy $$0 = bzc.this.j();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cbm $$1 && ($$0.G_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzc.this.ah > this.e) {
                  this.e = bzc.this.ah + 20;
                  List<bum> $$2 = bzc.this.dK().a(bum.class, bzc.this.cG().g(16.0), bil.a);

                  for (bum $$3 : $$2) {
                     $$3.gl();
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
         bzc.this.h(null);
         bzc.this.bT = bzc.a.a;
      }

      @Override
      public void e() {
         biy $$0 = bzc.this.j();
         if ($$0 != null) {
            bzc.this.e = new ehd($$0.dp(), $$0.e(0.5), $$0.dv());
            if (bzc.this.cG().g(0.2F).c($$0.cG())) {
               bzc.this.C($$0);
               bzc.this.bT = bzc.a.a;
               if (!bzc.this.aS()) {
                  bzc.this.dK().c(1039, bzc.this.dk(), 0);
               }
            } else if (bzc.this.P || bzc.this.aK > 0) {
               bzc.this.bT = bzc.a.a;
            }
         }
      }
   }
}
