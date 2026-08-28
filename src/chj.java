import java.util.UUID;
import javax.annotation.Nullable;

public class chj extends cgu implements bvl {
   protected static final ajx<Byte> c = akb.a(chj.class, ajz.a);
   private static final int d = 25;
   private int bY;
   private int bZ;
   private static final bru ca = bab.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;

   public chj(bur<? extends chj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cco(this, 1.0, true));
      this.bS.a(2, new cct(this, 0.9, 32.0F));
      this.bS.a(2, new ccp(this, 0.6, false));
      this.bS.a(4, new ccg(this, 0.6));
      this.bS.a(5, new ccv(this));
      this.bS.a(7, new ccm(this, cox.class, 6.0F));
      this.bS.a(8, new ccz(this));
      this.bT.a(1, new cdv(this));
      this.bT.a(2, new cdw(this));
      this.bT.a(3, new cdx<>(this, cox.class, 10, true, false, this::a));
      this.bT.a(3, new cdx<>(this, bvi.class, 5, false, false, ($$0, $$1) -> $$0 instanceof clp && !($$0 instanceof clj)));
      this.bT.a(4, new ced<>(this, false));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bwn.a m() {
      return bvi.C().a(bwo.s, 100.0).a(bwo.v, 0.25).a(bwo.p, 1.0).a(bwo.c, 15.0).a(bwo.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(buk $$0) {
      if ($$0 instanceof clp && !($$0 instanceof clj) && this.dZ().a(20) == 0) {
         this.h((bvg)$$0);
      }

      super.D($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bY > 0) {
         this.bY--;
      }

      if (this.bZ > 0) {
         this.bZ--;
      }

      if (!this.dW().C) {
         this.a((arc)this.dW(), true);
      }
   }

   @Override
   public boolean bv() {
      return this.dz().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bur<?> $$0) {
      if (this.gp() && $$0 == bur.bS) {
         return false;
      } else {
         return $$0 == bur.F ? false : super.a($$0);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gp());
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dW(), $$0);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cb = $$0;
   }

   @Override
   public int a() {
      return this.cb;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   private float gq() {
      return (float)this.h(bwo.c);
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      this.bY = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.gq();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bta $$4 = this.dX().b((bvg)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bvg $$6 ? $$6.h(bwo.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.h($$1.dz().b(0.0, 0.4F * $$8, 0.0));
         ddb.a($$0, $$1, $$4);
      }

      this.a(awa.nM, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      buh.a $$3 = this.p();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.p() != $$3) {
         this.a(awa.nN, 1.0F, 1.0F);
      }

      return $$4;
   }

   public buh.a p() {
      return buh.a.a(this.eE() / this.eS());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bY = 10;
         this.a(awa.nM, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bZ = 400;
      } else if ($$0 == 34) {
         this.bZ = 0;
      } else {
         super.b($$0);
      }
   }

   public int t() {
      return this.bY;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.bZ = 400;
         this.dW().a(this, (byte)11);
      } else {
         this.bZ = 0;
         this.dW().a(this, (byte)34);
      }
   }

   @Override
   protected avz e(bta $$0) {
      return awa.nP;
   }

   @Override
   protected avz o_() {
      return awa.nO;
   }

   @Override
   protected bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (!$$2.a(cwt.pk)) {
         return bsj.e;
      } else {
         float $$3 = this.eE();
         this.c(25.0F);
         if (this.eE() == $$3) {
            return bsj.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awa.nQ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bsj.a;
         }
      }
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.nR, 1.0F, 1.0F);
   }

   public int x() {
      return this.bZ;
   }

   public boolean gp() {
      return (this.al.a(c) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.al.a(c);
      if ($$0) {
         this.al.a(c, (byte)($$1 | 1));
      } else {
         this.al.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bta $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dgl $$0) {
      ji $$1 = this.dw();
      ji $$2 = $$1.e();
      dwx $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ji $$5 = $$1.b($$4);
            dwx $$6 = $$0.a_($$5);
            if (!dgt.a($$0, $$5, $$6, $$6.y(), bur.aq)) {
               return false;
            }
         }

         return dgt.a($$0, $$1, $$0.a_($$1), eta.a.g(), bur.aq) && $$0.f(this);
      }
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.875F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
