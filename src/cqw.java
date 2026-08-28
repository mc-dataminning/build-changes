import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cqw extends cqv implements bvb, crc {
   private static final int h = 27;
   private ka<cwq> i = ka.a(27, cwq.j);
   @Nullable
   private aku<evx> j;
   private long k;

   public cqw(but<? extends cqw> $$0, dgj $$1, Supplier<cwm> $$2) {
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
   public void a(ard $$0, btc $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bum.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bsh.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsl a(coy $$0, bsk $$1) {
      if (!$$0.fY()) {
         bsl $$2 = super.a($$0, $$1);
         if ($$2 != bsl.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fY()) {
         return bsl.e;
      } else {
         bsl $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof ard $$4) {
            this.a(ebu.k, $$0);
            cnn.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(coy $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof ard $$1) {
         this.a(ebu.k, $$0);
         cnn.a($$1, $$0, true);
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
   public cwq a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwq a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwq b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwq $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwa a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(coy $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public csd createMenu(int $$0, cox $$1, coy $$2) {
      if (this.j != null && $$2.Z_()) {
         return null;
      } else {
         this.e($$1.k);
         return csm.a($$0, $$1, this);
      }
   }

   public void e(@Nullable coy $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aku<evx> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable aku<evx> $$0) {
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
   public ka<cwq> E() {
      return this.i;
   }

   @Override
   public void F() {
      this.i = ka.a(this.b(), cwq.j);
   }

   @Override
   public void c(coy $$0) {
      this.dV().a(ebu.j, this.dt(), ebu.a.a($$0));
   }
}
