import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbj extends bla implements cas {
   private static final afm<Integer> bT = afp.a(cbj.class, afo.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public cbj(bkm<? extends cbj> $$0, crs $$1) {
      super($$0, $$1);
      this.cC();
      this.bL = new cbj.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new cbj.b(this));
      this.bO.a(2, new cbj.a(this));
      this.bO.a(3, new cbj.e(this));
      this.bO.a(5, new cbj.c(this));
      this.bP.a(1, new btm<>(this, cdm.class, 10, true, false, $$0 -> Math.abs($$0.ds() - this.ds()) <= 4.0));
      this.bP.a(3, new btm<>(this, bwv.class, true));
   }

   @Override
   public aqo da() {
      return aqo.f;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ati.a($$0, 1, 127);
      this.an.b(bT, $$2);
      this.ap();
      this.j_();
      this.a(bme.l).a((double)($$2 * $$2));
      this.a(bme.m).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bme.c).a((double)$$2);
      if ($$1) {
         this.c(this.eL());
      }

      this.bJ = $$2;
   }

   public int gf() {
      return this.an.b(bT);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Size", this.gf() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(rz $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gg() {
      return this.gf() <= 1;
   }

   protected jq t() {
      return js.Q;
   }

   @Override
   protected boolean V() {
      return this.gf() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aA() && !this.bU) {
         int $$0 = this.gf();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = ati.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = ati.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dL().a(this.t(), this.dq() + (double)$$4, this.ds(), this.dw() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.gd(), this.eV(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aA() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aA();
      this.ga();
   }

   @Override
   protected void ga() {
      this.d *= 0.6F;
   }

   protected int y() {
      return this.ag.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.j_();
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(afm<?> $$0) {
      if (bT.equals($$0)) {
         this.j_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aX() && this.ag.a(20) == 0) {
            this.bg();
         }
      }

      super.a($$0);
   }

   @Override
   public bkm<? extends cbj> ag() {
      return (bkm<? extends cbj>)super.ag();
   }

   @Override
   public void a(bki.c $$0) {
      int $$1 = this.gf();
      if (!this.dL().B && $$1 > 1 && this.ev()) {
         ur $$2 = this.ad();
         boolean $$3 = this.fU();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            cbj $$10 = this.ag().a(this.dL());
            if ($$10 != null) {
               if (this.fL()) {
                  $$10.fJ();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.cq());
               $$10.a($$5, true);
               $$10.b(this.dq() + (double)$$8, this.ds() + 0.5, this.dw() + (double)$$9, this.ag.i() * 360.0F, 0.0F);
               this.dL().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(bki $$0) {
      super.g($$0);
      if ($$0 instanceof bwv && this.gb()) {
         this.j((bky)$$0);
      }
   }

   @Override
   public void b_(cdm $$0) {
      if (this.gb()) {
         this.j($$0);
      }
   }

   protected void j(bky $$0) {
      if (this.bv()) {
         int $$1 = this.gf();
         if (this.f((bki)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dM().b((bky)this), this.gc())) {
            this.a(aqn.vG, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.625F * $$1.b;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.015625F * (float)this.gf() * $$2, 0.0F);
   }

   protected boolean gb() {
      return !this.gg() && this.cX();
   }

   protected float gc() {
      return (float)this.b(bme.c);
   }

   @Override
   protected aqm d(bjg $$0) {
      return this.gg() ? aqn.wx : aqn.vI;
   }

   @Override
   protected aqm m_() {
      return this.gg() ? aqn.ww : aqn.vH;
   }

   protected aqm gd() {
      return this.gg() ? aqn.wz : aqn.vK;
   }

   public static boolean c(bkm<cbj> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      if ($$1.ai() != bin.a) {
         if ($$2 == blc.c) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.s($$3).a(arb.ap) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.an() && $$1.z($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof csm)) {
            return false;
         }

         cqz $$5 = new cqz($$3);
         boolean $$6 = dne.a($$5.e, $$5.f, ((csm)$$1).A(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eV() {
      return 0.4F * (float)this.gf();
   }

   @Override
   public int Y() {
      return 0;
   }

   protected boolean gh() {
      return this.gf() > 0;
   }

   @Override
   protected void fa() {
      eji $$0 = this.do();
      this.o($$0.c, (double)this.eY(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float s() {
      float $$0 = this.gg() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected aqm ge() {
      return this.gg() ? aqn.wy : aqn.vJ;
   }

   @Override
   public bkj a(blk $$0) {
      return super.a($$0).a(0.255F * (float)this.gf());
   }

   static class a extends brt {
      private final cbj a;
      private int b;

      public a(cbj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.b));
      }

      @Override
      public boolean a() {
         bky $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.I() instanceof cbj.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bky $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bky $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.I() instanceof cbj.d $$1) {
            $$1.a(this.a.dB(), this.a.gb());
         }
      }
   }

   static class b extends brt {
      private final cbj a;

      public b(cbj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.c, brt.a.a));
         $$0.L().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aX() || this.a.bl()) && this.a.I() instanceof cbj.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ef().i() < 0.8F) {
            this.a.K().a();
         }

         if (this.a.I() instanceof cbj.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends brt {
      private final cbj a;

      public c(cbj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.c, brt.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bN();
      }

      @Override
      public void e() {
         if (this.a.I() instanceof cbj.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bqw {
      private float l;
      private int m;
      private final cbj n;
      private boolean o;

      public d(cbj $$0) {
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
         this.k = bqw.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dB(), this.l, 90.0F));
         this.d.aW = this.d.dB();
         this.d.aU = this.d.dB();
         if (this.k != bqw.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bqw.a.a;
            if (this.d.aA()) {
               this.d.w((float)(this.h * this.d.b(bme.m)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.K().a();
                  if (this.n.gh()) {
                     this.n.a(this.n.ge(), this.n.eV(), this.n.s());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bme.m)));
            }
         }
      }
   }

   static class e extends brt {
      private final cbj a;
      private float b;
      private int c;

      public e(cbj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aA() || this.a.aX() || this.a.bl() || this.a.a(bjx.y)) && this.a.I() instanceof cbj.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ef().a(60));
            this.b = (float)this.a.ef().a(360);
         }

         if (this.a.I() instanceof cbj.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
