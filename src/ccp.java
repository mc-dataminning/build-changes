import java.util.UUID;
import javax.annotation.Nullable;

public class ccp extends ccb implements bqu {
   protected static final aiy<Byte> c = ajc.a(ccp.class, aja.a);
   private static final int d = 25;
   private int e;
   private int bX;
   private static final bnl bY = ayj.a(20, 39);
   private int bZ;
   @Nullable
   private UUID ca;

   public ccp(bqb<? extends ccp> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxv(this, 1.0, true));
      this.bR.a(2, new bya(this, 0.9, 32.0F));
      this.bR.a(2, new bxw(this, 0.6, false));
      this.bR.a(4, new bxn(this, 0.6));
      this.bR.a(5, new byc(this));
      this.bR.a(7, new bxt(this, cjt.class, 6.0F));
      this.bR.a(8, new byg(this));
      this.bS.a(1, new bzc(this));
      this.bS.a(2, new bzd(this));
      this.bS.a(3, new bze<>(this, cjt.class, 10, true, false, this::a_));
      this.bS.a(3, new bze<>(this, bqq.class, 5, false, false, $$0 -> $$0 instanceof cgr && !($$0 instanceof cgl)));
      this.bS.a(4, new bzk<>(this, false));
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 100.0).a(brv.r, 0.25).a(brv.n, 1.0).a(brv.c, 15.0).a(brv.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bpv $$0) {
      if ($$0 instanceof cgr && !($$0 instanceof cgl) && this.ei().a(20) == 0) {
         this.h((bqo)$$0);
      }

      super.D($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (!this.dM().B) {
         this.a((aps)this.dM(), true);
      }
   }

   @Override
   public boolean bo() {
      return this.dp().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bqb<?> $$0) {
      if (this.go() && $$0 == bqb.bx) {
         return false;
      } else {
         return $$0 == bqb.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.c($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dM(), $$0);
   }

   @Override
   public void c() {
      this.a(bY.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public int a() {
      return this.bZ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ca = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ca;
   }

   private float gp() {
      return (float)this.g(brv.c);
   }

   @Override
   public boolean C(bpv $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gp();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((bqo)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bqo $$4 ? $$4.g(brv.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(aum.mZ, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      bpt.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(aum.na, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bpt.a u() {
      return bpt.a.a(this.ex() / this.eO());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(aum.mZ, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bX = 400;
      } else if ($$0 == 34) {
         this.bX = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bX = 400;
         this.dM().a(this, (byte)11);
      } else {
         this.bX = 0;
         this.dM().a(this, (byte)34);
      }
   }

   @Override
   protected aul d(bot $$0) {
      return aum.nc;
   }

   @Override
   protected aul o_() {
      return aum.nb;
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (!$$2.a(crm.oD)) {
         return boa.d;
      } else {
         float $$3 = this.ex();
         this.c(25.0F);
         if (this.ex() == $$3) {
            return boa.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(aum.nd, 1.0F, $$4);
            $$2.a(1, $$0);
            return boa.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.ne, 1.0F, 1.0F);
   }

   public int gn() {
      return this.bX;
   }

   public boolean go() {
      return (this.an.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.a(c);
      if ($$0) {
         this.an.a(c, (byte)($$1 | 1));
      } else {
         this.an.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bot $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cza $$0) {
      ib $$1 = this.dm();
      ib $$2 = $$1.d();
      doz $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ib $$5 = $$1.b($$4);
            doz $$6 = $$0.a_($$5);
            if (!czi.a($$0, $$5, $$6, $$6.u(), bqb.af)) {
               return false;
            }
         }

         return czi.a($$0, $$1, $$0.a_($$1), ekt.a.g(), bqb.af) && $$0.f(this);
      }
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
