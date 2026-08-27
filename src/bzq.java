import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzq extends bjd implements bzg {
   public static final float b = 7.448451F;
   public static final int c = asb.f(24.166098F);
   private static final aef<Integer> d = aei.a(bzq.class, aeh.b);
   ehh e = ehh.b;
   gw bS = gw.b;
   bzq.a bT = bzq.a.a;

   public bzq(bja<? extends bzq> $$0, cqb $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzq.g(this);
      this.bK = new bzq.f(this);
   }

   @Override
   public boolean aR() {
      return (this.t() + this.ah) % c == 0;
   }

   @Override
   protected bpf F() {
      return new bzq.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bzq.c());
      this.bO.a(2, new bzq.i());
      this.bO.a(3, new bzq.e());
      this.bP.a(1, new bzq.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, asb.a($$0, 0, 64));
   }

   private void y() {
      this.i_();
      this.a(bks.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.an.b(d);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(aef<?> $$0) {
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
         float $$0 = asb.b((float)(this.t() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = asb.b((float)(this.t() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apg.rL, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.s();
         float $$3 = asb.b(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = asb.a(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dL().a(iv.U, this.dq() + (double)$$3, this.ds() + (double)$$5, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
         this.dL().a(iv.U, this.dq() - (double)$$3, this.ds() + (double)$$5, this.dw() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void b_() {
      if (this.bv() && this.fY()) {
         this.g(8);
      }

      super.b_();
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.bS = this.dl().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gw($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qw $$0) {
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
   public aph da() {
      return aph.f;
   }

   @Override
   protected apf w() {
      return apg.rI;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.rM;
   }

   @Override
   protected apf l_() {
      return apg.rK;
   }

   @Override
   public bjr eR() {
      return bjr.b;
   }

   @Override
   protected float eV() {
      return 1.0F;
   }

   @Override
   public boolean a(bja<?> $$0) {
      return true;
   }

   @Override
   public bix a(bjy $$0) {
      int $$1 = this.s();
      bix $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(biw $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bqh {
      private final bty b = bty.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cca> $$0 = bzq.this.dL().a(this.b, bzq.this, bzq.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(biw::ds).reversed());

               for (cca $$1 : $$0) {
                  if (bzq.this.a($$1, bty.a)) {
                     bzq.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bjm $$0 = bzq.this.q();
         return $$0 != null ? bzq.this.a($$0, bty.a) : false;
      }
   }

   class c extends bqh {
      private int b;

      @Override
      public boolean a() {
         bjm $$0 = bzq.this.q();
         return $$0 != null ? bzq.this.a($$0, bty.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzq.this.bT = bzq.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzq.this.bS = bzq.this.dL().a(dkm.a.e, bzq.this.bS).b(10 + bzq.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzq.this.bT == bzq.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzq.this.bT = bzq.a.b;
               this.h();
               this.b = this.a((8 + bzq.this.ag.a(4)) * 20);
               bzq.this.a(apg.rN, 10.0F, 0.95F + bzq.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzq.this.bS = bzq.this.q().dl().b(20 + bzq.this.ag.a(20));
         if (bzq.this.bS.v() < bzq.this.dL().y_()) {
            bzq.this.bS = new gw(bzq.this.bS.u(), bzq.this.dL().y_() + 1, bzq.this.bS.w());
         }
      }
   }

   class d extends bpf {
      public d(bjo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzq.this.aW = bzq.this.aU;
         bzq.this.aU = bzq.this.dB();
      }
   }

   class e extends bzq.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzq.this.q() == null || bzq.this.bT == bzq.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzq.this.ag.i() * 10.0F;
         this.e = -4.0F + bzq.this.ag.i() * 9.0F;
         this.f = bzq.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzq.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzq.this.ag.i() * 9.0F;
         }

         if (bzq.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzq.this.ag.a(this.a(450)) == 0) {
            this.c = bzq.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzq.this.e.d < bzq.this.ds() && !bzq.this.dL().t(bzq.this.dl().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzq.this.e.d > bzq.this.ds() && !bzq.this.dL().t(bzq.this.dl().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gw.b.equals(bzq.this.bS)) {
            bzq.this.bS = bzq.this.dl();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzq.this.e = ehh.a(bzq.this.bS).b((double)(this.d * asb.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * asb.a(this.c)));
      }
   }

   class f extends bpj {
      public f(bjo $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bpk {
      private float m = 0.1F;

      public g(bjo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzq.this.P) {
            bzq.this.r(bzq.this.dB() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzq.this.e.c - bzq.this.dq();
         double $$1 = bzq.this.e.d - bzq.this.ds();
         double $$2 = bzq.this.e.e - bzq.this.dw();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzq.this.dB();
            float $$7 = (float)asb.d($$2, $$0);
            float $$8 = asb.g(bzq.this.dB() + 90.0F);
            float $$9 = asb.g($$7 * (180.0F / (float)Math.PI));
            bzq.this.r(asb.e($$8, $$9, 4.0F) - 90.0F);
            bzq.this.aU = bzq.this.dB();
            if (asb.d($$6, bzq.this.dB()) < 3.0F) {
               this.m = asb.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = asb.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(asb.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzq.this.s($$10);
            float $$11 = bzq.this.dB() + 90.0F;
            double $$12 = (double)(this.m * asb.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * asb.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * asb.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehh $$15 = bzq.this.do();
            bzq.this.f($$15.e(new ehh($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bqh {
      public h() {
         this.a(EnumSet.of(bqh.a.a));
      }

      protected boolean h() {
         return bzq.this.e.c(bzq.this.dq(), bzq.this.ds(), bzq.this.dw()) < 4.0;
      }
   }

   class i extends bzq.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzq.this.q() != null && bzq.this.bT == bzq.a.b;
      }

      @Override
      public boolean b() {
         bjm $$0 = bzq.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cca $$1 && ($$0.M_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzq.this.ah > this.e) {
                  this.e = bzq.this.ah + 20;
                  List<bva> $$2 = bzq.this.dL().a(bva.class, bzq.this.cG().g(16.0), biz.a);

                  for (bva $$3 : $$2) {
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
         bzq.this.h(null);
         bzq.this.bT = bzq.a.a;
      }

      @Override
      public void e() {
         bjm $$0 = bzq.this.q();
         if ($$0 != null) {
            bzq.this.e = new ehh($$0.dq(), $$0.e(0.5), $$0.dw());
            if (bzq.this.cG().g(0.2F).c($$0.cG())) {
               bzq.this.C($$0);
               bzq.this.bT = bzq.a.a;
               if (!bzq.this.aS()) {
                  bzq.this.dL().c(1039, bzq.this.dl(), 0);
               }
            } else if (bzq.this.P || bzq.this.aK > 0) {
               bzq.this.bT = bzq.a.a;
            }
         }
      }
   }
}
