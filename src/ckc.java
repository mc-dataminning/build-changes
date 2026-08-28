import java.util.UUID;
import javax.annotation.Nullable;

public class ckc extends cjj implements byb {
   protected static final akn<Byte> c = akr.a(ckc.class, akp.a);
   private static final int d = 25;
   private static final boolean e = false;
   private int f;
   private int bI;
   private static final bue bJ = bau.a(20, 39);
   private int bK;
   @Nullable
   private UUID bL;

   public ckc(bxe<? extends ckc> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfc(this, 1.0, true));
      this.bF.a(2, new cfh(this, 0.9, 32.0F));
      this.bF.a(2, new cfd(this, 0.6, false));
      this.bF.a(4, new ceu(this, 0.6));
      this.bF.a(5, new cfj(this));
      this.bF.a(7, new cfa(this, crz.class, 6.0F));
      this.bF.a(8, new cfn(this));
      this.bG.a(1, new cgj(this));
      this.bG.a(2, new cgk(this));
      this.bG.a(3, new cgl<>(this, crz.class, 10, true, false, this::a));
      this.bG.a(3, new cgl<>(this, bxy.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cot && !($$0 instanceof com)));
      this.bG.a(4, new cgr<>(this, false));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bzb.a j() {
      return bxy.E().a(bzc.s, 100.0).a(bzc.v, 0.25).a(bzc.p, 1.0).a(bzc.c, 15.0).a(bzc.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bwv $$0) {
      if ($$0 instanceof cot && !($$0 instanceof com) && this.dY().a(20) == 0) {
         this.g((bxw)$$0);
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
         this.a((aru)this.dV(), true);
      }
   }

   @Override
   public boolean bt() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bxe<?> $$0) {
      if (this.t() && $$0 == bxe.bT) {
         return false;
      } else {
         return $$0 == bxe.F ? false : super.a($$0);
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
      return (float)this.h(bzc.c);
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      this.f = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bvk $$4 = this.dW().b((bxw)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bxw $$6 ? $$6.h(bzc.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dgp.a($$0, $$1, $$4);
      }

      this.a(awr.nV, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      bwr.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awr.nW, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bwr.a m() {
      return bwr.a.a(this.eG() / this.eU());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.f = 10;
         this.a(awr.nV, 1.0F, 1.0F);
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
   protected awq e(bvk $$0) {
      return awr.nY;
   }

   @Override
   protected awq l_() {
      return awr.nX;
   }

   @Override
   protected but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (!$$2.a(dae.pt)) {
         return but.e;
      } else {
         float $$3 = this.eG();
         this.c(25.0F);
         if (this.eG() == $$3) {
            return but.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awr.nZ, 1.0F, $$4);
            $$2.a(1, $$0);
            return but.a;
         }
      }
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.oa, 1.0F, 1.0F);
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
   public void a(bvk $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dkc $$0) {
      iw $$1 = this.dv();
      iw $$2 = $$1.e();
      ebg $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iw $$5 = $$1.b($$4);
            ebg $$6 = $$0.a_($$5);
            if (!dkk.a($$0, $$5, $$6, $$6.y(), bxe.aq)) {
               return false;
            }
         }

         return dkk.a($$0, $$1, $$0.a_($$1), exr.a.g(), bxe.aq) && $$0.f(this);
      }
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
