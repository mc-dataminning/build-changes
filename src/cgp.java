import java.util.UUID;
import javax.annotation.Nullable;

public class cgp extends cga implements bus {
   protected static final akh<Byte> c = akl.a(cgp.class, akj.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final brd bZ = bag.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cgp(bty<? extends cgp> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbu(this, 1.0, true));
      this.bS.a(2, new cbz(this, 0.9, 32.0F));
      this.bS.a(2, new cbv(this, 0.6, false));
      this.bS.a(4, new cbm(this, 0.6));
      this.bS.a(5, new ccb(this));
      this.bS.a(7, new cbs(this, cnx.class, 6.0F));
      this.bS.a(8, new ccf(this));
      this.bT.a(1, new cdb(this));
      this.bT.a(2, new cdc(this));
      this.bT.a(3, new cdd<>(this, cnx.class, 10, true, false, this::a_));
      this.bT.a(3, new cdd<>(this, bup.class, 5, false, false, $$0 -> $$0 instanceof ckv && !($$0 instanceof ckp)));
      this.bT.a(4, new cdj<>(this, false));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bvt.a q() {
      return bup.E().a(bvu.s, 100.0).a(bvu.v, 0.25).a(bvu.p, 1.0).a(bvu.c, 15.0).a(bvu.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void F(btr $$0) {
      if ($$0 instanceof ckv && !($$0 instanceof ckp) && this.dV().a(20) == 0) {
         this.h((bun)$$0);
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

      if (!this.dS().B) {
         this.a((arj)this.dS(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dv().j() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bty<?> $$0) {
      if (this.gp() && $$0 == bty.by) {
         return false;
      } else {
         return $$0 == bty.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gp());
      this.a_($$0);
   }

   @Override
   public void a(ug $$0) {
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

   private float gq() {
      return (float)this.h(bvu.c);
   }

   @Override
   public boolean E(btr $$0) {
      this.e = 10;
      this.dS().a(this, (byte)4);
      float $$1 = this.gq();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      bsj $$3 = this.dT().b((bun)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof bun $$5 ? $$5.h(bvu.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.dv().b(0.0, 0.4F * $$7, 0.0));
         if (this.dS() instanceof arj $$8) {
            dbp.a($$8, $$0, $$3);
         }
      }

      this.a(awg.np, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      bto.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(awg.nq, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bto.a t() {
      return bto.a.a(this.eB() / this.eQ());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awg.np, 1.0F, 1.0F);
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
   protected awf d(bsj $$0) {
      return awg.ns;
   }

   @Override
   protected awf o_() {
      return awg.nr;
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (!$$2.a(cvw.oG)) {
         return brs.e;
      } else {
         float $$3 = this.eB();
         this.c(25.0F);
         if (this.eB() == $$3) {
            return brs.e;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(awg.nt, 1.0F, $$4);
            $$2.a(1, $$0);
            return brs.a;
         }
      }
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.nu, 1.0F, 1.0F);
   }

   public int go() {
      return this.bY;
   }

   public boolean gp() {
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
   public void a(bsj $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dem $$0) {
      jf $$1 = this.ds();
      jf $$2 = $$1.e();
      dus $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jf $$5 = $$1.b($$4);
            dus $$6 = $$0.a_($$5);
            if (!deu.a($$0, $$5, $$6, $$6.y(), bty.af)) {
               return false;
            }
         }

         return deu.a($$0, $$1, $$0.a_($$1), equ.a.g(), bty.af) && $$0.f(this);
      }
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.875F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
