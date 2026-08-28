import java.util.UUID;
import javax.annotation.Nullable;

public class cia extends chl implements bwc {
   protected static final aks<Byte> c = akw.a(cia.class, aku.a);
   private static final int d = 25;
   private int bZ;
   private int ca;
   private static final bsl cb = baw.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cia(bvi<? extends cia> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdf(this, 1.0, true));
      this.bT.a(2, new cdk(this, 0.9, 32.0F));
      this.bT.a(2, new cdg(this, 0.6, false));
      this.bT.a(4, new ccx(this, 0.6));
      this.bT.a(5, new cdm(this));
      this.bT.a(7, new cdd(this, cpo.class, 6.0F));
      this.bT.a(8, new cdq(this));
      this.bU.a(1, new cem(this));
      this.bU.a(2, new cen(this));
      this.bU.a(3, new ceo<>(this, cpo.class, 10, true, false, this::a));
      this.bU.a(3, new ceo<>(this, bvz.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cmg && !($$0 instanceof cma)));
      this.bU.a(4, new ceu<>(this, false));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bxe.a m() {
      return bvz.C().a(bxf.s, 100.0).a(bxf.v, 0.25).a(bxf.p, 1.0).a(bxf.c, 15.0).a(bxf.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bvb $$0) {
      if ($$0 instanceof cmg && !($$0 instanceof cma) && this.dZ().a(20) == 0) {
         this.h((bvx)$$0);
      }

      super.D($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.ca > 0) {
         this.ca--;
      }

      if (!this.dW().C) {
         this.a((arx)this.dW(), true);
      }
   }

   @Override
   public boolean bv() {
      return this.dz().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bvi<?> $$0) {
      if (this.go() && $$0 == bvi.bS) {
         return false;
      } else {
         return $$0 == bvi.F ? false : super.a($$0);
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.a_($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dW(), $$0);
   }

   @Override
   public void c() {
      this.a(cb.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cc = $$0;
   }

   @Override
   public int a() {
      return this.cc;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cd;
   }

   private float gp() {
      return (float)this.h(bxf.c);
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      this.bZ = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.gp();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      btr $$4 = this.dX().b((bvx)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bvx $$6 ? $$6.h(bxf.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.h($$1.dz().b(0.0, 0.4F * $$8, 0.0));
         dds.a($$0, $$1, $$4);
      }

      this.a(awv.nM, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      buy.a $$3 = this.p();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.p() != $$3) {
         this.a(awv.nN, 1.0F, 1.0F);
      }

      return $$4;
   }

   public buy.a p() {
      return buy.a.a(this.eE() / this.eS());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bZ = 10;
         this.a(awv.nM, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.ca = 400;
      } else if ($$0 == 34) {
         this.ca = 0;
      } else {
         super.b($$0);
      }
   }

   public int t() {
      return this.bZ;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.ca = 400;
         this.dW().a(this, (byte)11);
      } else {
         this.ca = 0;
         this.dW().a(this, (byte)34);
      }
   }

   @Override
   protected awu e(btr $$0) {
      return awv.nP;
   }

   @Override
   protected awu o_() {
      return awv.nO;
   }

   @Override
   protected bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if (!$$2.a(cxk.pk)) {
         return bta.e;
      } else {
         float $$3 = this.eE();
         this.c(25.0F);
         if (this.eE() == $$3) {
            return bta.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awv.nQ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bta.a;
         }
      }
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.nR, 1.0F, 1.0F);
   }

   public int x() {
      return this.ca;
   }

   public boolean go() {
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
   public void a(btr $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dhc $$0) {
      jh $$1 = this.dw();
      jh $$2 = $$1.e();
      dxo $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jh $$5 = $$1.b($$4);
            dxo $$6 = $$0.a_($$5);
            if (!dhk.a($$0, $$5, $$6, $$6.y(), bvi.aq)) {
               return false;
            }
         }

         return dhk.a($$0, $$1, $$0.a_($$1), etr.a.g(), bvi.aq) && $$0.f(this);
      }
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.875F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
