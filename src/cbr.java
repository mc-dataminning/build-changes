import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbr extends bli implements cba {
   private static final afo<Integer> bT = afr.a(cbr.class, afq.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public cbr(bku<? extends cbr> $$0, csa $$1) {
      super($$0, $$1);
      this.cD();
      this.bL = new cbr.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cbr.b(this));
      this.bO.a(2, new cbr.a(this));
      this.bO.a(3, new cbr.e(this));
      this.bO.a(5, new cbr.c(this));
      this.bP.a(1, new btu<>(this, cdu.class, 10, true, false, $$0 -> Math.abs($$0.du() - this.du()) <= 4.0));
      this.bP.a(3, new btu<>(this, bxd.class, true));
   }

   @Override
   public aqs dc() {
      return aqs.f;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = atm.a($$0, 1, 127);
      this.an.b(bT, $$2);
      this.ar();
      this.j_();
      this.a(bmm.l).a((double)($$2 * $$2));
      this.a(bmm.m).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bmm.c).a((double)$$2);
      if ($$1) {
         this.c(this.eN());
      }

      this.bJ = $$2;
   }

   public int gg() {
      return this.an.b(bT);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Size", this.gg() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(rz $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gh() {
      return this.gg() <= 1;
   }

   protected jq w() {
      return js.Q;
   }

   @Override
   protected boolean X() {
      return this.gg() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aC() && !this.bU) {
         int $$0 = this.gg();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = atm.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = atm.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dN().a(this.w(), this.ds() + (double)$$4, this.du(), this.dy() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.ge(), this.eX(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aC();
      this.gb();
   }

   @Override
   protected void gb() {
      this.d *= 0.6F;
   }

   protected int A() {
      return this.ag.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(afo<?> $$0) {
      if (bT.equals($$0)) {
         this.j_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aZ() && this.ag.a(20) == 0) {
            this.bi();
         }
      }

      super.a($$0);
   }

   @Override
   public bku<? extends cbr> ai() {
      return (bku<? extends cbr>)super.ai();
   }

   @Override
   public void a(bkq.c $$0) {
      int $$1 = this.gg();
      if (!this.dN().B && $$1 > 1 && this.ex()) {
         ur $$2 = this.af();
         boolean $$3 = this.fV();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            cbr $$10 = this.ai().a(this.dN());
            if ($$10 != null) {
               if (this.fM()) {
                  $$10.fK();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.cr());
               $$10.a($$5, true);
               $$10.b(this.ds() + (double)$$8, this.du() + 0.5, this.dy() + (double)$$9, this.ag.i() * 360.0F, 0.0F);
               this.dN().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(bkq $$0) {
      super.g($$0);
      if ($$0 instanceof bxd && this.gc()) {
         this.j((blg)$$0);
      }
   }

   @Override
   public void b_(cdu $$0) {
      if (this.gc()) {
         this.j($$0);
      }
   }

   protected void j(blg $$0) {
      if (this.bx()) {
         int $$1 = this.gg();
         if (this.f((bkq)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dO().b((blg)this), this.gd())) {
            this.a(aqr.vX, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.625F * $$1.b;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.015625F * (float)this.gg() * $$2, 0.0F);
   }

   protected boolean gc() {
      return !this.gh() && this.cZ();
   }

   protected float gd() {
      return (float)this.b(bmm.c);
   }

   @Override
   protected aqq d(bjo $$0) {
      return this.gh() ? aqr.wO : aqr.vZ;
   }

   @Override
   protected aqq m_() {
      return this.gh() ? aqr.wN : aqr.vY;
   }

   protected aqq ge() {
      return this.gh() ? aqr.wQ : aqr.wb;
   }

   public static boolean c(bku<cbr> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      if ($$1.aj() != biu.a) {
         if ($$2 == blk.c) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.s($$3).a(arf.ap) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ao() && $$1.z($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof csu)) {
            return false;
         }

         crh $$5 = new crh($$3);
         boolean $$6 = dnq.a($$5.e, $$5.f, ((csu)$$1).B(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eX() {
      return 0.4F * (float)this.gg();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gi() {
      return this.gg() > 0;
   }

   @Override
   protected void fc() {
      eju $$0 = this.dq();
      this.o($$0.c, (double)this.fa(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float u() {
      float $$0 = this.gh() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected aqq gf() {
      return this.gh() ? aqr.wP : aqr.wa;
   }

   @Override
   public bkr a(bls $$0) {
      return super.a($$0).a(0.255F * (float)this.gg());
   }

   static class a extends bsb {
      private final cbr a;
      private int b;

      public a(cbr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.b));
      }

      @Override
      public boolean a() {
         blg $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.K() instanceof cbr.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         blg $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         blg $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.K() instanceof cbr.d $$1) {
            $$1.a(this.a.dD(), this.a.gc());
         }
      }
   }

   static class b extends bsb {
      private final cbr a;

      public b(cbr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.c, bsb.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aZ() || this.a.bn()) && this.a.K() instanceof cbr.d;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.eh().i() < 0.8F) {
            this.a.M().a();
         }

         if (this.a.K() instanceof cbr.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bsb {
      private final cbr a;

      public c(cbr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.c, bsb.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.K() instanceof cbr.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bre {
      private float l;
      private int m;
      private final cbr n;
      private boolean o;

      public d(cbr $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dD() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bre.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dD(), this.l, 90.0F));
         this.d.aW = this.d.dD();
         this.d.aU = this.d.dD();
         if (this.k != bre.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bre.a.a;
            if (this.d.aC()) {
               this.d.w((float)(this.h * this.d.b(bmm.m)));
               if (this.m-- <= 0) {
                  this.m = this.n.A();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.M().a();
                  if (this.n.gi()) {
                     this.n.a(this.n.gf(), this.n.eX(), this.n.u());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bmm.m)));
            }
         }
      }
   }

   static class e extends bsb {
      private final cbr a;
      private float b;
      private int c;

      public e(cbr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aC() || this.a.aZ() || this.a.bn() || this.a.a(bkf.y)) && this.a.K() instanceof cbr.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.eh().a(60));
            this.b = (float)this.a.eh().a(360);
         }

         if (this.a.K() instanceof cbr.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
