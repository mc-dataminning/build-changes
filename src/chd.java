import java.util.UUID;
import javax.annotation.Nullable;

public class chd extends cgo implements bvf {
   protected static final akl<Byte> c = akp.a(chd.class, akn.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bro bZ = bal.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public chd(bul<? extends chd> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cci(this, 1.0, true));
      this.bS.a(2, new ccn(this, 0.9, 32.0F));
      this.bS.a(2, new ccj(this, 0.6, false));
      this.bS.a(4, new cca(this, 0.6));
      this.bS.a(5, new ccp(this));
      this.bS.a(7, new ccg(this, com.class, 6.0F));
      this.bS.a(8, new cct(this));
      this.bT.a(1, new cdp(this));
      this.bT.a(2, new cdq(this));
      this.bT.a(3, new cdr<>(this, com.class, 10, true, false, this::a_));
      this.bT.a(3, new cdr<>(this, bvc.class, 5, false, false, $$0 -> $$0 instanceof clj && !($$0 instanceof cld)));
      this.bT.a(4, new cdx<>(this, false));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bwh.a q() {
      return bvc.E().a(bwi.s, 100.0).a(bwi.v, 0.25).a(bwi.p, 1.0).a(bwi.c, 15.0).a(bwi.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void F(bue $$0) {
      if ($$0 instanceof clj && !($$0 instanceof cld) && this.ea().a(20) == 0) {
         this.h((bva)$$0);
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
         this.a((arn)this.dX(), true);
      }
   }

   @Override
   public boolean bw() {
      return this.dA().j() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bul<?> $$0) {
      if (this.gv() && $$0 == bul.by) {
         return false;
      } else {
         return $$0 == bul.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gv());
      this.a_($$0);
   }

   @Override
   public void a(uk $$0) {
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

   private float gw() {
      return (float)this.h(bwi.c);
   }

   @Override
   public boolean E(bue $$0) {
      this.e = 10;
      this.dX().a(this, (byte)4);
      float $$1 = this.gw();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      bsu $$3 = this.dY().b((bva)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof bva $$5 ? $$5.h(bwi.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.dA().b(0.0, 0.4F * $$7, 0.0));
         if (this.dX() instanceof arn $$8) {
            dbu.a($$8, $$0, $$3);
         }
      }

      this.a(awl.nn, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      bub.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(awl.no, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bub.a t() {
      return bub.a.a(this.eG() / this.eV());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awl.nn, 1.0F, 1.0F);
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
   protected awk d(bsu $$0) {
      return awl.nq;
   }

   @Override
   protected awk o_() {
      return awl.np;
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (!$$2.a(cwf.oG)) {
         return bsd.e;
      } else {
         float $$3 = this.eG();
         this.c(25.0F);
         if (this.eG() == $$3) {
            return bsd.e;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(awl.nr, 1.0F, $$4);
            $$2.a(1, $$0);
            return bsd.a;
         }
      }
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.ns, 1.0F, 1.0F);
   }

   public int gu() {
      return this.bY;
   }

   public boolean gv() {
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
   public void a(bsu $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dfe $$0) {
      jh $$1 = this.dx();
      jh $$2 = $$1.e();
      dvj $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jh $$5 = $$1.b($$4);
            dvj $$6 = $$0.a_($$5);
            if (!dfm.a($$0, $$5, $$6, $$6.y(), bul.af)) {
               return false;
            }
         }

         return dfm.a($$0, $$1, $$0.a_($$1), erl.a.g(), bul.af) && $$0.f(this);
      }
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.875F * this.cT()), (double)(this.ds() * 0.4F));
   }
}
