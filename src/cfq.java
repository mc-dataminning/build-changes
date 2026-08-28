import java.util.UUID;
import javax.annotation.Nullable;

public class cfq extends cfc implements btt {
   protected static final ajw<Byte> c = aka.a(cfq.class, ajy.a);
   private static final int d = 25;
   private int e;
   private int ca;
   private static final bqc cb = azp.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cfq(bsx<? extends cfq> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bU.a(1, new caw(this, 1.0, true));
      this.bU.a(2, new cbb(this, 0.9, 32.0F));
      this.bU.a(2, new cax(this, 0.6, false));
      this.bU.a(4, new cao(this, 0.6));
      this.bU.a(5, new cbd(this));
      this.bU.a(7, new cau(this, cmx.class, 6.0F));
      this.bU.a(8, new cbh(this));
      this.bV.a(1, new ccd(this));
      this.bV.a(2, new cce(this));
      this.bV.a(3, new ccf<>(this, cmx.class, 10, true, false, this::a_));
      this.bV.a(3, new ccf<>(this, btp.class, 5, false, false, $$0 -> $$0 instanceof cjv && !($$0 instanceof cjp)));
      this.bV.a(4, new ccl<>(this, false));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 100.0).a(buw.v, 0.25).a(buw.p, 1.0).a(buw.c, 15.0).a(buw.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void E(bsr $$0) {
      if ($$0 instanceof cjv && !($$0 instanceof cjp) && this.dS().a(20) == 0) {
         this.h((btn)$$0);
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

      if (!this.dP().B) {
         this.a((aqu)this.dP(), true);
      }
   }

   @Override
   public boolean br() {
      return this.ds().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsx<?> $$0) {
      if (this.gm() && $$0 == bsx.by) {
         return false;
      } else {
         return $$0 == bsx.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gm());
      this.a_($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dP(), $$0);
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

   private float gn() {
      return (float)this.g(buw.c);
   }

   @Override
   public boolean D(bsr $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gn();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      brk $$3 = this.dQ().b((btn)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof btn $$5 ? $$5.g(buw.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.i($$0.ds().b(0.0, 0.4F * $$7, 0.0));
         if (this.dP() instanceof aqu $$8) {
            dae.a($$8, $$0, $$3);
         }
      }

      this.a(avp.no, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      bsp.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(avp.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bsp.a t() {
      return bsp.a.a(this.ex() / this.eO());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avp.no, 1.0F, 1.0F);
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
         this.dP().a(this, (byte)11);
      } else {
         this.ca = 0;
         this.dP().a(this, (byte)34);
      }
   }

   @Override
   protected avo d(brk $$0) {
      return avp.nr;
   }

   @Override
   protected avo n_() {
      return avp.nq;
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (!$$2.a(cut.oF)) {
         return bqr.e;
      } else {
         float $$3 = this.ex();
         this.c(25.0F);
         if (this.ex() == $$3) {
            return bqr.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avp.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqr.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.nt, 1.0F, 1.0F);
   }

   public int gl() {
      return this.ca;
   }

   public boolean gm() {
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
   public void a(brk $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcz $$0) {
      jd $$1 = this.dp();
      jd $$2 = $$1.e();
      dtc $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            jd $$5 = $$1.b($$4);
            dtc $$6 = $$0.a_($$5);
            if (!ddh.a($$0, $$5, $$6, $$6.u(), bsx.af)) {
               return false;
            }
         }

         return ddh.a($$0, $$1, $$0.a_($$1), epd.a.g(), bsx.af) && $$0.f(this);
      }
   }

   @Override
   public exa cN() {
      return new exa(0.0, (double)(0.875F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
