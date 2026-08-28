import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cjt extends bst implements cjj {
   public static final float b = 7.448451F;
   public static final int c = ayg.f(24.166098F);
   private static final ajp<Integer> d = ajt.a(cjt.class, ajr.b);
   ewh e = ewh.b;
   ja bZ = ja.c;
   cjt.a ca = cjt.a.a;

   public cjt(bsn<? extends cjt> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjt.g(this);
      this.bQ = new cjt.f(this);
   }

   @Override
   public boolean aX() {
      return (this.t() + this.ai) % c == 0;
   }

   @Override
   protected byy E() {
      return new cjt.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cjt.c());
      this.bU.a(2, new cjt.i());
      this.bU.a(3, new cjt.e());
      this.bV.a(1, new cjt.b());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayg.a($$0, 0, 64));
   }

   private void x() {
      this.i_();
      this.f(buk.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (d.equals($$0)) {
         this.x();
      }

      super.a($$0);
   }

   public int t() {
      return this.an() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B) {
         float $$0 = ayg.b((float)(this.t() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayg.b((float)(this.t() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.tx, this.dg(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dl() * 1.48F;
         float $$3 = ayg.b(this.dH() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayg.a(this.dH() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dm() * 2.5F;
         this.dR().a(lj.Z, this.dw() + (double)$$3, this.dy() + (double)$$5, this.dC() + (double)$$4, 0.0, 0.0, 0.0);
         this.dR().a(lj.Z, this.dw() - (double)$$3, this.dy() + (double)$$5, this.dC() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void m_() {
      if (this.bF() && this.gh()) {
         this.d(8.0F);
      }

      super.m_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.bZ = this.dr().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bZ = new ja($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AX", this.bZ.u());
      $$0.a("AY", this.bZ.v());
      $$0.a("AZ", this.bZ.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.tu;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.ty;
   }

   @Override
   protected avg n_() {
      return avh.tw;
   }

   @Override
   protected float fc() {
      return 1.0F;
   }

   @Override
   public boolean a(bsn<?> $$0) {
      return true;
   }

   @Override
   public bsk e(bto $$0) {
      int $$1 = this.s();
      bsk $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends caa {
      private final cdt b = cdt.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cml> $$0 = cjt.this.dR().a(this.b, cjt.this, cjt.this.cM().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsh::dy).reversed());

               for (cml $$1 : $$0) {
                  if (cjt.this.a($$1, cdt.a)) {
                     cjt.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btc $$0 = cjt.this.p();
         return $$0 != null ? cjt.this.a($$0, cdt.a) : false;
      }
   }

   class c extends caa {
      private int b;

      @Override
      public boolean a() {
         btc $$0 = cjt.this.p();
         return $$0 != null ? cjt.this.a($$0, cdt.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cjt.this.ca = cjt.a.a;
         this.h();
      }

      @Override
      public void d() {
         cjt.this.bZ = cjt.this.dR().a(dyg.a.e, cjt.this.bZ).b(10 + cjt.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cjt.this.ca == cjt.a.a) {
            this.b--;
            if (this.b <= 0) {
               cjt.this.ca = cjt.a.b;
               this.h();
               this.b = this.a((8 + cjt.this.ah.a(4)) * 20);
               cjt.this.a(avh.tz, 10.0F, 0.95F + cjt.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cjt.this.bZ = cjt.this.p().dr().b(20 + cjt.this.ah.a(20));
         if (cjt.this.bZ.v() < cjt.this.dR().z_()) {
            cjt.this.bZ = new ja(cjt.this.bZ.u(), cjt.this.dR().z_() + 1, cjt.this.bZ.w());
         }
      }
   }

   class d extends byy {
      public d(final bte $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cjt.this.bb = cjt.this.aZ;
         cjt.this.aZ = cjt.this.dH();
      }
   }

   class e extends cjt.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cjt.this.p() == null || cjt.this.ca == cjt.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cjt.this.ah.i() * 10.0F;
         this.e = -4.0F + cjt.this.ah.i() * 9.0F;
         this.f = cjt.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cjt.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cjt.this.ah.i() * 9.0F;
         }

         if (cjt.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cjt.this.ah.a(this.a(450)) == 0) {
            this.c = cjt.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cjt.this.e.d < cjt.this.dy() && !cjt.this.dR().u(cjt.this.dr().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cjt.this.e.d > cjt.this.dy() && !cjt.this.dR().u(cjt.this.dr().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ja.c.equals(cjt.this.bZ)) {
            cjt.this.bZ = cjt.this.dr();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cjt.this.e = ewh.a(cjt.this.bZ).b((double)(this.d * ayg.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayg.a(this.c)));
      }
   }

   class f extends bzc {
      public f(final bte $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzd {
      private float m = 0.1F;

      public g(final bte $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cjt.this.Q) {
            cjt.this.s(cjt.this.dH() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cjt.this.e.c - cjt.this.dw();
         double $$1 = cjt.this.e.d - cjt.this.dy();
         double $$2 = cjt.this.e.e - cjt.this.dC();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cjt.this.dH();
            float $$7 = (float)ayg.d($$2, $$0);
            float $$8 = ayg.g(cjt.this.dH() + 90.0F);
            float $$9 = ayg.g($$7 * (180.0F / (float)Math.PI));
            cjt.this.s(ayg.e($$8, $$9, 4.0F) - 90.0F);
            cjt.this.aZ = cjt.this.dH();
            if (ayg.d($$6, cjt.this.dH()) < 3.0F) {
               this.m = ayg.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayg.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayg.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cjt.this.t($$10);
            float $$11 = cjt.this.dH() + 90.0F;
            double $$12 = (double)(this.m * ayg.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayg.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayg.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ewh $$15 = cjt.this.du();
            cjt.this.j($$15.e(new ewh($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends caa {
      public h() {
         this.a(EnumSet.of(caa.a.a));
      }

      protected boolean h() {
         return cjt.this.e.c(cjt.this.dw(), cjt.this.dy(), cjt.this.dC()) < 4.0;
      }
   }

   class i extends cjt.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cjt.this.p() != null && cjt.this.ca == cjt.a.b;
      }

      @Override
      public boolean b() {
         btc $$0 = cjt.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bF()) {
            return false;
         } else {
            if ($$0 instanceof cml $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cjt.this.ai > this.e) {
                  this.e = cjt.this.ai + 20;
                  List<cev> $$2 = cjt.this.dR().a(cev.class, cjt.this.cM().g(16.0), bsm.a);

                  for (cev $$3 : $$2) {
                     $$3.gx();
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
         cjt.this.h(null);
         cjt.this.ca = cjt.a.a;
      }

      @Override
      public void e() {
         btc $$0 = cjt.this.p();
         if ($$0 != null) {
            cjt.this.e = new ewh($$0.dw(), $$0.e(0.5), $$0.dC());
            if (cjt.this.cM().g(0.2F).c($$0.cM())) {
               cjt.this.D($$0);
               cjt.this.ca = cjt.a.a;
               if (!cjt.this.aY()) {
                  cjt.this.dR().c(1039, cjt.this.dr(), 0);
               }
            } else if (cjt.this.Q || cjt.this.aP > 0) {
               cjt.this.ca = cjt.a.a;
            }
         }
      }
   }
}
