import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cqs extends cqr implements bva, cqy {
   private static final int h = 27;
   private jz<cwm> i = jz.a(27, cwm.k);
   @Nullable
   private ali<eus> j;
   private long k;

   public cqs(bus<? extends cqs> $$0, dfm $$1, Supplier<cwi> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected float q() {
      return 0.15F;
   }

   @Override
   protected int s() {
      return 1;
   }

   @Override
   protected void b(ul $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ul $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(arp $$0, btb $$1) {
      this.a($$0, this.t());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bul.c $$0) {
      if (!this.dV().C && $$0.a()) {
         bsg.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      if (!$$0.fW()) {
         bsk $$2 = super.a($$0, $$1);
         if ($$2 != bsk.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fW()) {
         return bsk.e;
      } else {
         bsk $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof arp $$4) {
            this.a(ear.k, $$0);
            cnj.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cou $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof arp $$1) {
         this.a(ear.k, $$0);
         cnj.a($$1, $$0, true);
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
   public cwm a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cwm a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwm b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cwm $$1) {
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
   public boolean a(cou $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public crz createMenu(int $$0, cot $$1, cou $$2) {
      if (this.j != null && $$2.Y_()) {
         return null;
      } else {
         this.e($$1.k);
         return csi.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cou $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public ali<eus> u() {
      return this.j;
   }

   @Override
   public void a(@Nullable ali<eus> $$0) {
      this.j = $$0;
   }

   @Override
   public long v() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public jz<cwm> B() {
      return this.i;
   }

   @Override
   public void C() {
      this.i = jz.a(this.b(), cwm.k);
   }

   @Override
   public void c(cou $$0) {
      this.dV().a(ear.j, this.dt(), ear.a.a($$0));
   }
}
