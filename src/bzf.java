import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzf extends bis implements byv {
   public static final float b = 7.448451F;
   public static final int c = ars.f(24.166098F);
   private static final aec<Integer> d = aef.a(bzf.class, aee.b);
   ehi e = ehi.b;
   gw bS = gw.b;
   bzf.a bT = bzf.a.a;

   public bzf(bip<? extends bzf> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzf.g(this);
      this.bK = new bzf.f(this);
   }

   @Override
   public boolean aR() {
      return (this.q() + this.ah) % c == 0;
   }

   @Override
   protected bou B() {
      return new bzf.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bzf.c());
      this.bO.a(2, new bzf.i());
      this.bO.a(3, new bzf.e());
      this.bP.a(1, new bzf.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, ars.a($$0, 0, 64));
   }

   private void t() {
      this.e_();
      this.a(bkh.f).a((double)(6 + this.p()));
   }

   public int p() {
      return this.an.b(d);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(aec<?> $$0) {
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
         float $$0 = ars.b((float)(this.q() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ars.b((float)(this.q() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aoz.rL, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.p();
         float $$3 = ars.b(this.dA() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = ars.a(this.dA() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dK().a(ix.U, this.dp() + (double)$$3, this.dr() + (double)$$5, this.dv() + (double)$$4, 0.0, 0.0, 0.0);
         this.dK().a(ix.U, this.dp() - (double)$$3, this.dr() + (double)$$5, this.dv() - (double)$$4, 0.0, 0.0, 0.0);
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
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.bS = this.dk().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gw($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qu $$0) {
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
   public apa da() {
      return apa.f;
   }

   @Override
   protected aoy r() {
      return aoz.rI;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.rM;
   }

   @Override
   protected aoy h_() {
      return aoz.rK;
   }

   @Override
   public bjg eQ() {
      return bjg.b;
   }

   @Override
   protected float eU() {
      return 1.0F;
   }

   @Override
   public boolean a(bip<?> $$0) {
      return true;
   }

   @Override
   public bim a(bjn $$0) {
      int $$1 = this.p();
      bim $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bil $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bpw {
      private final btn b = btn.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cbp> $$0 = bzf.this.dK().a(this.b, bzf.this, bzf.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bil::dr).reversed());

               for (cbp $$1 : $$0) {
                  if (bzf.this.a($$1, btn.a)) {
                     bzf.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bjb $$0 = bzf.this.j();
         return $$0 != null ? bzf.this.a($$0, btn.a) : false;
      }
   }

   class c extends bpw {
      private int b;

      @Override
      public boolean a() {
         bjb $$0 = bzf.this.j();
         return $$0 != null ? bzf.this.a($$0, btn.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzf.this.bT = bzf.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzf.this.bS = bzf.this.dK().a(dkn.a.e, bzf.this.bS).b(10 + bzf.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzf.this.bT == bzf.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzf.this.bT = bzf.a.b;
               this.h();
               this.b = this.a((8 + bzf.this.ag.a(4)) * 20);
               bzf.this.a(aoz.rN, 10.0F, 0.95F + bzf.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzf.this.bS = bzf.this.j().dk().b(20 + bzf.this.ag.a(20));
         if (bzf.this.bS.v() < bzf.this.dK().t_()) {
            bzf.this.bS = new gw(bzf.this.bS.u(), bzf.this.dK().t_() + 1, bzf.this.bS.w());
         }
      }
   }

   class d extends bou {
      public d(bjd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzf.this.aW = bzf.this.aU;
         bzf.this.aU = bzf.this.dA();
      }
   }

   class e extends bzf.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzf.this.j() == null || bzf.this.bT == bzf.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzf.this.ag.i() * 10.0F;
         this.e = -4.0F + bzf.this.ag.i() * 9.0F;
         this.f = bzf.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzf.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzf.this.ag.i() * 9.0F;
         }

         if (bzf.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzf.this.ag.a(this.a(450)) == 0) {
            this.c = bzf.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzf.this.e.d < bzf.this.dr() && !bzf.this.dK().t(bzf.this.dk().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzf.this.e.d > bzf.this.dr() && !bzf.this.dK().t(bzf.this.dk().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gw.b.equals(bzf.this.bS)) {
            bzf.this.bS = bzf.this.dk();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzf.this.e = ehi.a(bzf.this.bS).b((double)(this.d * ars.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ars.a(this.c)));
      }
   }

   class f extends boy {
      public f(bjd $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends boz {
      private float m = 0.1F;

      public g(bjd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzf.this.P) {
            bzf.this.r(bzf.this.dA() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzf.this.e.c - bzf.this.dp();
         double $$1 = bzf.this.e.d - bzf.this.dr();
         double $$2 = bzf.this.e.e - bzf.this.dv();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzf.this.dA();
            float $$7 = (float)ars.d($$2, $$0);
            float $$8 = ars.g(bzf.this.dA() + 90.0F);
            float $$9 = ars.g($$7 * (180.0F / (float)Math.PI));
            bzf.this.r(ars.e($$8, $$9, 4.0F) - 90.0F);
            bzf.this.aU = bzf.this.dA();
            if (ars.d($$6, bzf.this.dA()) < 3.0F) {
               this.m = ars.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ars.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ars.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzf.this.s($$10);
            float $$11 = bzf.this.dA() + 90.0F;
            double $$12 = (double)(this.m * ars.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ars.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ars.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehi $$15 = bzf.this.dn();
            bzf.this.f($$15.e(new ehi($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bpw {
      public h() {
         this.a(EnumSet.of(bpw.a.a));
      }

      protected boolean h() {
         return bzf.this.e.c(bzf.this.dp(), bzf.this.dr(), bzf.this.dv()) < 4.0;
      }
   }

   class i extends bzf.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzf.this.j() != null && bzf.this.bT == bzf.a.b;
      }

      @Override
      public boolean b() {
         bjb $$0 = bzf.this.j();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cbp $$1 && ($$0.G_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzf.this.ah > this.e) {
                  this.e = bzf.this.ah + 20;
                  List<bup> $$2 = bzf.this.dK().a(bup.class, bzf.this.cG().g(16.0), bio.a);

                  for (bup $$3 : $$2) {
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
         bzf.this.h(null);
         bzf.this.bT = bzf.a.a;
      }

      @Override
      public void e() {
         bjb $$0 = bzf.this.j();
         if ($$0 != null) {
            bzf.this.e = new ehi($$0.dp(), $$0.e(0.5), $$0.dv());
            if (bzf.this.cG().g(0.2F).c($$0.cG())) {
               bzf.this.C($$0);
               bzf.this.bT = bzf.a.a;
               if (!bzf.this.aS()) {
                  bzf.this.dK().c(1039, bzf.this.dk(), 0);
               }
            } else if (bzf.this.P || bzf.this.aK > 0) {
               bzf.this.bT = bzf.a.a;
            }
         }
      }
   }
}
