import java.util.UUID;
import javax.annotation.Nullable;

public class ceq extends cec implements bsu {
   protected static final ajy<Byte> c = akc.a(ceq.class, aka.a);
   private static final int d = 25;
   private int e;
   private int ch;
   private static final bpl ci = azl.a(20, 39);
   private int cj;
   @Nullable
   private UUID ck;

   public ceq(bsb<? extends ceq> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzv(this, 1.0, true));
      this.cb.a(2, new caa(this, 0.9, 32.0F));
      this.cb.a(2, new bzw(this, 0.6, false));
      this.cb.a(4, new bzn(this, 0.6));
      this.cb.a(5, new cac(this));
      this.cb.a(7, new bzt(this, cly.class, 6.0F));
      this.cb.a(8, new cag(this));
      this.cc.a(1, new cbc(this));
      this.cc.a(2, new cbd(this));
      this.cc.a(3, new cbe<>(this, cly.class, 10, true, false, this::a_));
      this.cc.a(3, new cbe<>(this, bsq.class, 5, false, false, $$0 -> $$0 instanceof ciu && !($$0 instanceof cio)));
      this.cc.a(4, new cbk<>(this, false));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 100.0).a(btv.r, 0.25).a(btv.n, 1.0).a(btv.c, 15.0).a(btv.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(brv $$0) {
      if ($$0 instanceof ciu && !($$0 instanceof cio) && this.et().a(20) == 0) {
         this.h((bso)$$0);
      }

      super.D($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.ch > 0) {
         this.ch--;
      }

      if (!this.dU().C) {
         this.a_((aqt)this.dU(), true);
      }
   }

   @Override
   public boolean bu() {
      return this.dx().i() > 2.5000003E-7F && this.al.a(5) == 0;
   }

   @Override
   public boolean a(bsb<?> $$0) {
      if (this.gz() && $$0 == bsb.bE) {
         return false;
      } else {
         return $$0 == bsb.z ? false : super.a($$0);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gz());
      this.c($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dU(), $$0);
   }

   @Override
   public void c() {
      this.a(ci.a(this.al));
   }

   @Override
   public void a(int $$0) {
      this.cj = $$0;
   }

   @Override
   public int a() {
      return this.cj;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ck = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ck;
   }

   private float gA() {
      return (float)this.g(btv.c);
   }

   @Override
   public boolean C(brv $$0) {
      this.e = 10;
      this.dU().a(this, (byte)4);
      float $$1 = this.gA();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.al.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dX().b((bso)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bso $$4 ? $$4.g(btv.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dx().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(avo.nE, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      brt.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(avo.nF, 1.0F, 1.0F);
      }

      return $$3;
   }

   public brt.a t() {
      return brt.a.a(this.eI() / this.eZ());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avo.nE, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.ch = 400;
      } else if ($$0 == 34) {
         this.ch = 0;
      } else {
         super.b($$0);
      }
   }

   public int x() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.ch = 400;
         this.dU().a(this, (byte)11);
      } else {
         this.ch = 0;
         this.dU().a(this, (byte)34);
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.nH;
   }

   @Override
   protected avn n_() {
      return avo.nG;
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (!$$2.a(cuk.pX)) {
         return bqa.d;
      } else {
         float $$3 = this.eI();
         this.c(25.0F);
         if (this.eI() == $$3) {
            return bqa.d;
         } else {
            float $$4 = 1.0F + (this.al.i() - this.al.i()) * 0.2F;
            this.a(avo.nI, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqa.a(this.dU().C);
         }
      }
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.nJ, 1.0F, 1.0F);
   }

   public int gy() {
      return this.ch;
   }

   public boolean gz() {
      return (this.as.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.as.a(c);
      if ($$0) {
         this.as.a(c, (byte)($$1 | 1));
      } else {
         this.as.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bqt $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcd $$0) {
      ir $$1 = this.du();
      ir $$2 = $$1.d();
      dtc $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ir $$5 = $$1.b($$4);
            dtc $$6 = $$0.a_($$5);
            if (!dcl.a($$0, $$5, $$6, $$6.u(), bsb.ah)) {
               return false;
            }
         }

         return dcl.a($$0, $$1, $$0.a_($$1), epf.a.g(), bsb.ah) && $$0.f(this);
      }
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.875F * this.cQ()), (double)(this.do() * 0.4F));
   }
}
