import java.util.UUID;
import javax.annotation.Nullable;

public class cfd extends cep implements bth {
   protected static final ajp<Byte> c = ajt.a(cfd.class, ajr.a);
   private static final int d = 25;
   private int e;
   private int ca;
   private static final bpr cb = azh.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cfd(bsm<? extends cfd> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new caj(this, 1.0, true));
      this.bU.a(2, new cao(this, 0.9, 32.0F));
      this.bU.a(2, new cak(this, 0.6, false));
      this.bU.a(4, new cab(this, 0.6));
      this.bU.a(5, new caq(this));
      this.bU.a(7, new cah(this, cmk.class, 6.0F));
      this.bU.a(8, new cau(this));
      this.bV.a(1, new cbq(this));
      this.bV.a(2, new cbr(this));
      this.bV.a(3, new cbs<>(this, cmk.class, 10, true, false, this::a_));
      this.bV.a(3, new cbs<>(this, btd.class, 5, false, false, $$0 -> $$0 instanceof cji && !($$0 instanceof cjc)));
      this.bV.a(4, new cby<>(this, false));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 100.0).a(buj.v, 0.25).a(buj.p, 1.0).a(buj.c, 15.0).a(buj.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void E(bsg $$0) {
      if ($$0 instanceof cji && !($$0 instanceof cjc) && this.dT().a(20) == 0) {
         this.h((btb)$$0);
      }

      super.E($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.ca > 0) {
         this.ca--;
      }

      if (!this.dQ().B) {
         this.a((aqm)this.dQ(), true);
      }
   }

   @Override
   public boolean br() {
      return this.dt().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsm<?> $$0) {
      if (this.gp() && $$0 == bsm.by) {
         return false;
      } else {
         return $$0 == bsm.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gp());
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
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

   private float gq() {
      return (float)this.g(buj.c);
   }

   @Override
   public boolean D(bsg $$0) {
      this.e = 10;
      this.dQ().a(this, (byte)4);
      float $$1 = this.gq();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      bqz $$3 = this.dR().b((btb)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof btb $$5 ? $$5.g(buj.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.i($$0.dt().b(0.0, 0.4F * $$7, 0.0));
         if (this.dQ() instanceof aqm $$8) {
            czn.a($$8, $$0, $$3);
         }
      }

      this.a(avh.no, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      bse.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(avh.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bse.a u() {
      return bse.a.a(this.ex() / this.eO());
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

   public int y() {
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
   protected avg d(bqz $$0) {
      return avh.nr;
   }

   @Override
   protected avg o_() {
      return avh.nq;
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if (!$$2.a(cuf.oF)) {
         return bqg.e;
      } else {
         float $$3 = this.ex();
         this.c(25.0F);
         if (this.ex() == $$3) {
            return bqg.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avh.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqg.a(this.dQ().B);
         }
      }
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.nt, 1.0F, 1.0F);
   }

   public int go() {
      return this.ca;
   }

   public boolean gp() {
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
   public void a(bqz $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dci $$0) {
      ja $$1 = this.dq();
      ja $$2 = $$1.d();
      dsk $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ja $$5 = $$1.b($$4);
            dsk $$6 = $$0.a_($$5);
            if (!dcq.a($$0, $$5, $$6, $$6.u(), bsm.af)) {
               return false;
            }
         }

         return dcq.a($$0, $$1, $$0.a_($$1), eoi.a.g(), bsm.af) && $$0.f(this);
      }
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.875F * this.cM()), (double)(this.dk() * 0.4F));
   }
}
