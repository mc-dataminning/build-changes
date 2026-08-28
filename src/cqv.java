import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cqv extends cqu implements bva, crb {
   private static final int h = 27;
   private ka<cwp> i = ka.a(27, cwp.j);
   @Nullable
   private aku<evw> j;
   private long k;

   public cqv(bus<? extends cqv> $$0, dgi $$1, Supplier<cwl> $$2) {
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
   public void a(ard $$0, btb $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bul.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bsg.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsk a(cox $$0, bsj $$1) {
      if (!$$0.fY()) {
         bsk $$2 = super.a($$0, $$1);
         if ($$2 != bsk.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bsk.e;
      } else {
         bsk $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof ard $$4) {
            this.a(ebt.k, $$0);
            cnm.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cox $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof ard $$1) {
         this.a(ebt.k, $$0);
         cnm.a($$1, $$0, true);
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
   public cwp a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwp b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwp $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvz a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cox $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public csc createMenu(int $$0, cow $$1, cox $$2) {
      if (this.j != null && $$2.Z_()) {
         return null;
      } else {
         this.e($$1.k);
         return csl.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cox $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aku<evw> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable aku<evw> $$0) {
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
   public ka<cwp> E() {
      return this.i;
   }

   @Override
   public void F() {
      this.i = ka.a(this.b(), cwp.j);
   }

   @Override
   public void c(cox $$0) {
      this.dV().a(ebt.j, this.dt(), ebt.a.a($$0));
   }
}
