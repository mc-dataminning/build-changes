import java.util.UUID;
import javax.annotation.Nullable;

public class chh extends cgs implements bvj {
   protected static final ako<Byte> c = aks.a(chh.class, akq.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final brs bZ = bap.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public chh(bup<? extends chh> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccm(this, 1.0, true));
      this.bS.a(2, new ccr(this, 0.9, 32.0F));
      this.bS.a(2, new ccn(this, 0.6, false));
      this.bS.a(4, new cce(this, 0.6));
      this.bS.a(5, new cct(this));
      this.bS.a(7, new cck(this, cor.class, 6.0F));
      this.bS.a(8, new ccx(this));
      this.bT.a(1, new cdt(this));
      this.bT.a(2, new cdu(this));
      this.bT.a(3, new cdv<>(this, cor.class, 10, true, false, this::a_));
      this.bT.a(3, new cdv<>(this, bvg.class, 5, false, false, $$0 -> $$0 instanceof cln && !($$0 instanceof clh)));
      this.bT.a(4, new ceb<>(this, false));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bwl.a q() {
      return bvg.E().a(bwm.s, 100.0).a(bwm.v, 0.25).a(bwm.p, 1.0).a(bwm.c, 15.0).a(bwm.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void F(bui $$0) {
      if ($$0 instanceof cln && !($$0 instanceof clh) && this.eb().a(20) == 0) {
         this.h((bve)$$0);
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

      if (!this.dY().C) {
         this.a((arq)this.dY(), true);
      }
   }

   @Override
   public boolean bx() {
      return this.dB().j() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bup<?> $$0) {
      if (this.gw() && $$0 == bup.by) {
         return false;
      } else {
         return $$0 == bup.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gw());
      this.a_($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.y($$0.q("PlayerCreated"));
      this.a(this.dY(), $$0);
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
      return (float)this.h(bwm.c);
   }

   @Override
   public boolean E(bui $$0) {
      this.e = 10;
      this.dY().a(this, (byte)4);
      float $$1 = this.gx();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      bsy $$3 = this.dZ().b((bve)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof bve $$5 ? $$5.h(bwm.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.dB().b(0.0, 0.4F * $$7, 0.0));
         if (this.dY() instanceof arq $$8) {
            dby.a($$8, $$0, $$3);
         }
      }

      this.a(awo.nn, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      buf.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(awo.no, 1.0F, 1.0F);
      }

      return $$3;
   }

   public buf.a t() {
      return buf.a.a(this.eH() / this.eW());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awo.nn, 1.0F, 1.0F);
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
         this.dY().a(this, (byte)11);
      } else {
         this.bY = 0;
         this.dY().a(this, (byte)34);
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.nq;
   }

   @Override
   protected awn o_() {
      return awo.np;
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (!$$2.a(cwj.oG)) {
         return bsh.e;
      } else {
         float $$3 = this.eH();
         this.c(25.0F);
         if (this.eH() == $$3) {
            return bsh.e;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(awo.nr, 1.0F, $$4);
            $$2.a(1, $$0);
            return bsh.a;
         }
      }
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.ns, 1.0F, 1.0F);
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
   public void a(bsy $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dfi $$0) {
      jh $$1 = this.dy();
      jh $$2 = $$1.e();
      dvo $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jh $$5 = $$1.b($$4);
            dvo $$6 = $$0.a_($$5);
            if (!dfq.a($$0, $$5, $$6, $$6.y(), bup.af)) {
               return false;
            }
         }

         return dfq.a($$0, $$1, $$0.a_($$1), erp.a.g(), bup.af) && $$0.f(this);
      }
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.875F * this.cU()), (double)(this.dt() * 0.4F));
   }
}
