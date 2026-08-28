import java.util.UUID;
import javax.annotation.Nullable;

public class cka extends cjh implements bxz {
   protected static final akl<Byte> c = akp.a(cka.class, akn.a);
   private static final int d = 25;
   private static final boolean e = false;
   private int f;
   private int bI;
   private static final buc bJ = bas.a(20, 39);
   private int bK;
   @Nullable
   private UUID bL;

   public cka(bxc<? extends cka> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfa(this, 1.0, true));
      this.bF.a(2, new cff(this, 0.9, 32.0F));
      this.bF.a(2, new cfb(this, 0.6, false));
      this.bF.a(4, new ces(this, 0.6));
      this.bF.a(5, new cfh(this));
      this.bF.a(7, new cey(this, crx.class, 6.0F));
      this.bF.a(8, new cfl(this));
      this.bG.a(1, new cgh(this));
      this.bG.a(2, new cgi(this));
      this.bG.a(3, new cgj<>(this, crx.class, 10, true, false, this::a));
      this.bG.a(3, new cgj<>(this, bxw.class, 5, false, false, ($$0, $$1) -> $$0 instanceof cor && !($$0 instanceof cok)));
      this.bG.a(4, new cgp<>(this, false));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static byz.a j() {
      return bxw.E().a(bza.s, 100.0).a(bza.v, 0.25).a(bza.p, 1.0).a(bza.c, 15.0).a(bza.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bwt $$0) {
      if ($$0 instanceof cor && !($$0 instanceof cok) && this.dY().a(20) == 0) {
         this.g((bxu)$$0);
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
         this.a((ars)this.dV(), true);
      }
   }

   @Override
   public boolean bt() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bxc<?> $$0) {
      if (this.t() && $$0 == bxc.bT) {
         return false;
      } else {
         return $$0 == bxc.F ? false : super.a($$0);
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
      return (float)this.h(bza.c);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      this.f = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.x();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      bvi $$4 = this.dW().b((bxu)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bxu $$6 ? $$6.h(bza.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.i($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dgn.a($$0, $$1, $$4);
      }

      this.a(awp.nV, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      bwp.a $$3 = this.m();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.m() != $$3) {
         this.a(awp.nW, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bwp.a m() {
      return bwp.a.a(this.eG() / this.eU());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.f = 10;
         this.a(awp.nV, 1.0F, 1.0F);
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
   protected awo e(bvi $$0) {
      return awp.nY;
   }

   @Override
   protected awo l_() {
      return awp.nX;
   }

   @Override
   protected bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (!$$2.a(dac.pt)) {
         return bur.e;
      } else {
         float $$3 = this.eG();
         this.c(25.0F);
         if (this.eG() == $$3) {
            return bur.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awp.nZ, 1.0F, $$4);
            $$2.a(1, $$0);
            return bur.a;
         }
      }
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.oa, 1.0F, 1.0F);
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
   public void a(bvi $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dka $$0) {
      iv $$1 = this.dv();
      iv $$2 = $$1.e();
      ebe $$3 = $$0.a_($$2);
      if (!$$3.b($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iv $$5 = $$1.b($$4);
            ebe $$6 = $$0.a_($$5);
            if (!dki.a($$0, $$5, $$6, $$6.y(), bxc.aq)) {
               return false;
            }
         }

         return dki.a($$0, $$1, $$0.a_($$1), exp.a.g(), bxc.aq) && $$0.f(this);
      }
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
