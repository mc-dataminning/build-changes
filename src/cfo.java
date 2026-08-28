import java.util.UUID;
import javax.annotation.Nullable;

public class cfo extends cfa implements btr {
   protected static final ajv<Byte> c = ajz.a(cfo.class, ajx.a);
   private static final int d = 25;
   private int e;
   private int ca;
   private static final bqb cb = azo.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cfo(bsw<? extends cfo> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cau(this, 1.0, true));
      this.bU.a(2, new caz(this, 0.9, 32.0F));
      this.bU.a(2, new cav(this, 0.6, false));
      this.bU.a(4, new cam(this, 0.6));
      this.bU.a(5, new cbb(this));
      this.bU.a(7, new cas(this, cmv.class, 6.0F));
      this.bU.a(8, new cbf(this));
      this.bV.a(1, new ccb(this));
      this.bV.a(2, new ccc(this));
      this.bV.a(3, new ccd<>(this, cmv.class, 10, true, false, this::a_));
      this.bV.a(3, new ccd<>(this, btn.class, 5, false, false, $$0 -> $$0 instanceof cjt && !($$0 instanceof cjn)));
      this.bV.a(4, new ccj<>(this, false));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static but.a s() {
      return btn.A().a(buu.s, 100.0).a(buu.v, 0.25).a(buu.p, 1.0).a(buu.c, 15.0).a(buu.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void E(bsq $$0) {
      if ($$0 instanceof cjt && !($$0 instanceof cjn) && this.dT().a(20) == 0) {
         this.h((btl)$$0);
      }

      super.E($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.ca > 0) {
         this.ca--;
      }

      if (!this.dQ().B) {
         this.a((aqt)this.dQ(), true);
      }
   }

   @Override
   public boolean br() {
      return this.dt().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsw<?> $$0) {
      if (this.gn() && $$0 == bsw.by) {
         return false;
      } else {
         return $$0 == bsw.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gn());
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dQ(), $$0);
   }

   @Override
   public void c() {
      this.a(cb.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.cc = $$0;
   }

   @Override
   public int a() {
      return this.cc;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cd;
   }

   private float go() {
      return (float)this.g(buu.c);
   }

   @Override
   public boolean D(bsq $$0) {
      this.e = 10;
      this.dQ().a(this, (byte)4);
      float $$1 = this.go();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      brj $$3 = this.dR().b((btl)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof btl $$5 ? $$5.g(buu.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.i($$0.dt().b(0.0, 0.4F * $$7, 0.0));
         if (this.dQ() instanceof aqt $$8) {
            dac.a($$8, $$0, $$3);
         }
      }

      this.a(avo.no, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      bso.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(avo.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bso.a t() {
      return bso.a.a(this.ex() / this.eO());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avo.no, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.ca = 400;
      } else if ($$0 == 34) {
         this.ca = 0;
      } else {
         super.b($$0);
      }
   }

   public int x() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.ca = 400;
         this.dQ().a(this, (byte)11);
      } else {
         this.ca = 0;
         this.dQ().a(this, (byte)34);
      }
   }

   @Override
   protected avn d(brj $$0) {
      return avo.nr;
   }

   @Override
   protected avn n_() {
      return avo.nq;
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (!$$2.a(cur.oF)) {
         return bqq.e;
      } else {
         float $$3 = this.ex();
         this.c(25.0F);
         if (this.ex() == $$3) {
            return bqq.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avo.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqq.a(this.dQ().B);
         }
      }
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.nt, 1.0F, 1.0F);
   }

   public int gm() {
      return this.ca;
   }

   public boolean gn() {
      return (this.ao.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(c);
      if ($$0) {
         this.ao.a(c, (byte)($$1 | 1));
      } else {
         this.ao.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(brj $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcx $$0) {
      jd $$1 = this.dq();
      jd $$2 = $$1.d();
      dta $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jd $$5 = $$1.b($$4);
            dta $$6 = $$0.a_($$5);
            if (!ddf.a($$0, $$5, $$6, $$6.u(), bsw.af)) {
               return false;
            }
         }

         return ddf.a($$0, $$1, $$0.a_($$1), eoz.a.g(), bsw.af) && $$0.f(this);
      }
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.875F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
