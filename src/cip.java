import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cip extends brr implements cif {
   public static final float b = 7.448451F;
   public static final int c = axz.f(24.166098F);
   private static final ajm<Integer> d = ajq.a(cip.class, ajo.b);
   etp e = etp.b;
   in bX = in.c;
   cip.a bY = cip.a.a;

   public cip(brn<? extends cip> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cip.g(this);
      this.bO = new cip.f(this);
   }

   @Override
   public boolean aT() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bxv E() {
      return new cip.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cip.c());
      this.bS.a(2, new cip.i());
      this.bS.a(3, new cip.e());
      this.bT.a(1, new cip.b());
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, axz.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(bth.c).a((double)(6 + this.r()));
   }

   public int r() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajm<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int u() {
      return this.aj() * 3;
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         float $$0 = axz.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = axz.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dN().a(this.ds(), this.du(), this.dy(), avc.tj, this.dc(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dh() * 1.48F;
         float $$3 = axz.b(this.dD() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = axz.a(this.dD() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.di() * 2.5F;
         this.dN().a(kx.W, this.ds() + (double)$$3, this.du() + (double)$$5, this.dy() + (double)$$4, 0.0, 0.0, 0.0);
         this.dN().a(kx.W, this.ds() - (double)$$3, this.du() + (double)$$5, this.dy() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bB() && this.gj()) {
         this.g(8);
      }

      super.n_();
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.bX = this.dn().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new in($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.r());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected avb v() {
      return avc.tg;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.tk;
   }

   @Override
   protected avb o_() {
      return avc.ti;
   }

   @Override
   protected float fc() {
      return 1.0F;
   }

   @Override
   public boolean a(brn<?> $$0) {
      return true;
   }

   @Override
   public brk e(bsl $$0) {
      int $$1 = this.r();
      brk $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends byx {
      private final ccq b = ccq.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<clh> $$0 = cip.this.dN().a(this.b, cip.this, cip.this.cI().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(brh::du).reversed());

               for (clh $$1 : $$0) {
                  if (cip.this.a($$1, ccq.a)) {
                     cip.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bsa $$0 = cip.this.p();
         return $$0 != null ? cip.this.a($$0, ccq.a) : false;
      }
   }

   class c extends byx {
      private int b;

      @Override
      public boolean a() {
         bsa $$0 = cip.this.p();
         return $$0 != null ? cip.this.a($$0, ccq.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cip.this.bY = cip.a.a;
         this.h();
      }

      @Override
      public void d() {
         cip.this.bX = cip.this.dN().a(dvz.a.e, cip.this.bX).b(10 + cip.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cip.this.bY == cip.a.a) {
            this.b--;
            if (this.b <= 0) {
               cip.this.bY = cip.a.b;
               this.h();
               this.b = this.a((8 + cip.this.ah.a(4)) * 20);
               cip.this.a(avc.tl, 10.0F, 0.95F + cip.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cip.this.bX = cip.this.p().dn().b(20 + cip.this.ah.a(20));
         if (cip.this.bX.v() < cip.this.dN().z_()) {
            cip.this.bX = new in(cip.this.bX.u(), cip.this.dN().z_() + 1, cip.this.bX.w());
         }
      }
   }

   class d extends bxv {
      public d(bsc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cip.this.bb = cip.this.aZ;
         cip.this.aZ = cip.this.dD();
      }
   }

   class e extends cip.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cip.this.p() == null || cip.this.bY == cip.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cip.this.ah.i() * 10.0F;
         this.e = -4.0F + cip.this.ah.i() * 9.0F;
         this.f = cip.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cip.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cip.this.ah.i() * 9.0F;
         }

         if (cip.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cip.this.ah.a(this.a(450)) == 0) {
            this.c = cip.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cip.this.e.d < cip.this.du() && !cip.this.dN().u(cip.this.dn().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cip.this.e.d > cip.this.du() && !cip.this.dN().u(cip.this.dn().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (in.c.equals(cip.this.bX)) {
            cip.this.bX = cip.this.dn();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cip.this.e = etp.a(cip.this.bX).b((double)(this.d * axz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * axz.a(this.c)));
      }
   }

   class f extends bxz {
      public f(bsc $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bya {
      private float m = 0.1F;

      public g(bsc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cip.this.Q) {
            cip.this.r(cip.this.dD() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cip.this.e.c - cip.this.ds();
         double $$1 = cip.this.e.d - cip.this.du();
         double $$2 = cip.this.e.e - cip.this.dy();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cip.this.dD();
            float $$7 = (float)axz.d($$2, $$0);
            float $$8 = axz.g(cip.this.dD() + 90.0F);
            float $$9 = axz.g($$7 * (180.0F / (float)Math.PI));
            cip.this.r(axz.e($$8, $$9, 4.0F) - 90.0F);
            cip.this.aZ = cip.this.dD();
            if (axz.d($$6, cip.this.dD()) < 3.0F) {
               this.m = axz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = axz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(axz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cip.this.s($$10);
            float $$11 = cip.this.dD() + 90.0F;
            double $$12 = (double)(this.m * axz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * axz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * axz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            etp $$15 = cip.this.dq();
            cip.this.g($$15.e(new etp($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends byx {
      public h() {
         this.a(EnumSet.of(byx.a.a));
      }

      protected boolean h() {
         return cip.this.e.c(cip.this.ds(), cip.this.du(), cip.this.dy()) < 4.0;
      }
   }

   class i extends cip.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cip.this.p() != null && cip.this.bY == cip.a.b;
      }

      @Override
      public boolean b() {
         bsa $$0 = cip.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bB()) {
            return false;
         } else {
            if ($$0 instanceof clh $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cip.this.ai > this.e) {
                  this.e = cip.this.ai + 20;
                  List<cds> $$2 = cip.this.dN().a(cds.class, cip.this.cI().g(16.0), brm.a);

                  for (cds $$3 : $$2) {
                     $$3.gz();
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
         cip.this.h(null);
         cip.this.bY = cip.a.a;
      }

      @Override
      public void e() {
         bsa $$0 = cip.this.p();
         if ($$0 != null) {
            cip.this.e = new etp($$0.ds(), $$0.e(0.5), $$0.dy());
            if (cip.this.cI().g(0.2F).c($$0.cI())) {
               cip.this.C($$0);
               cip.this.bY = cip.a.a;
               if (!cip.this.aU()) {
                  cip.this.dN().c(1039, cip.this.dn(), 0);
               }
            } else if (cip.this.Q || cip.this.aP > 0) {
               cip.this.bY = cip.a.a;
            }
         }
      }
   }
}
