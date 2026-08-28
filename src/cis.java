import java.util.UUID;
import javax.annotation.Nullable;

public class cis extends cid implements bww {
   protected static final akg<Byte> c = akk.a(cis.class, aki.a);
   private static final int d = 25;
   private int bE;
   private int bF;
   private static final btb bG = bam.a(20, 39);
   private int bH;
   @Nullable
   private UUID bI;

   public cis(bwb<? extends cis> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdx(this, 1.0, true));
      this.bB.a(2, new cec(this, 0.9, 32.0F));
      this.bB.a(2, new cdy(this, 0.6, false));
      this.bB.a(4, new cdp(this, 0.6));
      this.bB.a(5, new cee(this));
      this.bB.a(7, new cdv(this, cqi.class, 6.0F));
      this.bB.a(8, new cei(this));
      this.bC.a(1, new cfe(this));
      this.bC.a(2, new cff(this));
      this.bC.a(3, new cfg<>(this, cqi.class, 10, true, false, this::a));
      this.bC.a(3, new cfg<>(this, bwt.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cnb && !($$0 instanceof cmv)));
      this.bC.a(4, new cfm<>(this, false));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bxw.a j() {
      return bwt.E().a(bxx.s, 100.0).a(bxx.v, 0.25).a(bxx.p, 1.0).a(bxx.c, 15.0).a(bxx.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bvs $$0) {
      if ($$0 instanceof cnb && !($$0 instanceof cmv) && this.dY().a(20) == 0) {
         this.h((bwr)$$0);
      }

      super.D($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bE > 0) {
         this.bE--;
      }

      if (this.bF > 0) {
         this.bF--;
      }

      if (!this.dV().C) {
         this.a((arn)this.dV(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bwb<?> $$0) {
      if (this.t() && $$0 == bwb.bR) {
         return false;
      } else {
         return $$0 == bwb.E ? false : super.a($$0);
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.t());
      this.a_($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dV(), $$0);
   }

   @Override
   public void c() {
      this.a(bG.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bH = $$0;
   }

   @Override
   public int a() {
      return this.bH;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bI = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bI;
   }

   private float x() {
      return (float)this.h(bxx.c);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      this.bE = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      buh $$4 = this.dW().b((bwr)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bwr $$6 ? $$6.h(bxx.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dej.a($$0, $$1, $$4);
      }

      this.a(awk.nR, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      bvo.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awk.nS, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bvo.a m() {
      return bvo.a.a(this.eF() / this.eT());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bE = 10;
         this.a(awk.nR, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bF = 400;
      } else if ($$0 == 34) {
         this.bF = 0;
      } else {
         super.b($$0);
      }
   }

   public int n() {
      return this.bE;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bF = 400;
         this.dV().a(this, (byte)11);
      } else {
         this.bF = 0;
         this.dV().a(this, (byte)34);
      }
   }

   @Override
   protected awj e(buh $$0) {
      return awk.nU;
   }

   @Override
   protected awj l_() {
      return awk.nT;
   }

   @Override
   protected btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (!$$2.a(cyc.po)) {
         return btq.e;
      } else {
         float $$3 = this.eF();
         this.c(25.0F);
         if (this.eF() == $$3) {
            return btq.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awk.nV, 1.0F, $$4);
            $$2.a(1, $$0);
            return btq.a;
         }
      }
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.nW, 1.0F, 1.0F);
   }

   public int q() {
      return this.bF;
   }

   public boolean t() {
      return (this.al.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         this.al.a(c, (byte)($$1 | 1));
      } else {
         this.al.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(buh $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dhs $$0) {
      jj $$1 = this.dv();
      jj $$2 = $$1.e();
      dym $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jj $$5 = $$1.b($$4);
            dym $$6 = $$0.a_($$5);
            if (!dia.a($$0, $$5, $$6, $$6.y(), bwb.ap)) {
               return false;
            }
         }

         return dia.a($$0, $$1, $$0.a_($$1), euu.a.g(), bwb.ap) && $$0.f(this);
      }
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
