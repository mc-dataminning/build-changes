import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cqu extends cqt implements buz, cra {
   private static final int h = 27;
   private ka<cwo> i = ka.a(27, cwo.j);
   @Nullable
   private aku<evv> j;
   private long k;

   public cqu(bur<? extends cqu> $$0, dgh $$1, Supplier<cwk> $$2) {
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
   protected void b(tq $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(ard $$0, bta $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(buk.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bsf.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsj a(cow $$0, bsi $$1) {
      if (!$$0.fY()) {
         bsj $$2 = super.a($$0, $$1);
         if ($$2 != bsj.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bsj.e;
      } else {
         bsj $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof ard $$4) {
            this.a(ebs.k, $$0);
            cnl.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cow $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof ard $$1) {
         this.a(ebs.k, $$0);
         cnl.a($$1, $$0, true);
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
   public cwo a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwo b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvy a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cow $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public csb createMenu(int $$0, cov $$1, cow $$2) {
      if (this.j != null && $$2.Z_()) {
         return null;
      } else {
         this.e($$1.k);
         return csk.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cow $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aku<evv> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable aku<evv> $$0) {
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
   public ka<cwo> E() {
      return this.i;
   }

   @Override
   public void F() {
      this.i = ka.a(this.b(), cwo.j);
   }

   @Override
   public void c(cow $$0) {
      this.dV().a(ebs.j, this.dt(), ebs.a.a($$0));
   }
}
