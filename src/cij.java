import java.util.UUID;
import javax.annotation.Nullable;

public class cij extends chu implements bwl {
   protected static final alc<Byte> c = alg.a(cij.class, ale.a);
   private static final int d = 25;
   private int bZ;
   private int ca;
   private static final bsu cb = bbg.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cij(bvr<? extends cij> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdo(this, 1.0, true));
      this.bT.a(2, new cdt(this, 0.9, 32.0F));
      this.bT.a(2, new cdp(this, 0.6, false));
      this.bT.a(4, new cdg(this, 0.6));
      this.bT.a(5, new cdv(this));
      this.bT.a(7, new cdm(this, cpx.class, 6.0F));
      this.bT.a(8, new cdz(this));
      this.bU.a(1, new cev(this));
      this.bU.a(2, new cew(this));
      this.bU.a(3, new cex<>(this, cpx.class, 10, true, false, this::a));
      this.bU.a(3, new cex<>(this, bwi.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cmp && !($$0 instanceof cmj)));
      this.bU.a(4, new cfd<>(this, false));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bxn.a m() {
      return bwi.C().a(bxo.s, 100.0).a(bxo.v, 0.25).a(bxo.p, 1.0).a(bxo.c, 15.0).a(bxo.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bvk $$0) {
      if ($$0 instanceof cmp && !($$0 instanceof cmj) && this.dZ().a(20) == 0) {
         this.h((bwg)$$0);
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
         this.a((ash)this.dW(), true);
      }
   }

   @Override
   public boolean bv() {
      return this.dz().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bvr<?> $$0) {
      if (this.go() && $$0 == bvr.bS) {
         return false;
      } else {
         return $$0 == bvr.F ? false : super.a($$0);
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
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
      return (float)this.h(bxo.c);
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      this.bZ = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.gp();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bua $$4 = this.dX().b((bwg)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bwg $$6 ? $$6.h(bxo.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.h($$1.dz().b(0.0, 0.4F * $$8, 0.0));
         deb.a($$0, $$1, $$4);
      }

      this.a(axf.nG, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      bvh.a $$3 = this.p();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.p() != $$3) {
         this.a(axf.nH, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bvh.a p() {
      return bvh.a.a(this.eE() / this.eS());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bZ = 10;
         this.a(axf.nG, 1.0F, 1.0F);
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
   protected axe e(bua $$0) {
      return axf.nJ;
   }

   @Override
   protected axe o_() {
      return axf.nI;
   }

   @Override
   protected btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if (!$$2.a(cxt.pb)) {
         return btj.e;
      } else {
         float $$3 = this.eE();
         this.c(25.0F);
         if (this.eE() == $$3) {
            return btj.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(axf.nK, 1.0F, $$4);
            $$2.a(1, $$0);
            return btj.a;
         }
      }
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.nL, 1.0F, 1.0F);
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
   public void a(bua $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dhl $$0) {
      jh $$1 = this.dw();
      jh $$2 = $$1.e();
      dxv $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jh $$5 = $$1.b($$4);
            dxv $$6 = $$0.a_($$5);
            if (!dht.a($$0, $$5, $$6, $$6.y(), bvr.aq)) {
               return false;
            }
         }

         return dht.a($$0, $$1, $$0.a_($$1), ety.a.g(), bvr.aq) && $$0.f(this);
      }
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.875F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
