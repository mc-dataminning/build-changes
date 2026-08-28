import java.util.UUID;
import javax.annotation.Nullable;

public class cfe extends ceq implements bti {
   protected static final ajp<Byte> c = ajt.a(cfe.class, ajr.a);
   private static final int d = 25;
   private int e;
   private int ca;
   private static final bps cb = azh.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cfe(bsn<? extends cfe> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cak(this, 1.0, true));
      this.bU.a(2, new cap(this, 0.9, 32.0F));
      this.bU.a(2, new cal(this, 0.6, false));
      this.bU.a(4, new cac(this, 0.6));
      this.bU.a(5, new car(this));
      this.bU.a(7, new cai(this, cml.class, 6.0F));
      this.bU.a(8, new cav(this));
      this.bV.a(1, new cbr(this));
      this.bV.a(2, new cbs(this));
      this.bV.a(3, new cbt<>(this, cml.class, 10, true, false, this::a_));
      this.bV.a(3, new cbt<>(this, bte.class, 5, false, false, $$0 -> $$0 instanceof cjj && !($$0 instanceof cjd)));
      this.bV.a(4, new cbz<>(this, false));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 100.0).a(buk.v, 0.25).a(buk.p, 1.0).a(buk.c, 15.0).a(buk.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void E(bsh $$0) {
      if ($$0 instanceof cjj && !($$0 instanceof cjd) && this.dU().a(20) == 0) {
         this.h((btc)$$0);
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

      if (!this.dR().B) {
         this.a((aqm)this.dR(), true);
      }
   }

   @Override
   public boolean bs() {
      return this.du().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsn<?> $$0) {
      if (this.go() && $$0 == bsn.by) {
         return false;
      } else {
         return $$0 == bsn.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dR(), $$0);
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

   private float gp() {
      return (float)this.g(buk.c);
   }

   @Override
   public boolean D(bsh $$0) {
      this.e = 10;
      this.dR().a(this, (byte)4);
      float $$1 = this.gp();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      bra $$3 = this.dS().b((btc)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof btc $$5 ? $$5.g(buk.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.j($$0.du().b(0.0, 0.4F * $$7, 0.0));
         if (this.dR() instanceof aqm $$8) {
            czo.a($$8, $$0, $$3);
         }
      }

      this.a(avh.no, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      bsf.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(avh.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bsf.a t() {
      return bsf.a.a(this.ey() / this.eP());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avh.no, 1.0F, 1.0F);
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
         this.dR().a(this, (byte)11);
      } else {
         this.ca = 0;
         this.dR().a(this, (byte)34);
      }
   }

   @Override
   protected avg d(bra $$0) {
      return avh.nr;
   }

   @Override
   protected avg n_() {
      return avh.nq;
   }

   @Override
   protected bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if (!$$2.a(cug.oF)) {
         return bqh.e;
      } else {
         float $$3 = this.ey();
         this.c(25.0F);
         if (this.ey() == $$3) {
            return bqh.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avh.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqh.a(this.dR().B);
         }
      }
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.nt, 1.0F, 1.0F);
   }

   public int gn() {
      return this.ca;
   }

   public boolean go() {
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
   public void a(bra $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcj $$0) {
      ja $$1 = this.dr();
      ja $$2 = $$1.d();
      dsl $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ja $$5 = $$1.b($$4);
            dsl $$6 = $$0.a_($$5);
            if (!dcr.a($$0, $$5, $$6, $$6.u(), bsn.af)) {
               return false;
            }
         }

         return dcr.a($$0, $$1, $$0.a_($$1), eok.a.g(), bsn.af) && $$0.f(this);
      }
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.875F * this.cN()), (double)(this.dl() * 0.4F));
   }
}
