import java.util.UUID;
import javax.annotation.Nullable;

public class cgy extends cgj implements bva {
   protected static final akk<Byte> c = ako.a(cgy.class, akm.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final brj bZ = bak.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cgy(bug<? extends cgy> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccd(this, 1.0, true));
      this.bS.a(2, new cci(this, 0.9, 32.0F));
      this.bS.a(2, new cce(this, 0.6, false));
      this.bS.a(4, new cbv(this, 0.6));
      this.bS.a(5, new cck(this));
      this.bS.a(7, new ccb(this, coh.class, 6.0F));
      this.bS.a(8, new cco(this));
      this.bT.a(1, new cdk(this));
      this.bT.a(2, new cdl(this));
      this.bT.a(3, new cdm<>(this, coh.class, 10, true, false, this::a_));
      this.bT.a(3, new cdm<>(this, bux.class, 5, false, false, $$0 -> $$0 instanceof cle && !($$0 instanceof cky)));
      this.bT.a(4, new cds<>(this, false));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bwc.a q() {
      return bux.E().a(bwd.s, 100.0).a(bwd.v, 0.25).a(bwd.p, 1.0).a(bwd.c, 15.0).a(bwd.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void F(btz $$0) {
      if ($$0 instanceof cle && !($$0 instanceof cky) && this.ea().a(20) == 0) {
         this.h((buv)$$0);
      }

      super.F($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dX().C) {
         this.a((arm)this.dX(), true);
      }
   }

   @Override
   public boolean bw() {
      return this.dA().j() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bug<?> $$0) {
      if (this.gw() && $$0 == bug.by) {
         return false;
      } else {
         return $$0 == bug.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gw());
      this.a_($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dX(), $$0);
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

   private float gx() {
      return (float)this.h(bwd.c);
   }

   @Override
   public boolean E(btz $$0) {
      this.e = 10;
      this.dX().a(this, (byte)4);
      float $$1 = this.gx();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      bsp $$3 = this.dY().b((buv)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof buv $$5 ? $$5.h(bwd.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.dA().b(0.0, 0.4F * $$7, 0.0));
         if (this.dX() instanceof arm $$8) {
            dbo.a($$8, $$0, $$3);
         }
      }

      this.a(awk.nn, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      btw.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(awk.no, 1.0F, 1.0F);
      }

      return $$3;
   }

   public btw.a t() {
      return btw.a.a(this.eG() / this.eV());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awk.nn, 1.0F, 1.0F);
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
         this.dX().a(this, (byte)11);
      } else {
         this.bY = 0;
         this.dX().a(this, (byte)34);
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.nq;
   }

   @Override
   protected awj o_() {
      return awk.np;
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if (!$$2.a(cwb.oG)) {
         return bry.e;
      } else {
         float $$3 = this.eG();
         this.c(25.0F);
         if (this.eG() == $$3) {
            return bry.e;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(awk.nr, 1.0F, $$4);
            $$2.a(1, $$0);
            return bry.a;
         }
      }
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.ns, 1.0F, 1.0F);
   }

   public int gv() {
      return this.bY;
   }

   public boolean gw() {
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
   public void a(bsp $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dey $$0) {
      jg $$1 = this.dx();
      jg $$2 = $$1.e();
      dvd $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jg $$5 = $$1.b($$4);
            dvd $$6 = $$0.a_($$5);
            if (!dfg.a($$0, $$5, $$6, $$6.y(), bug.af)) {
               return false;
            }
         }

         return dfg.a($$0, $$1, $$0.a_($$1), erf.a.g(), bug.af) && $$0.f(this);
      }
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.875F * this.cT()), (double)(this.ds() * 0.4F));
   }
}
