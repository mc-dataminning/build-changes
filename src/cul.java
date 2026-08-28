import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cul extends cuk implements bxm, cur {
   private static final int j = 27;
   private jp<daa> k = jp.a(27, daa.k);
   @Nullable
   private alj<fao> l;
   private long m;

   public cul(bxe<? extends cul> $$0, djz $$1, Supplier<czw> $$2) {
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
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(aru $$0, bvk $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bwv.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bup.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public but a(crz $$0, bus $$1) {
      if (!$$0.fY()) {
         but $$2 = super.a($$0, $$1);
         if ($$2 != but.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return but.e;
      } else {
         but $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof aru $$4) {
            this.a(egg.k, $$0);
            cqp.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(crz $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof aru $$1) {
         this.a(egg.k, $$0);
         cqp.a($$1, $$0, true);
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
   public daa a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public daa b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, daa $$1) {
      this.c($$0, $$1);
   }

   @Override
   public byn a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crz $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cvs createMenu(int $$0, cry $$1, crz $$2) {
      if (this.l != null && $$2.Z_()) {
         return null;
      } else {
         this.e($$1.h);
         return cwb.a($$0, $$1, this);
      }
   }

   public void e(@Nullable crz $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alj<fao> q() {
      return this.l;
   }

   @Override
   public void a(@Nullable alj<fao> $$0) {
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
   public jp<daa> t() {
      return this.k;
   }

   @Override
   public void u() {
      this.k = jp.a(this.b(), daa.k);
   }

   @Override
   public void c(crz $$0) {
      this.dV().a(egg.j, this.dt(), egg.a.a($$0));
   }
}
