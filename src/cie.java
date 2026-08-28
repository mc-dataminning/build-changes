import java.util.UUID;
import javax.annotation.Nullable;

public class cie extends chp implements bwg {
   protected static final alc<Byte> c = alg.a(cie.class, ale.a);
   private static final int d = 25;
   private int bZ;
   private int ca;
   private static final bsp cb = bbg.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cie(bvm<? extends cie> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdj(this, 1.0, true));
      this.bT.a(2, new cdo(this, 0.9, 32.0F));
      this.bT.a(2, new cdk(this, 0.6, false));
      this.bT.a(4, new cdb(this, 0.6));
      this.bT.a(5, new cdq(this));
      this.bT.a(7, new cdh(this, cps.class, 6.0F));
      this.bT.a(8, new cdu(this));
      this.bU.a(1, new ceq(this));
      this.bU.a(2, new cer(this));
      this.bU.a(3, new ces<>(this, cps.class, 10, true, false, this::a));
      this.bU.a(3, new ces<>(this, bwd.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cmk && !($$0 instanceof cme)));
      this.bU.a(4, new cey<>(this, false));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bxi.a m() {
      return bwd.C().a(bxj.s, 100.0).a(bxj.v, 0.25).a(bxj.p, 1.0).a(bxj.c, 15.0).a(bxj.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bvf $$0) {
      if ($$0 instanceof cmk && !($$0 instanceof cme) && this.dY().a(20) == 0) {
         this.h((bwb)$$0);
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

      if (!this.dV().C) {
         this.a((ash)this.dV(), true);
      }
   }

   @Override
   public boolean bv() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bvm<?> $$0) {
      if (this.gm() && $$0 == bvm.bS) {
         return false;
      } else {
         return $$0 == bvm.F ? false : super.a($$0);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gm());
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dV(), $$0);
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

   private float gn() {
      return (float)this.h(bxj.c);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      this.bZ = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.gn();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      btv $$4 = this.dW().b((bwb)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bwb $$6 ? $$6.h(bxj.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.h($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         ddt.a($$0, $$1, $$4);
      }

      this.a(axf.nF, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      bvc.a $$3 = this.p();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.p() != $$3) {
         this.a(axf.nG, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bvc.a p() {
      return bvc.a.a(this.eD() / this.eR());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bZ = 10;
         this.a(axf.nF, 1.0F, 1.0F);
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
         this.dV().a(this, (byte)11);
      } else {
         this.ca = 0;
         this.dV().a(this, (byte)34);
      }
   }

   @Override
   protected axe e(btv $$0) {
      return axf.nI;
   }

   @Override
   protected axe o_() {
      return axf.nH;
   }

   @Override
   protected bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (!$$2.a(cxo.pb)) {
         return bte.e;
      } else {
         float $$3 = this.eD();
         this.c(25.0F);
         if (this.eD() == $$3) {
            return bte.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(axf.nJ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bte.a;
         }
      }
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.nK, 1.0F, 1.0F);
   }

   public int x() {
      return this.ca;
   }

   public boolean gm() {
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
   public void a(btv $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dhd $$0) {
      jh $$1 = this.dv();
      jh $$2 = $$1.e();
      dxn $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jh $$5 = $$1.b($$4);
            dxn $$6 = $$0.a_($$5);
            if (!dhl.a($$0, $$5, $$6, $$6.y(), bvm.aq)) {
               return false;
            }
         }

         return dhl.a($$0, $$1, $$0.a_($$1), etq.a.g(), bvm.aq) && $$0.f(this);
      }
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
