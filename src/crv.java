import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class crv extends cru implements bvz, csb {
   private static final int h = 27;
   private jz<cxp> i = jz.a(27, cxp.j);
   @Nullable
   private aly<ewu> j;
   private long k;

   public crv(bvr<? extends crv> $$0, dhi $$1, Supplier<cxl> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected float s() {
      return 0.15F;
   }

   @Override
   protected int t() {
      return 1;
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      this.a($$0, this.dY());
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public void a(ash $$0, bua $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bvk.d $$0) {
      if (!this.dW().C && $$0.a()) {
         btf.a(this.dW(), this, this);
      }

      super.a($$0);
   }

   @Override
   public btj a(cpx $$0, bti $$1) {
      if (!$$0.fY()) {
         btj $$2 = super.a($$0, $$1);
         if ($$2 != btj.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return btj.e;
      } else {
         btj $$3 = this.b_($$0);
         if ($$3.a() && $$0.dW() instanceof ash $$4) {
            this.a(ecr.k, $$0);
            com.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cpx $$0) {
      $$0.a(this);
      if ($$0.dW() instanceof ash $$1) {
         this.a(ecr.k, $$0);
         com.a($$1, $$0, true);
      }
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
   public cxp a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxp a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxp b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxp $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwy a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpx $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ctc createMenu(int $$0, cpw $$1, cpx $$2) {
      if (this.j != null && $$2.aa_()) {
         return null;
      } else {
         this.e($$1.k);
         return ctl.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cpx $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aly<ewu> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable aly<ewu> $$0) {
      this.j = $$0;
   }

   @Override
   public long x() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public jz<cxp> B() {
      return this.i;
   }

   @Override
   public void C() {
      this.i = jz.a(this.b(), cxp.j);
   }

   @Override
   public void c(cpx $$0) {
      this.dW().a(ecr.j, this.du(), ecr.a.a($$0));
   }
}
