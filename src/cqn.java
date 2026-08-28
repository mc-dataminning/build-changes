import javax.annotation.Nullable;

public class cqn extends cqm implements but, cqo {
   private static final int i = 27;
   private jz<cwb> j = jz.a(27, cwb.k);
   @Nullable
   private alh<euh> k;
   private long l;

   public cqn(bul<? extends cqm> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cqn(dfb $$0, double $$1, double $$2, double $$3) {
      super(bul.r, $$0);
      this.a_($$1, $$2, $$3);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
   }

   @Override
   protected float v() {
      return 0.15F;
   }

   @Override
   protected int x() {
      return 1;
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      this.a($$0, this.dZ());
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.b($$0, this.dZ());
   }

   @Override
   public void a(bsu $$0) {
      this.b(this.al_());
      this.a($$0, this.dX(), this);
   }

   @Override
   public void a(bue.c $$0) {
      if (!this.dX().C && $$0.a()) {
         brz.a(this.dX(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      if (!$$0.ga()) {
         bsd $$2 = super.a($$0, $$1);
         if ($$2 != bsd.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.ga()) {
         return bsd.e;
      } else {
         bsd $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(eag.k, $$0);
            cnc.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(com $$0) {
      $$0.a(this);
      if (!$$0.dX().C) {
         this.a(eag.k, $$0);
         cnc.a($$0, true);
      }
   }

   @Override
   public cvx al_() {
      return switch (this.w()) {
         case b -> cwf.nY;
         case c -> cwf.oa;
         case d -> cwf.oc;
         case e -> cwf.oe;
         case f -> cwf.og;
         case g -> cwf.oi;
         case h -> cwf.ok;
         case i -> cwf.om;
         default -> cwf.nW;
      };
   }

   @Override
   public void a() {
      this.f();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public cwb a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwb b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cwb $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvs a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(com $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cro createMenu(int $$0, col $$1, com $$2) {
      if (this.k != null && $$2.R_()) {
         return null;
      } else {
         this.e($$1.k);
         return crx.a($$0, $$1, this);
      }
   }

   public void e(@Nullable com $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alh<euh> E() {
      return this.k;
   }

   @Override
   public void a(@Nullable alh<euh> $$0) {
      this.k = $$0;
   }

   @Override
   public long F() {
      return this.l;
   }

   @Override
   public void a(long $$0) {
      this.l = $$0;
   }

   @Override
   public jz<cwb> G() {
      return this.j;
   }

   @Override
   public void I() {
      this.j = jz.a(this.b(), cwb.k);
   }

   @Override
   public void c(com $$0) {
      this.dX().a(eag.j, this.dv(), eag.a.a($$0));
   }
}
