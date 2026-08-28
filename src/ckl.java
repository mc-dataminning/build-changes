import java.util.UUID;
import javax.annotation.Nullable;

public class ckl extends cjs implements byk {
   protected static final aku<Byte> c = aky.a(ckl.class, akw.a);
   private static final int d = 25;
   private static final boolean e = false;
   private int f;
   private int bI;
   private static final bun bJ = bbd.a(20, 39);
   private int bK;
   @Nullable
   private UUID bL;

   public ckl(bxn<? extends ckl> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfl(this, 1.0, true));
      this.bF.a(2, new cfq(this, 0.9, 32.0F));
      this.bF.a(2, new cfm(this, 0.6, false));
      this.bF.a(4, new cfd(this, 0.6));
      this.bF.a(5, new cfs(this));
      this.bF.a(7, new cfj(this, csi.class, 6.0F));
      this.bF.a(8, new cfw(this));
      this.bG.a(1, new cgs(this));
      this.bG.a(2, new cgt(this));
      this.bG.a(3, new cgu<>(this, csi.class, 10, true, false, this::a));
      this.bG.a(3, new cgu<>(this, byh.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cpc && !($$0 instanceof cow)));
      this.bG.a(4, new cha<>(this, false));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bzk.a j() {
      return byh.E().a(bzl.s, 100.0).a(bzl.v, 0.25).a(bzl.p, 1.0).a(bzl.c, 15.0).a(bzl.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bxe $$0) {
      if ($$0 instanceof cpc && !($$0 instanceof cow) && this.dY().a(20) == 0) {
         this.g((byf)$$0);
      }

      super.D($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (this.f > 0) {
         this.f--;
      }

      if (this.bI > 0) {
         this.bI--;
      }

      if (!this.dV().C) {
         this.a((asb)this.dV(), true);
      }
   }

   @Override
   public boolean bt() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bxn<?> $$0) {
      if (this.t() && $$0 == bxn.bT) {
         return false;
      } else {
         return $$0 == bxn.F ? false : super.a($$0);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.t());
      this.a_($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.x($$0.b("PlayerCreated", false));
      this.a(this.dV(), $$0);
   }

   @Override
   public void c() {
      this.a(bJ.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bK = $$0;
   }

   @Override
   public int a() {
      return this.bK;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bL = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bL;
   }

   private float x() {
      return (float)this.h(bzl.c);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      this.f = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bvt $$4 = this.dW().b((byf)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof byf $$6 ? $$6.h(bzl.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dgz.a($$0, $$1, $$4);
      }

      this.a(awy.nV, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      bxa.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awy.nW, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bxa.a m() {
      return bxa.a.a(this.eG() / this.eU());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.f = 10;
         this.a(awy.nV, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bI = 400;
      } else if ($$0 == 34) {
         this.bI = 0;
      } else {
         super.b($$0);
      }
   }

   public int n() {
      return this.f;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bI = 400;
         this.dV().a(this, (byte)11);
      } else {
         this.bI = 0;
         this.dV().a(this, (byte)34);
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.nY;
   }

   @Override
   protected awx l_() {
      return awy.nX;
   }

   @Override
   protected bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (!$$2.a(dao.pt)) {
         return bvc.e;
      } else {
         float $$3 = this.eG();
         this.c(25.0F);
         if (this.eG() == $$3) {
            return bvc.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awy.nZ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bvc.a;
         }
      }
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.oa, 1.0F, 1.0F);
   }

   public int q() {
      return this.bI;
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
   public void a(bvt $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dkm $$0) {
      iw $$1 = this.dv();
      iw $$2 = $$1.e();
      ebq $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iw $$5 = $$1.b($$4);
            ebq $$6 = $$0.a_($$5);
            if (!dku.a($$0, $$5, $$6, $$6.y(), bxn.aq)) {
               return false;
            }
         }

         return dku.a($$0, $$1, $$0.a_($$1), eyb.a.g(), bxn.aq) && $$0.f(this);
      }
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
