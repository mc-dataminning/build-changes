import java.util.UUID;
import javax.annotation.Nullable;

public class cfr extends cfd implements btv {
   protected static final akk<Byte> c = ako.a(cfr.class, akm.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bqf bZ = azz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cfr(bta<? extends cfr> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cax(this, 1.0, true));
      this.bS.a(2, new cbc(this, 0.9, 32.0F));
      this.bS.a(2, new cay(this, 0.6, false));
      this.bS.a(4, new cap(this, 0.6));
      this.bS.a(5, new cbe(this));
      this.bS.a(7, new cav(this, cmx.class, 6.0F));
      this.bS.a(8, new cbi(this));
      this.bT.a(1, new cce(this));
      this.bT.a(2, new ccf(this));
      this.bT.a(3, new ccg<>(this, cmx.class, 10, true, false, this::a_));
      this.bT.a(3, new ccg<>(this, btr.class, 5, false, false, $$0 -> $$0 instanceof cjv && !($$0 instanceof cjp)));
      this.bT.a(4, new ccm<>(this, false));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static buw.a s() {
      return btr.A().a(bux.q, 100.0).a(bux.r, 0.25).a(bux.n, 1.0).a(bux.c, 15.0).a(bux.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bsu $$0) {
      if ($$0 instanceof cjv && !($$0 instanceof cjp) && this.el().a(20) == 0) {
         this.h((btp)$$0);
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
   public boolean a(bta<?> $$0) {
      if (this.gr() && $$0 == bta.by) {
         return false;
      } else {
         return $$0 == bta.x ? false : super.a($$0);
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
      return (float)this.g(bux.c);
   }

   @Override
   public boolean C(bsu $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gs();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dQ().b((btp)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof btp $$4 ? $$4.g(bux.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.h($$0.ds().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(awa.no, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      bss.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(awa.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bss.a u() {
      return bss.a.a(this.eA() / this.eR());
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
   protected avz d(brn $$0) {
      return awa.nr;
   }

   @Override
   protected avz o_() {
      return awa.nq;
   }

   @Override
   protected bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if (!$$2.a(cus.oE)) {
         return bqu.e;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return bqu.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(awa.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqu.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
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
   public void a(brn $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcb $$0) {
      iz $$1 = this.dp();
      iz $$2 = $$1.d();
      dsc $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            iz $$5 = $$1.b($$4);
            dsc $$6 = $$0.a_($$5);
            if (!dcj.a($$0, $$5, $$6, $$6.u(), bta.af)) {
               return false;
            }
         }

         return dcj.a($$0, $$1, $$0.a_($$1), enw.a.g(), bta.af) && $$0.f(this);
      }
   }

   @Override
   public evr cM() {
      return new evr(0.0, (double)(0.875F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
