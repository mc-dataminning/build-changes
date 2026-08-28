import java.util.UUID;
import javax.annotation.Nullable;

public class cib extends chm implements bwd {
   protected static final ajx<Byte> c = akb.a(cib.class, ajz.a);
   private static final int d = 25;
   private int bF;
   private int bG;
   private static final bsj bH = bab.a(20, 39);
   private int bI;
   @Nullable
   private UUID bJ;

   public cib(bvi<? extends cib> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdg(this, 1.0, true));
      this.bC.a(2, new cdl(this, 0.9, 32.0F));
      this.bC.a(2, new cdh(this, 0.6, false));
      this.bC.a(4, new ccy(this, 0.6));
      this.bC.a(5, new cdn(this));
      this.bC.a(7, new cde(this, cpr.class, 6.0F));
      this.bC.a(8, new cdr(this));
      this.bD.a(1, new cen(this));
      this.bD.a(2, new ceo(this));
      this.bD.a(3, new cep<>(this, cpr.class, 10, true, false, this::a));
      this.bD.a(3, new cep<>(this, bwa.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cmk && !($$0 instanceof cme)));
      this.bD.a(4, new cev<>(this, false));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bxf.a j() {
      return bwa.E().a(bxg.s, 100.0).a(bxg.v, 0.25).a(bxg.p, 1.0).a(bxg.c, 15.0).a(bxg.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bva $$0) {
      if ($$0 instanceof cmk && !($$0 instanceof cme) && this.dX().a(20) == 0) {
         this.h((bvy)$$0);
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

      if (!this.dU().C) {
         this.a((ard)this.dU(), true);
      }
   }

   @Override
   public boolean bt() {
      return this.dx().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bvi<?> $$0) {
      if (this.t() && $$0 == bvi.bR) {
         return false;
      } else {
         return $$0 == bvi.E ? false : super.a($$0);
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.t());
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dU(), $$0);
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
      return (float)this.h(bxg.c);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      this.bF = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      btp $$4 = this.dV().b((bvy)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bvy $$6 ? $$6.h(bxg.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dx().b(0.0, 0.4F * $$8, 0.0));
         ddt.a($$0, $$1, $$4);
      }

      this.a(awa.nR, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      buw.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awa.nS, 1.0F, 1.0F);
      }

      return $$4;
   }

   public buw.a m() {
      return buw.a.a(this.eE() / this.eS());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bF = 10;
         this.a(awa.nR, 1.0F, 1.0F);
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
         this.dU().a(this, (byte)11);
      } else {
         this.bG = 0;
         this.dU().a(this, (byte)34);
      }
   }

   @Override
   protected avz e(btp $$0) {
      return awa.nU;
   }

   @Override
   protected avz l_() {
      return awa.nT;
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (!$$2.a(cxl.pm)) {
         return bsy.e;
      } else {
         float $$3 = this.eE();
         this.c(25.0F);
         if (this.eE() == $$3) {
            return bsy.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awa.nV, 1.0F, $$4);
            $$2.a(1, $$0);
            return bsy.a;
         }
      }
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.nW, 1.0F, 1.0F);
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
   public void a(btp $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dhc $$0) {
      ji $$1 = this.du();
      ji $$2 = $$1.e();
      dxq $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ji $$5 = $$1.b($$4);
            dxq $$6 = $$0.a_($$5);
            if (!dhk.a($$0, $$5, $$6, $$6.y(), bvi.ap)) {
               return false;
            }
         }

         return dhk.a($$0, $$1, $$0.a_($$1), etx.a.g(), bvi.ap) && $$0.f(this);
      }
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.875F * this.cR()), (double)(this.dp() * 0.4F));
   }
}
