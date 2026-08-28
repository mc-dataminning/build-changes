import java.util.UUID;
import javax.annotation.Nullable;

public class cfs extends cfe implements btw {
   protected static final akk<Byte> c = ako.a(cfs.class, akm.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bqg bZ = azz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cfs(btb<? extends cfs> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cay(this, 1.0, true));
      this.bS.a(2, new cbd(this, 0.9, 32.0F));
      this.bS.a(2, new caz(this, 0.6, false));
      this.bS.a(4, new caq(this, 0.6));
      this.bS.a(5, new cbf(this));
      this.bS.a(7, new caw(this, cmy.class, 6.0F));
      this.bS.a(8, new cbj(this));
      this.bT.a(1, new ccf(this));
      this.bT.a(2, new ccg(this));
      this.bT.a(3, new cch<>(this, cmy.class, 10, true, false, this::a_));
      this.bT.a(3, new cch<>(this, bts.class, 5, false, false, $$0 -> $$0 instanceof cjw && !($$0 instanceof cjq)));
      this.bT.a(4, new ccn<>(this, false));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bux.a s() {
      return bts.A().a(buy.q, 100.0).a(buy.r, 0.25).a(buy.n, 1.0).a(buy.c, 15.0).a(buy.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bsv $$0) {
      if ($$0 instanceof cjw && !($$0 instanceof cjq) && this.el().a(20) == 0) {
         this.h((btq)$$0);
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
         this.a((arf)this.dP(), true);
      }
   }

   @Override
   public boolean bq() {
      return this.ds().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(btb<?> $$0) {
      if (this.gr() && $$0 == btb.by) {
         return false;
      } else {
         return $$0 == btb.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gr());
      this.c($$0);
   }

   @Override
   public void a(us $$0) {
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
      return (float)this.g(buy.c);
   }

   @Override
   public boolean C(bsv $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gs();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dQ().b((btq)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof btq $$4 ? $$4.g(buy.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.h($$0.ds().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(awa.no, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      bst.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(awa.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bst.a u() {
      return bst.a.a(this.eA() / this.eR());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(awa.no, 1.0F, 1.0F);
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
   protected avz d(bro $$0) {
      return awa.nr;
   }

   @Override
   protected avz o_() {
      return awa.nq;
   }

   @Override
   protected bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if (!$$2.a(cut.oE)) {
         return bqv.e;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return bqv.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(awa.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqv.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.nt, 1.0F, 1.0F);
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
   public void a(bro $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcc $$0) {
      iz $$1 = this.dp();
      iz $$2 = $$1.d();
      dsd $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iz $$5 = $$1.b($$4);
            dsd $$6 = $$0.a_($$5);
            if (!dck.a($$0, $$5, $$6, $$6.u(), btb.af)) {
               return false;
            }
         }

         return dck.a($$0, $$1, $$0.a_($$1), enx.a.g(), btb.af) && $$0.f(this);
      }
   }

   @Override
   public evs cM() {
      return new evs(0.0, (double)(0.875F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
