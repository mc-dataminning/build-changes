import java.util.UUID;
import javax.annotation.Nullable;

public class cfm extends cey implements btq {
   protected static final akg<Byte> c = akk.a(cfm.class, aki.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bqa bZ = azu.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cfm(bsv<? extends cfm> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cas(this, 1.0, true));
      this.bS.a(2, new cax(this, 0.9, 32.0F));
      this.bS.a(2, new cat(this, 0.6, false));
      this.bS.a(4, new cak(this, 0.6));
      this.bS.a(5, new caz(this));
      this.bS.a(7, new caq(this, cms.class, 6.0F));
      this.bS.a(8, new cbd(this));
      this.bT.a(1, new cbz(this));
      this.bT.a(2, new cca(this));
      this.bT.a(3, new ccb<>(this, cms.class, 10, true, false, this::a_));
      this.bT.a(3, new ccb<>(this, btm.class, 5, false, false, $$0 -> $$0 instanceof cjq && !($$0 instanceof cjk)));
      this.bT.a(4, new cch<>(this, false));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 100.0).a(bus.r, 0.25).a(bus.n, 1.0).a(bus.c, 15.0).a(bus.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bsp $$0) {
      if ($$0 instanceof cjq && !($$0 instanceof cjk) && this.el().a(20) == 0) {
         this.h((btk)$$0);
      }

      super.D($$0);
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

      if (!this.dP().B) {
         this.a((arb)this.dP(), true);
      }
   }

   @Override
   public boolean bq() {
      return this.ds().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsv<?> $$0) {
      if (this.gr() && $$0 == bsv.by) {
         return false;
      } else {
         return $$0 == bsv.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gr());
      this.c($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dP(), $$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ah));
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

   private float gs() {
      return (float)this.g(bus.c);
   }

   @Override
   public boolean C(bsp $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gs();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dQ().b((btk)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof btk $$4 ? $$4.g(bus.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.h($$0.ds().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(avw.no, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      bsn.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(avw.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bsn.a u() {
      return bsn.a.a(this.eA() / this.eR());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avw.no, 1.0F, 1.0F);
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

   public void w(boolean $$0) {
      if ($$0) {
         this.bY = 400;
         this.dP().a(this, (byte)11);
      } else {
         this.bY = 0;
         this.dP().a(this, (byte)34);
      }
   }

   @Override
   protected avv d(bri $$0) {
      return avw.nr;
   }

   @Override
   protected avv o_() {
      return avw.nq;
   }

   @Override
   protected bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if (!$$2.a(cun.oE)) {
         return bqp.e;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return bqp.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avw.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqp.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.nt, 1.0F, 1.0F);
   }

   public int gq() {
      return this.bY;
   }

   public boolean gr() {
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
   public void a(bri $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dbw $$0) {
      iz $$1 = this.dp();
      iz $$2 = $$1.d();
      drx $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iz $$5 = $$1.b($$4);
            drx $$6 = $$0.a_($$5);
            if (!dce.a($$0, $$5, $$6, $$6.u(), bsv.af)) {
               return false;
            }
         }

         return dce.a($$0, $$1, $$0.a_($$1), enr.a.g(), bsv.af) && $$0.f(this);
      }
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.875F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
