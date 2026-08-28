import java.util.UUID;
import javax.annotation.Nullable;

public class cjg extends cip implements bxh {
   protected static final akj<Byte> c = akn.a(cjg.class, akl.a);
   private static final int d = 25;
   private int bF;
   private int bG;
   private static final btm bH = baq.a(20, 39);
   private int bI;
   @Nullable
   private UUID bJ;

   public cjg(bwm<? extends cjg> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cei(this, 1.0, true));
      this.bC.a(2, new cen(this, 0.9, 32.0F));
      this.bC.a(2, new cej(this, 0.6, false));
      this.bC.a(4, new cea(this, 0.6));
      this.bC.a(5, new cep(this));
      this.bC.a(7, new ceg(this, cqy.class, 6.0F));
      this.bC.a(8, new cet(this));
      this.bD.a(1, new cfp(this));
      this.bD.a(2, new cfq(this));
      this.bD.a(3, new cfr<>(this, cqy.class, 10, true, false, this::a));
      this.bD.a(3, new cfr<>(this, bxe.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cnr && !($$0 instanceof cnl)));
      this.bD.a(4, new cfx<>(this, false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static byh.a j() {
      return bxe.E().a(byi.s, 100.0).a(byi.v, 0.25).a(byi.p, 1.0).a(byi.c, 15.0).a(byi.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bwd $$0) {
      if ($$0 instanceof cnr && !($$0 instanceof cnl) && this.dY().a(20) == 0) {
         this.g((bxc)$$0);
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
         this.a((arq)this.dV(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bwm<?> $$0) {
      if (this.t() && $$0 == bwm.bS) {
         return false;
      } else {
         return $$0 == bwm.E ? false : super.a($$0);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.t());
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
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
      return (float)this.h(byi.c);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      this.bF = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bus $$4 = this.dW().b((bxc)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bxc $$6 ? $$6.h(byi.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dfn.a($$0, $$1, $$4);
      }

      this.a(awn.nS, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      bvz.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awn.nT, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bvz.a m() {
      return bvz.a.a(this.eF() / this.eT());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bF = 10;
         this.a(awn.nS, 1.0F, 1.0F);
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
   protected awm e(bus $$0) {
      return awn.nV;
   }

   @Override
   protected awm l_() {
      return awn.nU;
   }

   @Override
   protected bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (!$$2.a(czc.pq)) {
         return bub.e;
      } else {
         float $$3 = this.eF();
         this.c(25.0F);
         if (this.eF() == $$3) {
            return bub.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awn.nW, 1.0F, $$4);
            $$2.a(1, $$0);
            return bub.a;
         }
      }
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.nX, 1.0F, 1.0F);
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
   public void a(bus $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(diy $$0) {
      iu $$1 = this.dv();
      iu $$2 = $$1.e();
      dzz $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iu $$5 = $$1.b($$4);
            dzz $$6 = $$0.a_($$5);
            if (!djg.a($$0, $$5, $$6, $$6.y(), bwm.ap)) {
               return false;
            }
         }

         return djg.a($$0, $$1, $$0.a_($$1), ewh.a.g(), bwm.ap) && $$0.f(this);
      }
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
