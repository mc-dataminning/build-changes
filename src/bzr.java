import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzr extends bji implements bza {
   private static final aef<Integer> bT = aei.a(bzr.class, aeh.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public bzr(biu<? extends bzr> $$0, cpv $$1) {
      super($$0, $$1);
      this.cD();
      this.bL = new bzr.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bzr.b(this));
      this.bO.a(2, new bzr.a(this));
      this.bO.a(3, new bzr.e(this));
      this.bO.a(5, new bzr.c(this));
      this.bP.a(1, new bru<>(this, cbu.class, 10, true, false, $$0 -> Math.abs($$0.ds() - this.ds()) <= 4.0));
      this.bP.a(3, new bru<>(this, bvd.class, true));
   }

   @Override
   public apf db() {
      return apf.f;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = arx.a($$0, 1, 127);
      this.an.b(bT, $$2);
      this.aq();
      this.i_();
      this.a(bkm.a).a((double)($$2 * $$2));
      this.a(bkm.d).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bkm.f).a((double)$$2);
      if ($$1) {
         this.c(this.eL());
      }

      this.bJ = $$2;
   }

   public int ge() {
      return this.an.b(bT);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Size", this.ge() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(qx $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gf() {
      return this.ge() <= 1;
   }

   protected iv t() {
      return ix.Q;
   }

   @Override
   protected boolean W() {
      return this.ge() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aB() && !this.bU) {
         int $$0 = this.ge();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = arx.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = arx.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dL().a(this.t(), this.dq() + (double)$$4, this.ds(), this.dw() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.gc(), this.eV(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aB() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aB();
      this.fZ();
   }

   @Override
   protected void fZ() {
      this.d *= 0.6F;
   }

   protected int y() {
      return this.ag.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.i_();
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(aef<?> $$0) {
      if (bT.equals($$0)) {
         this.i_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aY() && this.ag.a(20) == 0) {
            this.bh();
         }
      }

      super.a($$0);
   }

   @Override
   public biu<? extends bzr> ah() {
      return (biu<? extends bzr>)super.ah();
   }

   @Override
   public void a(biq.c $$0) {
      int $$1 = this.ge();
      if (!this.dL().B && $$1 > 1 && this.ev()) {
         tl $$2 = this.ae();
         boolean $$3 = this.fT();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            bzr $$10 = this.ah().a(this.dL());
            if ($$10 != null) {
               if (this.fK()) {
                  $$10.fI();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.cr());
               $$10.a($$5, true);
               $$10.b(this.dq() + (double)$$8, this.ds() + 0.5, this.dw() + (double)$$9, this.ag.i() * 360.0F, 0.0F);
               this.dL().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(biq $$0) {
      super.g($$0);
      if ($$0 instanceof bvd && this.ga()) {
         this.j((bjg)$$0);
      }
   }

   @Override
   public void b_(cbu $$0) {
      if (this.ga()) {
         this.j($$0);
      }
   }

   protected void j(bjg $$0) {
      if (this.bw()) {
         int $$1 = this.ge();
         if (this.f((biq)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dM().b((bjg)this), this.gb())) {
            this.a(ape.vC, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.625F * $$1.b;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.015625F * (float)this.ge() * $$2, 0.0F);
   }

   protected boolean ga() {
      return !this.gf() && this.cY();
   }

   protected float gb() {
      return (float)this.b(bkm.f);
   }

   @Override
   protected apd d(bho $$0) {
      return this.gf() ? ape.wt : ape.vE;
   }

   @Override
   protected apd l_() {
      return this.gf() ? ape.ws : ape.vD;
   }

   protected apd gc() {
      return this.gf() ? ape.wv : ape.vG;
   }

   public static boolean c(biu<bzr> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      if ($$1.ai() != bgv.a) {
         if ($$1.s($$3).a(aps.ap) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.an() && $$1.z($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof cqp)) {
            return false;
         }

         cpc $$5 = new cpc($$3);
         boolean $$6 = dlr.a($$5.e, $$5.f, ((cqp)$$1).A(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eV() {
      return 0.4F * (float)this.ge();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gg() {
      return this.ge() > 0;
   }

   @Override
   protected void fa() {
      ehn $$0 = this.do();
      this.o($$0.c, (double)this.eY(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      asc $$5 = $$0.D_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float s() {
      float $$0 = this.gf() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected apd gd() {
      return this.gf() ? ape.wu : ape.vF;
   }

   @Override
   public bir a(bjs $$0) {
      return super.a($$0).a(0.255F * (float)this.ge());
   }

   static class a extends bqb {
      private final bzr a;
      private int b;

      public a(bzr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.b));
      }

      @Override
      public boolean a() {
         bjg $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.I() instanceof bzr.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bjg $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bjg $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.I() instanceof bzr.d $$1) {
            $$1.a(this.a.dB(), this.a.ga());
         }
      }
   }

   static class b extends bqb {
      private final bzr a;

      public b(bzr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.c, bqb.a.a));
         $$0.L().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aY() || this.a.bm()) && this.a.I() instanceof bzr.d;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ef().i() < 0.8F) {
            this.a.K().a();
         }

         if (this.a.I() instanceof bzr.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bqb {
      private final bzr a;

      public c(bzr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.c, bqb.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.I() instanceof bzr.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bpe {
      private float l;
      private int m;
      private final bzr n;
      private boolean o;

      public d(bzr $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dB() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bpe.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dB(), this.l, 90.0F));
         this.d.aW = this.d.dB();
         this.d.aU = this.d.dB();
         if (this.k != bpe.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bpe.a.a;
            if (this.d.aB()) {
               this.d.w((float)(this.h * this.d.b(bkm.d)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.K().a();
                  if (this.n.gg()) {
                     this.n.a(this.n.gd(), this.n.eV(), this.n.s());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bkm.d)));
            }
         }
      }
   }

   static class e extends bqb {
      private final bzr a;
      private float b;
      private int c;

      public e(bzr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aB() || this.a.aY() || this.a.bm() || this.a.a(bif.y)) && this.a.I() instanceof bzr.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ef().a(60));
            this.b = (float)this.a.ef().a(360);
         }

         if (this.a.I() instanceof bzr.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
