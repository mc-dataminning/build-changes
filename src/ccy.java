import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccy extends bmf implements cco {
   public static final float b = 7.448451F;
   public static final int c = aup.f(24.166098F);
   private static final agn<Integer> d = agq.a(ccy.class, agp.b);
   emc e = emc.b;
   hx bT = hx.b;
   ccy.a bU = ccy.a.a;

   public ccy(bmc<? extends ccy> $$0, ctx $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bM = new ccy.g(this);
      this.bL = new ccy.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected bsi H() {
      return new ccy.d(this);
   }

   @Override
   protected void B() {
      this.bP.a(1, new ccy.c());
      this.bP.a(2, new ccy.i());
      this.bP.a(3, new ccy.e());
      this.bQ.a(1, new ccy.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, aup.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.f(bnu.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   public void a(agn<?> $$0) {
      if (d.equals($$0)) {
         this.A();
      }

      super.a($$0);
   }

   public int w() {
      return this.aj() * 3;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         float $$0 = aup.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aup.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.sP, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = aup.b(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = aup.a(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dL().a(jx.W, this.dq() + (double)$$3, this.ds() + (double)$$5, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
         this.dL().a(jx.W, this.dq() - (double)$$3, this.ds() + (double)$$5, this.dw() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bx() && this.fZ()) {
         this.g(8);
      }

      super.d_();
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.bT = this.dl().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bT = new hx($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("AX", this.bT.u());
      $$0.a("AY", this.bT.v());
      $$0.a("AZ", this.bT.w());
      $$0.a("Size", this.u());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected ars y() {
      return art.sM;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.sQ;
   }

   @Override
   protected ars n_() {
      return art.sO;
   }

   @Override
   public bmt eS() {
      return bmt.b;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(bmc<?> $$0) {
      return true;
   }

   @Override
   public blz e(bna $$0) {
      int $$1 = this.u();
      blz $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends btk {
      private final bxd b = bxd.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cfq> $$0 = ccy.this.dL().a(this.b, ccy.this, ccy.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(blw::ds).reversed());

               for (cfq $$1 : $$0) {
                  if (ccy.this.a($$1, bxd.a)) {
                     ccy.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bmo $$0 = ccy.this.q();
         return $$0 != null ? ccy.this.a($$0, bxd.a) : false;
      }
   }

   class c extends btk {
      private int b;

      @Override
      public boolean a() {
         bmo $$0 = ccy.this.q();
         return $$0 != null ? ccy.this.a($$0, bxd.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ccy.this.bU = ccy.a.a;
         this.h();
      }

      @Override
      public void d() {
         ccy.this.bT = ccy.this.dL().a(doy.a.e, ccy.this.bT).b(10 + ccy.this.ag.a(20));
      }

      @Override
      public void e() {
         if (ccy.this.bU == ccy.a.a) {
            this.b--;
            if (this.b <= 0) {
               ccy.this.bU = ccy.a.b;
               this.h();
               this.b = this.a((8 + ccy.this.ag.a(4)) * 20);
               ccy.this.a(art.sR, 10.0F, 0.95F + ccy.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         ccy.this.bT = ccy.this.q().dl().b(20 + ccy.this.ag.a(20));
         if (ccy.this.bT.v() < ccy.this.dL().A_()) {
            ccy.this.bT = new hx(ccy.this.bT.u(), ccy.this.dL().A_() + 1, ccy.this.bT.w());
         }
      }
   }

   class d extends bsi {
      public d(bmq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ccy.this.aW = ccy.this.aU;
         ccy.this.aU = ccy.this.dB();
      }
   }

   class e extends ccy.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ccy.this.q() == null || ccy.this.bU == ccy.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ccy.this.ag.i() * 10.0F;
         this.e = -4.0F + ccy.this.ag.i() * 9.0F;
         this.f = ccy.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ccy.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + ccy.this.ag.i() * 9.0F;
         }

         if (ccy.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ccy.this.ag.a(this.a(450)) == 0) {
            this.c = ccy.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ccy.this.e.d < ccy.this.ds() && !ccy.this.dL().u(ccy.this.dl().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ccy.this.e.d > ccy.this.ds() && !ccy.this.dL().u(ccy.this.dl().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hx.b.equals(ccy.this.bT)) {
            ccy.this.bT = ccy.this.dl();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ccy.this.e = emc.a(ccy.this.bT).b((double)(this.d * aup.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aup.a(this.c)));
      }
   }

   class f extends bsm {
      public f(bmq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bsn {
      private float m = 0.1F;

      public g(bmq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ccy.this.P) {
            ccy.this.r(ccy.this.dB() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ccy.this.e.c - ccy.this.dq();
         double $$1 = ccy.this.e.d - ccy.this.ds();
         double $$2 = ccy.this.e.e - ccy.this.dw();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ccy.this.dB();
            float $$7 = (float)aup.d($$2, $$0);
            float $$8 = aup.g(ccy.this.dB() + 90.0F);
            float $$9 = aup.g($$7 * (180.0F / (float)Math.PI));
            ccy.this.r(aup.e($$8, $$9, 4.0F) - 90.0F);
            ccy.this.aU = ccy.this.dB();
            if (aup.d($$6, ccy.this.dB()) < 3.0F) {
               this.m = aup.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aup.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aup.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ccy.this.s($$10);
            float $$11 = ccy.this.dB() + 90.0F;
            double $$12 = (double)(this.m * aup.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aup.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aup.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            emc $$15 = ccy.this.do();
            ccy.this.g($$15.e(new emc($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends btk {
      public h() {
         this.a(EnumSet.of(btk.a.a));
      }

      protected boolean h() {
         return ccy.this.e.c(ccy.this.dq(), ccy.this.ds(), ccy.this.dw()) < 4.0;
      }
   }

   class i extends ccy.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ccy.this.q() != null && ccy.this.bU == ccy.a.b;
      }

      @Override
      public boolean b() {
         bmo $$0 = ccy.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cfq $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ccy.this.ah > this.e) {
                  this.e = ccy.this.ah + 20;
                  List<byf> $$2 = ccy.this.dL().a(byf.class, ccy.this.cH().g(16.0), bmb.a);

                  for (byf $$3 : $$2) {
                     $$3.gq();
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
         ccy.this.h(null);
         ccy.this.bU = ccy.a.a;
      }

      @Override
      public void e() {
         bmo $$0 = ccy.this.q();
         if ($$0 != null) {
            ccy.this.e = new emc($$0.dq(), $$0.e(0.5), $$0.dw());
            if (ccy.this.cH().g(0.2F).c($$0.cH())) {
               ccy.this.B($$0);
               ccy.this.bU = ccy.a.a;
               if (!ccy.this.aU()) {
                  ccy.this.dL().c(1039, ccy.this.dl(), 0);
               }
            } else if (ccy.this.P || ccy.this.aK > 0) {
               ccy.this.bU = ccy.a.a;
            }
         }
      }
   }
}
