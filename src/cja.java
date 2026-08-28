import java.util.UUID;
import javax.annotation.Nullable;

public class cja extends cil implements bxe {
   protected static final akh<Byte> c = akl.a(cja.class, akj.a);
   private static final int d = 25;
   private int bF;
   private int bG;
   private static final btj bH = bao.a(20, 39);
   private int bI;
   @Nullable
   private UUID bJ;

   public cja(bwj<? extends cja> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cef(this, 1.0, true));
      this.bC.a(2, new cek(this, 0.9, 32.0F));
      this.bC.a(2, new ceg(this, 0.6, false));
      this.bC.a(4, new cdx(this, 0.6));
      this.bC.a(5, new cem(this));
      this.bC.a(7, new ced(this, cqs.class, 6.0F));
      this.bC.a(8, new ceq(this));
      this.bD.a(1, new cfm(this));
      this.bD.a(2, new cfn(this));
      this.bD.a(3, new cfo<>(this, cqs.class, 10, true, false, this::a));
      this.bD.a(3, new cfo<>(this, bxb.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cnl && !($$0 instanceof cnf)));
      this.bD.a(4, new cfu<>(this, false));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bye.a j() {
      return bxb.E().a(byf.s, 100.0).a(byf.v, 0.25).a(byf.p, 1.0).a(byf.c, 15.0).a(byf.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bwa $$0) {
      if ($$0 instanceof cnl && !($$0 instanceof cnf) && this.dY().a(20) == 0) {
         this.g((bwz)$$0);
      }

      super.D($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bF > 0) {
         this.bF--;
      }

      if (this.bG > 0) {
         this.bG--;
      }

      if (!this.dV().C) {
         this.a((aro)this.dV(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bwj<?> $$0) {
      if (this.t() && $$0 == bwj.bS) {
         return false;
      } else {
         return $$0 == bwj.E ? false : super.a($$0);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.t());
      this.a_($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dV(), $$0);
   }

   @Override
   public void c() {
      this.a(bH.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bI = $$0;
   }

   @Override
   public int a() {
      return this.bI;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bJ = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bJ;
   }

   private float x() {
      return (float)this.h(byf.c);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      this.bF = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bup $$4 = this.dW().b((bwz)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bwz $$6 ? $$6.h(byf.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dfh.a($$0, $$1, $$4);
      }

      this.a(awl.nR, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      bvw.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awl.nS, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bvw.a m() {
      return bvw.a.a(this.eF() / this.eT());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bF = 10;
         this.a(awl.nR, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bG = 400;
      } else if ($$0 == 34) {
         this.bG = 0;
      } else {
         super.b($$0);
      }
   }

   public int n() {
      return this.bF;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bG = 400;
         this.dV().a(this, (byte)11);
      } else {
         this.bG = 0;
         this.dV().a(this, (byte)34);
      }
   }

   @Override
   protected awk e(bup $$0) {
      return awl.nU;
   }

   @Override
   protected awk l_() {
      return awl.nT;
   }

   @Override
   protected bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (!$$2.a(cyw.po)) {
         return bty.e;
      } else {
         float $$3 = this.eF();
         this.c(25.0F);
         if (this.eF() == $$3) {
            return bty.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awl.nV, 1.0F, $$4);
            $$2.a(1, $$0);
            return bty.a;
         }
      }
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.nW, 1.0F, 1.0F);
   }

   public int q() {
      return this.bG;
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
   public void a(bup $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dis $$0) {
      iu $$1 = this.dv();
      iu $$2 = $$1.e();
      dzo $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iu $$5 = $$1.b($$4);
            dzo $$6 = $$0.a_($$5);
            if (!dja.a($$0, $$5, $$6, $$6.y(), bwj.ap)) {
               return false;
            }
         }

         return dja.a($$0, $$1, $$0.a_($$1), evw.a.g(), bwj.ap) && $$0.f(this);
      }
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
