import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzk extends bix implements bza {
   public static final float b = 7.448451F;
   public static final int c = arx.f(24.166098F);
   private static final aef<Integer> d = aei.a(bzk.class, aeh.b);
   ehn e = ehn.b;
   gw bS = gw.b;
   bzk.a bT = bzk.a.a;

   public bzk(biu<? extends bzk> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new bzk.g(this);
      this.bK = new bzk.f(this);
   }

   @Override
   public boolean aS() {
      return (this.t() + this.ah) % c == 0;
   }

   @Override
   protected boz F() {
      return new bzk.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bzk.c());
      this.bO.a(2, new bzk.i());
      this.bO.a(3, new bzk.e());
      this.bP.a(1, new bzk.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, arx.a($$0, 0, 64));
   }

   private void y() {
      this.i_();
      this.a(bkm.f).a((double)(6 + this.s()));
   }

   public int s() {
      return this.an.b(d);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
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
      return this.ai() * 3;
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         float $$0 = arx.b((float)(this.t() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = arx.b((float)(this.t() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dL().a(this.dq(), this.ds(), this.dw(), ape.rL, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.s();
         float $$3 = arx.b(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = arx.a(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dL().a(ix.U, this.dq() + (double)$$3, this.ds() + (double)$$5, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
         this.dL().a(ix.U, this.dq() - (double)$$3, this.ds() + (double)$$5, this.dw() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void b_() {
      if (this.bw() && this.fX()) {
         this.g(8);
      }

      super.b_();
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      this.bS = this.dl().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new gw($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(qx $$0) {
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
   public apf db() {
      return apf.f;
   }

   @Override
   protected apd w() {
      return ape.rI;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.rM;
   }

   @Override
   protected apd l_() {
      return ape.rK;
   }

   @Override
   public bjl eR() {
      return bjl.b;
   }

   @Override
   protected float eV() {
      return 1.0F;
   }

   @Override
   public boolean a(biu<?> $$0) {
      return true;
   }

   @Override
   public bir a(bjs $$0) {
      int $$1 = this.s();
      bir $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(biq $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bqb {
      private final bts b = bts.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cbu> $$0 = bzk.this.dL().a(this.b, bzk.this, bzk.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(biq::ds).reversed());

               for (cbu $$1 : $$0) {
                  if (bzk.this.a($$1, bts.a)) {
                     bzk.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bjg $$0 = bzk.this.q();
         return $$0 != null ? bzk.this.a($$0, bts.a) : false;
      }
   }

   class c extends bqb {
      private int b;

      @Override
      public boolean a() {
         bjg $$0 = bzk.this.q();
         return $$0 != null ? bzk.this.a($$0, bts.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         bzk.this.bT = bzk.a.a;
         this.h();
      }

      @Override
      public void d() {
         bzk.this.bS = bzk.this.dL().a(dks.a.e, bzk.this.bS).b(10 + bzk.this.ag.a(20));
      }

      @Override
      public void e() {
         if (bzk.this.bT == bzk.a.a) {
            this.b--;
            if (this.b <= 0) {
               bzk.this.bT = bzk.a.b;
               this.h();
               this.b = this.a((8 + bzk.this.ag.a(4)) * 20);
               bzk.this.a(ape.rN, 10.0F, 0.95F + bzk.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         bzk.this.bS = bzk.this.q().dl().b(20 + bzk.this.ag.a(20));
         if (bzk.this.bS.v() < bzk.this.dL().y_()) {
            bzk.this.bS = new gw(bzk.this.bS.u(), bzk.this.dL().y_() + 1, bzk.this.bS.w());
         }
      }
   }

   class d extends boz {
      public d(bji $$0) {
         super($$0);
      }

      @Override
      public void a() {
         bzk.this.aW = bzk.this.aU;
         bzk.this.aU = bzk.this.dB();
      }
   }

   class e extends bzk.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return bzk.this.q() == null || bzk.this.bT == bzk.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + bzk.this.ag.i() * 10.0F;
         this.e = -4.0F + bzk.this.ag.i() * 9.0F;
         this.f = bzk.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (bzk.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + bzk.this.ag.i() * 9.0F;
         }

         if (bzk.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (bzk.this.ag.a(this.a(450)) == 0) {
            this.c = bzk.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (bzk.this.e.d < bzk.this.ds() && !bzk.this.dL().t(bzk.this.dl().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (bzk.this.e.d > bzk.this.ds() && !bzk.this.dL().t(bzk.this.dl().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (gw.b.equals(bzk.this.bS)) {
            bzk.this.bS = bzk.this.dl();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         bzk.this.e = ehn.a(bzk.this.bS).b((double)(this.d * arx.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * arx.a(this.c)));
      }
   }

   class f extends bpd {
      public f(bji $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bpe {
      private float m = 0.1F;

      public g(bji $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (bzk.this.P) {
            bzk.this.r(bzk.this.dB() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = bzk.this.e.c - bzk.this.dq();
         double $$1 = bzk.this.e.d - bzk.this.ds();
         double $$2 = bzk.this.e.e - bzk.this.dw();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = bzk.this.dB();
            float $$7 = (float)arx.d($$2, $$0);
            float $$8 = arx.g(bzk.this.dB() + 90.0F);
            float $$9 = arx.g($$7 * (180.0F / (float)Math.PI));
            bzk.this.r(arx.e($$8, $$9, 4.0F) - 90.0F);
            bzk.this.aU = bzk.this.dB();
            if (arx.d($$6, bzk.this.dB()) < 3.0F) {
               this.m = arx.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = arx.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(arx.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            bzk.this.s($$10);
            float $$11 = bzk.this.dB() + 90.0F;
            double $$12 = (double)(this.m * arx.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * arx.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * arx.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ehn $$15 = bzk.this.do();
            bzk.this.f($$15.e(new ehn($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bqb {
      public h() {
         this.a(EnumSet.of(bqb.a.a));
      }

      protected boolean h() {
         return bzk.this.e.c(bzk.this.dq(), bzk.this.ds(), bzk.this.dw()) < 4.0;
      }
   }

   class i extends bzk.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return bzk.this.q() != null && bzk.this.bT == bzk.a.b;
      }

      @Override
      public boolean b() {
         bjg $$0 = bzk.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bw()) {
            return false;
         } else {
            if ($$0 instanceof cbu $$1 && ($$0.M_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (bzk.this.ah > this.e) {
                  this.e = bzk.this.ah + 20;
                  List<buu> $$2 = bzk.this.dL().a(buu.class, bzk.this.cH().g(16.0), bit.a);

                  for (buu $$3 : $$2) {
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
         bzk.this.h(null);
         bzk.this.bT = bzk.a.a;
      }

      @Override
      public void e() {
         bjg $$0 = bzk.this.q();
         if ($$0 != null) {
            bzk.this.e = new ehn($$0.dq(), $$0.e(0.5), $$0.dw());
            if (bzk.this.cH().g(0.2F).c($$0.cH())) {
               bzk.this.C($$0);
               bzk.this.bT = bzk.a.a;
               if (!bzk.this.aT()) {
                  bzk.this.dL().c(1039, bzk.this.dl(), 0);
               }
            } else if (bzk.this.P || bzk.this.aK > 0) {
               bzk.this.bT = bzk.a.a;
            }
         }
      }
   }
}
