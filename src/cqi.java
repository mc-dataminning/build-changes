import javax.annotation.Nullable;

public class cqi extends cqh implements buo, cqj {
   private static final int i = 27;
   private jy<cvx> j = jy.a(27, cvx.k);
   @Nullable
   private alg<eub> k;
   private long l;

   public cqi(bug<? extends cqh> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cqi(dev $$0, double $$1, double $$2, double $$3) {
      super(bug.r, $$0);
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
   protected void b(uj $$0) {
      super.b($$0);
      this.a($$0, this.dZ());
   }

   @Override
   protected void a(uj $$0) {
      super.a($$0);
      this.b($$0, this.dZ());
   }

   @Override
   public void a(bsp $$0) {
      this.b(this.al_());
      this.a($$0, this.dX(), this);
   }

   @Override
   public void a(btz.c $$0) {
      if (!this.dX().C && $$0.a()) {
         bru.a(this.dX(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      if (!$$0.ga()) {
         bry $$2 = super.a($$0, $$1);
         if ($$2 != bry.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.ga()) {
         return bry.e;
      } else {
         bry $$3 = this.c_($$0);
         if ($$3.a()) {
            this.a(eaa.k, $$0);
            cmx.a($$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(coh $$0) {
      $$0.a(this);
      if (!$$0.dX().C) {
         this.a(eaa.k, $$0);
         cmx.a($$0, true);
      }
   }

   @Override
   public cvt al_() {
      return switch (this.w()) {
         case b -> cwb.nY;
         case c -> cwb.oa;
         case d -> cwb.oc;
         case e -> cwb.oe;
         case f -> cwb.og;
         case g -> cwb.oi;
         case h -> cwb.ok;
         case i -> cwb.om;
         default -> cwb.nW;
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
   public cvx a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvx b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvn a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coh $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public crj createMenu(int $$0, cog $$1, coh $$2) {
      if (this.k != null && $$2.R_()) {
         return null;
      } else {
         this.e($$1.k);
         return crs.a($$0, $$1, this);
      }
   }

   public void e(@Nullable coh $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alg<eub> E() {
      return this.k;
   }

   @Override
   public void a(@Nullable alg<eub> $$0) {
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
   public jy<cvx> G() {
      return this.j;
   }

   @Override
   public void I() {
      this.j = jy.a(this.b(), cvx.k);
   }

   @Override
   public void c(coh $$0) {
      this.dX().a(eaa.j, this.dv(), eaa.a.a($$0));
   }
}
