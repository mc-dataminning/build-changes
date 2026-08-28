import java.util.UUID;
import javax.annotation.Nullable;

public class cgh extends cfs implements buk {
   protected static final akg<Byte> c = akk.a(cgh.class, aki.a);
   private static final int d = 25;
   private int e;
   private int bZ;
   private static final bqv ca = bad.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;

   public cgh(btq<? extends cgh> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(1, new cbm(this, 1.0, true));
      this.bT.a(2, new cbr(this, 0.9, 32.0F));
      this.bT.a(2, new cbn(this, 0.6, false));
      this.bT.a(4, new cbe(this, 0.6));
      this.bT.a(5, new cbt(this));
      this.bT.a(7, new cbk(this, cnp.class, 6.0F));
      this.bT.a(8, new cbx(this));
      this.bU.a(1, new cct(this));
      this.bU.a(2, new ccu(this));
      this.bU.a(3, new ccv<>(this, cnp.class, 10, true, false, this::a_));
      this.bU.a(3, new ccv<>(this, buh.class, 5, false, false, $$0 -> $$0 instanceof ckn && !($$0 instanceof ckh)));
      this.bU.a(4, new cdb<>(this, false));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bvl.a q() {
      return buh.E().a(bvm.s, 100.0).a(bvm.v, 0.25).a(bvm.p, 1.0).a(bvm.c, 15.0).a(bvm.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void F(btj $$0) {
      if ($$0 instanceof ckn && !($$0 instanceof ckh) && this.dV().a(20) == 0) {
         this.h((buf)$$0);
      }

      super.F($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bZ > 0) {
         this.bZ--;
      }

      if (!this.dS().B) {
         this.a((arg)this.dS(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dv().j() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(btq<?> $$0) {
      if (this.gp() && $$0 == btq.by) {
         return false;
      } else {
         return $$0 == btq.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gp());
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
      this.a(ca.a(this.af));
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

   private float gq() {
      return (float)this.h(bvm.c);
   }

   @Override
   public boolean E(btj $$0) {
      this.e = 10;
      this.dS().a(this, (byte)4);
      float $$1 = this.gq();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      bsb $$3 = this.dT().b((buf)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof buf $$5 ? $$5.h(bvm.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.dv().b(0.0, 0.4F * $$7, 0.0));
         if (this.dS() instanceof arg $$8) {
            day.a($$8, $$0, $$3);
         }
      }

      this.a(awd.np, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      btg.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(awd.nq, 1.0F, 1.0F);
      }

      return $$3;
   }

   public btg.a t() {
      return btg.a.a(this.eA() / this.eQ());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awd.np, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bZ = 400;
      } else if ($$0 == 34) {
         this.bZ = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void x(boolean $$0) {
      if ($$0) {
         this.bZ = 400;
         this.dS().a(this, (byte)11);
      } else {
         this.bZ = 0;
         this.dS().a(this, (byte)34);
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.ns;
   }

   @Override
   protected awc n_() {
      return awd.nr;
   }

   @Override
   protected brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (!$$2.a(cvo.oG)) {
         return brk.e;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return brk.e;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(awd.nt, 1.0F, $$4);
            $$2.a(1, $$0);
            return brk.a;
         }
      }
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.nu, 1.0F, 1.0F);
   }

   public int go() {
      return this.bZ;
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
   public void a(bsb $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(ddv $$0) {
      je $$1 = this.ds();
      je $$2 = $$1.e();
      dua $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            je $$5 = $$1.b($$4);
            dua $$6 = $$0.a_($$5);
            if (!ded.a($$0, $$5, $$6, $$6.y(), btq.af)) {
               return false;
            }
         }

         return ded.a($$0, $$1, $$0.a_($$1), eqc.a.g(), btq.af) && $$0.f(this);
      }
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.875F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
