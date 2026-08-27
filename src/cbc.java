import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbc extends bkp implements cas {
   public static final float b = 7.448451F;
   public static final int c = ati.f(24.166098F);
   private static final afm<Integer> d = afp.a(cbc.class, afo.b);
   eji e = eji.b;
   ht bS = ht.b;
   cbc.a bT = cbc.a.a;

   public cbc(bkm<? extends cbc> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cbc.g(this);
      this.bK = new cbc.f(this);
   }

   @Override
   public boolean aR() {
      return (this.t() + this.ah) % c == 0;
   }

   @Override
   protected bqr F() {
      return new cbc.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new cbc.c());
      this.bO.a(2, new cbc.i());
      this.bO.a(3, new cbc.e());
      this.bP.a(1, new cbc.b());
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, ati.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.a(bme.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.an.b(d);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(afm<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.ah() * 3;
   }

   @Override
   protected boolean V() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         float $$0 = ati.b((float)(this.t() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ati.b((float)(this.t() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqn.rP, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.s();
         float $$3 = ati.b(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = ati.a(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dL().a(js.U, this.dq() + (double)$$3, this.ds() + (double)$$5, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
         this.dL().a(js.U, this.dq() - (double)$$3, this.ds() + (double)$$5, this.dw() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c_() {
      if (this.bv() && this.fY()) {
         this.g(8);
      }

      super.c_();
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.bS = this.dl().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new ht($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aqo da() {
      return aqo.f;
   }

   @Override
   protected aqm w() {
      return aqn.rM;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.rQ;
   }

   @Override
   protected aqm m_() {
      return aqn.rO;
   }

   @Override
   public bld eR() {
      return bld.b;
   }

   @Override
   protected float eV() {
      return 1.0F;
   }

   @Override
   public boolean a(bkm<?> $$0) {
      return true;
   }

   @Override
   public bkj a(blk $$0) {
      int $$1 = this.s();
      bkj $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bki $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends brt {
      private final bvk b = bvk.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cdm> $$0 = cbc.this.dL().a(this.b, cbc.this, cbc.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bki::ds).reversed());

               for (cdm $$1 : $$0) {
                  if (cbc.this.a($$1, bvk.a)) {
                     cbc.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bky $$0 = cbc.this.q();
         return $$0 != null ? cbc.this.a($$0, bvk.a) : false;
      }
   }

   class c extends brt {
      private int b;

      @Override
      public boolean a() {
         bky $$0 = cbc.this.q();
         return $$0 != null ? cbc.this.a($$0, bvk.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cbc.this.bT = cbc.a.a;
         this.h();
      }

      @Override
      public void d() {
         cbc.this.bS = cbc.this.dL().a(dmf.a.e, cbc.this.bS).b(10 + cbc.this.ag.a(20));
      }

      @Override
      public void e() {
         if (cbc.this.bT == cbc.a.a) {
            this.b--;
            if (this.b <= 0) {
               cbc.this.bT = cbc.a.b;
               this.h();
               this.b = this.a((8 + cbc.this.ag.a(4)) * 20);
               cbc.this.a(aqn.rR, 10.0F, 0.95F + cbc.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         cbc.this.bS = cbc.this.q().dl().b(20 + cbc.this.ag.a(20));
         if (cbc.this.bS.v() < cbc.this.dL().z_()) {
            cbc.this.bS = new ht(cbc.this.bS.u(), cbc.this.dL().z_() + 1, cbc.this.bS.w());
         }
      }
   }

   class d extends bqr {
      public d(bla $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cbc.this.aW = cbc.this.aU;
         cbc.this.aU = cbc.this.dB();
      }
   }

   class e extends cbc.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cbc.this.q() == null || cbc.this.bT == cbc.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cbc.this.ag.i() * 10.0F;
         this.e = -4.0F + cbc.this.ag.i() * 9.0F;
         this.f = cbc.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cbc.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + cbc.this.ag.i() * 9.0F;
         }

         if (cbc.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cbc.this.ag.a(this.a(450)) == 0) {
            this.c = cbc.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cbc.this.e.d < cbc.this.ds() && !cbc.this.dL().t(cbc.this.dl().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cbc.this.e.d > cbc.this.ds() && !cbc.this.dL().t(cbc.this.dl().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ht.b.equals(cbc.this.bS)) {
            cbc.this.bS = cbc.this.dl();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cbc.this.e = eji.a(cbc.this.bS).b((double)(this.d * ati.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ati.a(this.c)));
      }
   }

   class f extends bqv {
      public f(bla $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bqw {
      private float m = 0.1F;

      public g(bla $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cbc.this.P) {
            cbc.this.r(cbc.this.dB() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cbc.this.e.c - cbc.this.dq();
         double $$1 = cbc.this.e.d - cbc.this.ds();
         double $$2 = cbc.this.e.e - cbc.this.dw();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cbc.this.dB();
            float $$7 = (float)ati.d($$2, $$0);
            float $$8 = ati.g(cbc.this.dB() + 90.0F);
            float $$9 = ati.g($$7 * (180.0F / (float)Math.PI));
            cbc.this.r(ati.e($$8, $$9, 4.0F) - 90.0F);
            cbc.this.aU = cbc.this.dB();
            if (ati.d($$6, cbc.this.dB()) < 3.0F) {
               this.m = ati.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ati.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ati.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cbc.this.s($$10);
            float $$11 = cbc.this.dB() + 90.0F;
            double $$12 = (double)(this.m * ati.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ati.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ati.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eji $$15 = cbc.this.do();
            cbc.this.f($$15.e(new eji($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends brt {
      public h() {
         this.a(EnumSet.of(brt.a.a));
      }

      protected boolean h() {
         return cbc.this.e.c(cbc.this.dq(), cbc.this.ds(), cbc.this.dw()) < 4.0;
      }
   }

   class i extends cbc.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cbc.this.q() != null && cbc.this.bT == cbc.a.b;
      }

      @Override
      public boolean b() {
         bky $$0 = cbc.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cdm $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cbc.this.ah > this.e) {
                  this.e = cbc.this.ah + 20;
                  List<bwm> $$2 = cbc.this.dL().a(bwm.class, cbc.this.cG().g(16.0), bkl.a);

                  for (bwm $$3 : $$2) {
                     $$3.gp();
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
         cbc.this.h(null);
         cbc.this.bT = cbc.a.a;
      }

      @Override
      public void e() {
         bky $$0 = cbc.this.q();
         if ($$0 != null) {
            cbc.this.e = new eji($$0.dq(), $$0.e(0.5), $$0.dw());
            if (cbc.this.cG().g(0.2F).c($$0.cG())) {
               cbc.this.C($$0);
               cbc.this.bT = cbc.a.a;
               if (!cbc.this.aS()) {
                  cbc.this.dL().c(1039, cbc.this.dl(), 0);
               }
            } else if (cbc.this.P || cbc.this.aK > 0) {
               cbc.this.bT = cbc.a.a;
            }
         }
      }
   }
}
