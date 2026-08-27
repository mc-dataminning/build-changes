import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzm extends biz implements bzc {
   public static final float b = 7.448451F;
   public static final int c = ary.f(24.166098F);
   private static final aeg<Integer> d = aej.a(bzm.class, aei.b);
   ehp e = ehp.b;
   gw bS = gw.b;
   bzm.a bT = bzm.a.a;

   public bzm(biw<? extends bzm> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzm.g(this);
      this.bK = new bzm.f(this);
   }

   @Override
   public boolean aR() {
      return (this.t() + this.ah) % c == 0;
   }

   @Override
   protected bpb F() {
      return new bzm.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bzm.c());
      this.bO.a(2, new bzm.i());
      this.bO.a(3, new bzm.e());
      this.bP.a(1, new bzm.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, ary.a($$0, 0, 64));
   }

   private void y() {
      this.i_();
      this.a(bko.f).a((double)(6 + this.s()));
   }

   public int s() {
      return this.an.b(d);
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(aeg<?> $$0) {
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
         float $$0 = ary.b((float)(this.t() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ary.b((float)(this.t() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apf.rL, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.s();
         float $$3 = ary.b(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = ary.a(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dL().a(ix.U, this.dq() + (double)$$3, this.ds() + (double)$$5, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
         this.dL().a(ix.U, this.dq() - (double)$$3, this.ds() + (double)$$5, this.dw() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void b_() {
      if (this.bv() && this.fX()) {
         this.g(8);
      }

      super.b_();
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.bS = this.dl().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gw($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qy $$0) {
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
   public apg da() {
      return apg.f;
   }

   @Override
   protected ape w() {
      return apf.rI;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.rM;
   }

   @Override
   protected ape l_() {
      return apf.rK;
   }

   @Override
   public bjn eR() {
      return bjn.b;
   }

   @Override
   protected float eV() {
      return 1.0F;
   }

   @Override
   public boolean a(biw<?> $$0) {
      return true;
   }

   @Override
   public bit a(bju $$0) {
      int $$1 = this.s();
      bit $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bis $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bqd {
      private final btu b = btu.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cbw> $$0 = bzm.this.dL().a(this.b, bzm.this, bzm.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bis::ds).reversed());

               for (cbw $$1 : $$0) {
                  if (bzm.this.a($$1, btu.a)) {
                     bzm.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bji $$0 = bzm.this.q();
         return $$0 != null ? bzm.this.a($$0, btu.a) : false;
      }
   }

   class c extends bqd {
      private int b;

      @Override
      public boolean a() {
         bji $$0 = bzm.this.q();
         return $$0 != null ? bzm.this.a($$0, btu.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzm.this.bT = bzm.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzm.this.bS = bzm.this.dL().a(dku.a.e, bzm.this.bS).b(10 + bzm.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzm.this.bT == bzm.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzm.this.bT = bzm.a.b;
               this.h();
               this.b = this.a((8 + bzm.this.ag.a(4)) * 20);
               bzm.this.a(apf.rN, 10.0F, 0.95F + bzm.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzm.this.bS = bzm.this.q().dl().b(20 + bzm.this.ag.a(20));
         if (bzm.this.bS.v() < bzm.this.dL().y_()) {
            bzm.this.bS = new gw(bzm.this.bS.u(), bzm.this.dL().y_() + 1, bzm.this.bS.w());
         }
      }
   }

   class d extends bpb {
      public d(bjk $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzm.this.aW = bzm.this.aU;
         bzm.this.aU = bzm.this.dB();
      }
   }

   class e extends bzm.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzm.this.q() == null || bzm.this.bT == bzm.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzm.this.ag.i() * 10.0F;
         this.e = -4.0F + bzm.this.ag.i() * 9.0F;
         this.f = bzm.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzm.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzm.this.ag.i() * 9.0F;
         }

         if (bzm.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzm.this.ag.a(this.a(450)) == 0) {
            this.c = bzm.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzm.this.e.d < bzm.this.ds() && !bzm.this.dL().t(bzm.this.dl().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzm.this.e.d > bzm.this.ds() && !bzm.this.dL().t(bzm.this.dl().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gw.b.equals(bzm.this.bS)) {
            bzm.this.bS = bzm.this.dl();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzm.this.e = ehp.a(bzm.this.bS).b((double)(this.d * ary.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ary.a(this.c)));
      }
   }

   class f extends bpf {
      public f(bjk $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bpg {
      private float m = 0.1F;

      public g(bjk $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzm.this.P) {
            bzm.this.r(bzm.this.dB() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzm.this.e.c - bzm.this.dq();
         double $$1 = bzm.this.e.d - bzm.this.ds();
         double $$2 = bzm.this.e.e - bzm.this.dw();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzm.this.dB();
            float $$7 = (float)ary.d($$2, $$0);
            float $$8 = ary.g(bzm.this.dB() + 90.0F);
            float $$9 = ary.g($$7 * (180.0F / (float)Math.PI));
            bzm.this.r(ary.e($$8, $$9, 4.0F) - 90.0F);
            bzm.this.aU = bzm.this.dB();
            if (ary.d($$6, bzm.this.dB()) < 3.0F) {
               this.m = ary.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ary.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ary.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzm.this.s($$10);
            float $$11 = bzm.this.dB() + 90.0F;
            double $$12 = (double)(this.m * ary.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ary.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ary.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehp $$15 = bzm.this.do();
            bzm.this.f($$15.e(new ehp($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bqd {
      public h() {
         this.a(EnumSet.of(bqd.a.a));
      }

      protected boolean h() {
         return bzm.this.e.c(bzm.this.dq(), bzm.this.ds(), bzm.this.dw()) < 4.0;
      }
   }

   class i extends bzm.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzm.this.q() != null && bzm.this.bT == bzm.a.b;
      }

      @Override
      public boolean b() {
         bji $$0 = bzm.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof cbw $$1 && ($$0.M_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzm.this.ah > this.e) {
                  this.e = bzm.this.ah + 20;
                  List<buw> $$2 = bzm.this.dL().a(buw.class, bzm.this.cG().g(16.0), biv.a);

                  for (buw $$3 : $$2) {
                     $$3.go();
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
         bzm.this.h(null);
         bzm.this.bT = bzm.a.a;
      }

      @Override
      public void e() {
         bji $$0 = bzm.this.q();
         if ($$0 != null) {
            bzm.this.e = new ehp($$0.dq(), $$0.e(0.5), $$0.dw());
            if (bzm.this.cG().g(0.2F).c($$0.cG())) {
               bzm.this.C($$0);
               bzm.this.bT = bzm.a.a;
               if (!bzm.this.aS()) {
                  bzm.this.dL().c(1039, bzm.this.dl(), 0);
               }
            } else if (bzm.this.P || bzm.this.aK > 0) {
               bzm.this.bT = bzm.a.a;
            }
         }
      }
   }
}
