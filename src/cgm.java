import java.util.UUID;
import javax.annotation.Nullable;

public class cgm extends cfx implements bup {
   protected static final akg<Byte> c = akk.a(cgm.class, aki.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bra bZ = bae.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cgm(btv<? extends cgm> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbr(this, 1.0, true));
      this.bS.a(2, new cbw(this, 0.9, 32.0F));
      this.bS.a(2, new cbs(this, 0.6, false));
      this.bS.a(4, new cbj(this, 0.6));
      this.bS.a(5, new cby(this));
      this.bS.a(7, new cbp(this, cnu.class, 6.0F));
      this.bS.a(8, new ccc(this));
      this.bT.a(1, new ccy(this));
      this.bT.a(2, new ccz(this));
      this.bT.a(3, new cda<>(this, cnu.class, 10, true, false, this::a_));
      this.bT.a(3, new cda<>(this, bum.class, 5, false, false, $$0 -> $$0 instanceof cks && !($$0 instanceof ckm)));
      this.bT.a(4, new cdg<>(this, false));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bvq.a q() {
      return bum.E().a(bvr.s, 100.0).a(bvr.v, 0.25).a(bvr.p, 1.0).a(bvr.c, 15.0).a(bvr.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void F(bto $$0) {
      if ($$0 instanceof cks && !($$0 instanceof ckm) && this.dV().a(20) == 0) {
         this.h((buk)$$0);
      }

      super.F($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dS().B) {
         this.a((arh)this.dS(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dv().j() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(btv<?> $$0) {
      if (this.gq() && $$0 == btv.by) {
         return false;
      } else {
         return $$0 == btv.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gq());
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dS(), $$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   private float gr() {
      return (float)this.h(bvr.c);
   }

   @Override
   public boolean E(bto $$0) {
      this.e = 10;
      this.dS().a(this, (byte)4);
      float $$1 = this.gr();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      bsg $$3 = this.dT().b((buk)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof buk $$5 ? $$5.h(bvr.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.dv().b(0.0, 0.4F * $$7, 0.0));
         if (this.dS() instanceof arh $$8) {
            dbm.a($$8, $$0, $$3);
         }
      }

      this.a(awe.np, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      btl.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(awe.nq, 1.0F, 1.0F);
      }

      return $$3;
   }

   public btl.a t() {
      return btl.a.a(this.eA() / this.eQ());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awe.np, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bY = 400;
      } else if ($$0 == 34) {
         this.bY = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.bY = 400;
         this.dS().a(this, (byte)11);
      } else {
         this.bY = 0;
         this.dS().a(this, (byte)34);
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.ns;
   }

   @Override
   protected awd n_() {
      return awe.nr;
   }

   @Override
   protected brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (!$$2.a(cvt.oG)) {
         return brp.e;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return brp.e;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(awe.nt, 1.0F, $$4);
            $$2.a(1, $$0);
            return brp.a;
         }
      }
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.nu, 1.0F, 1.0F);
   }

   public int gp() {
      return this.bY;
   }

   public boolean gq() {
      return (this.am.a(c) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.am.a(c);
      if ($$0) {
         this.am.a(c, (byte)($$1 | 1));
      } else {
         this.am.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bsg $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dej $$0) {
      je $$1 = this.ds();
      je $$2 = $$1.e();
      duo $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            je $$5 = $$1.b($$4);
            duo $$6 = $$0.a_($$5);
            if (!der.a($$0, $$5, $$6, $$6.y(), btv.af)) {
               return false;
            }
         }

         return der.a($$0, $$1, $$0.a_($$1), eqq.a.g(), btv.af) && $$0.f(this);
      }
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.875F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
