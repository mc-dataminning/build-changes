import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class ctj extends cti implements bwu, ctp {
   private static final int h = 27;
   private jn<cyy> i = jn.a(27, cyy.k);
   @Nullable
   private alf<eze> j;
   private long k;

   public ctj(bwm<? extends ctj> $$0, div $$1, Supplier<cyu> $$2) {
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
   public void a(arq $$0, bus $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bwd.e $$0) {
      if (!this.dV().C && $$0.a()) {
         btx.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bub a(cqy $$0, bua $$1) {
      if (!$$0.fX()) {
         bub $$2 = super.a($$0, $$1);
         if ($$2 != bub.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fX()) {
         return bub.e;
      } else {
         bub $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof arq $$4) {
            this.a(eez.k, $$0);
            cpo.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cqy $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof arq $$1) {
         this.a(eez.k, $$0);
         cpo.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.af_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public cyy a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cyy a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cyy b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bxt a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cqy $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cuq createMenu(int $$0, cqx $$1, cqy $$2) {
      if (this.j != null && $$2.U_()) {
         return null;
      } else {
         this.e($$1.k);
         return cuz.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cqy $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alf<eze> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable alf<eze> $$0) {
      this.j = $$0;
   }

   @Override
   public long s() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public jn<cyy> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = jn.a(this.b(), cyy.k);
   }

   @Override
   public void c(cqy $$0) {
      this.dV().a(eez.j, this.dt(), eez.a.a($$0));
   }
}
