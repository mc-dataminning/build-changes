import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cuj extends cui implements bxk, cup {
   private static final int j = 27;
   private jo<czy> k = jo.a(27, czy.k);
   @Nullable
   private alh<fam> l;
   private long m;

   public cuj(bxc<? extends cuj> $$0, djx $$1, Supplier<czu> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected float m() {
      return 0.15F;
   }

   @Override
   protected int n() {
      return 1;
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(ars $$0, bvi $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bwt.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bun.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bur a(crx $$0, buq $$1) {
      if (!$$0.fY()) {
         bur $$2 = super.a($$0, $$1);
         if ($$2 != bur.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bur.e;
      } else {
         bur $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof ars $$4) {
            this.a(ege.k, $$0);
            cqn.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(crx $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof ars $$1) {
         this.a(ege.k, $$0);
         cqn.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.ak_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public czy a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czy b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public byl a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crx $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cvq createMenu(int $$0, crw $$1, crx $$2) {
      if (this.l != null && $$2.Z_()) {
         return null;
      } else {
         this.e($$1.h);
         return cvz.a($$0, $$1, this);
      }
   }

   public void e(@Nullable crx $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alh<fam> q() {
      return this.l;
   }

   @Override
   public void a(@Nullable alh<fam> $$0) {
      this.l = $$0;
   }

   @Override
   public long s() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public jo<czy> t() {
      return this.k;
   }

   @Override
   public void u() {
      this.k = jo.a(this.b(), czy.k);
   }

   @Override
   public void c(crx $$0) {
      this.dV().a(ege.j, this.dt(), ege.a.a($$0));
   }
}
