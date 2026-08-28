import java.util.UUID;
import javax.annotation.Nullable;

public class cfp extends cfb implements btt {
   protected static final akj<Byte> c = akn.a(cfp.class, akl.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bqd bZ = azx.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cfp(bsy<? extends cfp> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cav(this, 1.0, true));
      this.bS.a(2, new cba(this, 0.9, 32.0F));
      this.bS.a(2, new caw(this, 0.6, false));
      this.bS.a(4, new can(this, 0.6));
      this.bS.a(5, new cbc(this));
      this.bS.a(7, new cat(this, cmv.class, 6.0F));
      this.bS.a(8, new cbg(this));
      this.bT.a(1, new ccc(this));
      this.bT.a(2, new ccd(this));
      this.bT.a(3, new cce<>(this, cmv.class, 10, true, false, this::a_));
      this.bT.a(3, new cce<>(this, btp.class, 5, false, false, $$0 -> $$0 instanceof cjt && !($$0 instanceof cjn)));
      this.bT.a(4, new cck<>(this, false));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static buu.a s() {
      return btp.A().a(buv.q, 100.0).a(buv.r, 0.25).a(buv.n, 1.0).a(buv.c, 15.0).a(buv.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bss $$0) {
      if ($$0 instanceof cjt && !($$0 instanceof cjn) && this.el().a(20) == 0) {
         this.h((btn)$$0);
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
         this.a((are)this.dP(), true);
      }
   }

   @Override
   public boolean bq() {
      return this.ds().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsy<?> $$0) {
      if (this.gr() && $$0 == bsy.by) {
         return false;
      } else {
         return $$0 == bsy.x ? false : super.a($$0);
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
      return (float)this.g(buv.c);
   }

   @Override
   public boolean C(bss $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gs();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dQ().b((btn)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof btn $$4 ? $$4.g(buv.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.h($$0.ds().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(avz.no, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      bsq.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(avz.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bsq.a u() {
      return bsq.a.a(this.eA() / this.eR());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avz.no, 1.0F, 1.0F);
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
   protected avy d(brl $$0) {
      return avz.nr;
   }

   @Override
   protected avy o_() {
      return avz.nq;
   }

   @Override
   protected bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if (!$$2.a(cuq.oE)) {
         return bqs.e;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return bqs.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avz.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqs.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.nt, 1.0F, 1.0F);
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
   public void a(brl $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dbz $$0) {
      iz $$1 = this.dp();
      iz $$2 = $$1.d();
      dsa $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iz $$5 = $$1.b($$4);
            dsa $$6 = $$0.a_($$5);
            if (!dch.a($$0, $$5, $$6, $$6.u(), bsy.af)) {
               return false;
            }
         }

         return dch.a($$0, $$1, $$0.a_($$1), enu.a.g(), bsy.af) && $$0.f(this);
      }
   }

   @Override
   public evp cM() {
      return new evp(0.0, (double)(0.875F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
