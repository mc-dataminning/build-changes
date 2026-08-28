import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class crq extends crp implements bvu, crw {
   private static final int h = 27;
   private jz<cxk> i = jz.a(27, cxk.k);
   @Nullable
   private aly<ewm> j;
   private long k;

   public crq(bvm<? extends crq> $$0, dha $$1, Supplier<cxg> $$2) {
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
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public void a(ash $$0, btv $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bvf.c $$0) {
      if (!this.dV().C && $$0.a()) {
         bta.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bte a(cps $$0, btd $$1) {
      if (!$$0.fW()) {
         bte $$2 = super.a($$0, $$1);
         if ($$2 != bte.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fW()) {
         return bte.e;
      } else {
         bte $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof ash $$4) {
            this.a(ecj.k, $$0);
            coh.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cps $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof ash $$1) {
         this.a(ecj.k, $$0);
         coh.a($$1, $$0, true);
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
   public cxk a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxk b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwt a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cps $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public csx createMenu(int $$0, cpr $$1, cps $$2) {
      if (this.j != null && $$2.aa_()) {
         return null;
      } else {
         this.e($$1.k);
         return ctg.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cps $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aly<ewm> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable aly<ewm> $$0) {
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
   public jz<cxk> B() {
      return this.i;
   }

   @Override
   public void C() {
      this.i = jz.a(this.b(), cxk.k);
   }

   @Override
   public void c(cps $$0) {
      this.dV().a(ecj.j, this.dt(), ecj.a.a($$0));
   }
}
