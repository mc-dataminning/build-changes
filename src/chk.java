import java.util.UUID;
import javax.annotation.Nullable;

public class chk extends cgv implements bvm {
   protected static final akm<Byte> c = akq.a(chk.class, ako.a);
   private static final int d = 25;
   private int bY;
   private int bZ;
   private static final brv ca = bao.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;

   public chk(bus<? extends chk> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccp(this, 1.0, true));
      this.bS.a(2, new ccu(this, 0.9, 32.0F));
      this.bS.a(2, new ccq(this, 0.6, false));
      this.bS.a(4, new cch(this, 0.6));
      this.bS.a(5, new ccw(this));
      this.bS.a(7, new ccn(this, cou.class, 6.0F));
      this.bS.a(8, new cda(this));
      this.bT.a(1, new cdw(this));
      this.bT.a(2, new cdx(this));
      this.bT.a(3, new cdy<>(this, cou.class, 10, true, false, this::a));
      this.bT.a(3, new cdy<>(this, bvj.class, 5, false, false, ($$0, $$1) -> $$0 instanceof clq && !($$0 instanceof clk)));
      this.bT.a(4, new cee<>(this, false));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bwo.a n() {
      return bvj.C().a(bwp.s, 100.0).a(bwp.v, 0.25).a(bwp.p, 1.0).a(bwp.c, 15.0).a(bwp.B, 1.0);
   }

   @Override
   protected int l(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bul $$0) {
      if ($$0 instanceof clq && !($$0 instanceof clk) && this.dY().a(20) == 0) {
         this.h((bvh)$$0);
      }

      super.D($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bY > 0) {
         this.bY--;
      }

      if (this.bZ > 0) {
         this.bZ--;
      }

      if (!this.dV().C) {
         this.a((arp)this.dV(), true);
      }
   }

   @Override
   public boolean bv() {
      return this.dy().j() > 2.5000003E-7F && this.ae.a(5) == 0;
   }

   @Override
   public boolean a(bus<?> $$0) {
      if (this.gn() && $$0 == bus.bO) {
         return false;
      } else {
         return $$0 == bus.D ? false : super.a($$0);
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gn());
      this.a_($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dV(), $$0);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cb = $$0;
   }

   @Override
   public int a() {
      return this.cb;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   private float go() {
      return (float)this.h(bwp.c);
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      this.bY = 10;
      $$0.a(this, (byte)4);
      float $$2 = this.go();
      float $$3 = (int)$$2 > 0 ? $$2 / 2.0F + (float)this.ae.a((int)$$2) : $$2;
      btb $$4 = this.dW().b((bvh)this);
      boolean $$5 = $$1.a($$0, $$4, $$3);
      if ($$5) {
         double $$7 = $$1 instanceof bvh $$6 ? $$6.h(bwp.p) : 0.0;
         double $$8 = Math.max(0.0, 1.0 - $$7);
         $$1.h($$1.dy().b(0.0, 0.4F * $$8, 0.0));
         dcf.a($$0, $$1, $$4);
      }

      this.a(awn.nn, 1.0F, 1.0F);
      return $$5;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      bui.a $$3 = this.q();
      boolean $$4 = super.a($$0, $$1, $$2);
      if ($$4 && this.q() != $$3) {
         this.a(awn.no, 1.0F, 1.0F);
      }

      return $$4;
   }

   public bui.a q() {
      return bui.a.a(this.eD() / this.eR());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bY = 10;
         this.a(awn.nn, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bZ = 400;
      } else if ($$0 == 34) {
         this.bZ = 0;
      } else {
         super.b($$0);
      }
   }

   public int v() {
      return this.bY;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.bZ = 400;
         this.dV().a(this, (byte)11);
      } else {
         this.bZ = 0;
         this.dV().a(this, (byte)34);
      }
   }

   @Override
   protected awm e(btb $$0) {
      return awn.nq;
   }

   @Override
   protected awm n_() {
      return awn.np;
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (!$$2.a(cwq.oG)) {
         return bsk.e;
      } else {
         float $$3 = this.eD();
         this.c(25.0F);
         if (this.eD() == $$3) {
            return bsk.e;
         } else {
            float $$4 = 1.0F + (this.ae.i() - this.ae.i()) * 0.2F;
            this.a(awn.nr, 1.0F, $$4);
            $$2.a(1, $$0);
            return bsk.a;
         }
      }
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.ns, 1.0F, 1.0F);
   }

   public int gm() {
      return this.bZ;
   }

   public boolean gn() {
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
   public void a(btb $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dfp $$0) {
      jh $$1 = this.dv();
      jh $$2 = $$1.e();
      dvv $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jh $$5 = $$1.b($$4);
            dvv $$6 = $$0.a_($$5);
            if (!dfx.a($$0, $$5, $$6, $$6.y(), bus.ao)) {
               return false;
            }
         }

         return dfx.a($$0, $$1, $$0.a_($$1), erw.a.g(), bus.ao) && $$0.f(this);
      }
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, (double)(0.875F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
