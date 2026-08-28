import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cqt extends cqs implements buy, cqz {
   private static final int h = 27;
   private ka<cwn> i = ka.a(27, cwn.j);
   @Nullable
   private akt<evu> j;
   private long k;

   public cqt(buq<? extends cqt> $$0, dgg $$1, Supplier<cwj> $$2) {
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
      this.a($$0, this.dY());
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b($$0, this.dY());
   }

   @Override
   public void a(arc $$0, bsz $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(buj.d $$0) {
      if (!this.dW().C && $$0.a()) {
         bse.a(this.dW(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsi a(cov $$0, bsh $$1) {
      if (!$$0.fY()) {
         bsi $$2 = super.a($$0, $$1);
         if ($$2 != bsi.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bsi.e;
      } else {
         bsi $$3 = this.b_($$0);
         if ($$3.a() && $$0.dW() instanceof arc $$4) {
            this.a(ebr.k, $$0);
            cnk.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cov $$0) {
      $$0.a(this);
      if ($$0.dW() instanceof arc $$1) {
         this.a(ebr.k, $$0);
         cnk.a($$1, $$0, true);
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
   public cwn a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwn b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvx a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cov $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public csa createMenu(int $$0, cou $$1, cov $$2) {
      if (this.j != null && $$2.Z_()) {
         return null;
      } else {
         this.e($$1.k);
         return csj.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cov $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akt<evu> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable akt<evu> $$0) {
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
   public ka<cwn> B() {
      return this.i;
   }

   @Override
   public void C() {
      this.i = ka.a(this.b(), cwn.j);
   }

   @Override
   public void c(cov $$0) {
      this.dW().a(ebr.j, this.du(), ebr.a.a($$0));
   }
}
