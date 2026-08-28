import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cru extends crt implements bvy, csa {
   private static final int h = 27;
   private jz<cxo> i = jz.a(27, cxo.k);
   @Nullable
   private aly<ewt> j;
   private long k;

   public cru(bvq<? extends cru> $$0, dhh $$1, Supplier<cxk> $$2) {
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
   public void a(ash $$0, btz $$1) {
      this.a($$0, this.u());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bvj.c $$0) {
      if (!this.dV().C && $$0.a()) {
         bte.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bti a(cpw $$0, bth $$1) {
      if (!$$0.fW()) {
         bti $$2 = super.a($$0, $$1);
         if ($$2 != bti.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fW()) {
         return bti.e;
      } else {
         bti $$3 = this.b_($$0);
         if ($$3.a() && $$0.dV() instanceof ash $$4) {
            this.a(ecq.k, $$0);
            col.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cpw $$0) {
      $$0.a(this);
      if ($$0.dV() instanceof ash $$1) {
         this.a(ecq.k, $$0);
         col.a($$1, $$0, true);
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
   public cxo a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxo b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwx a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpw $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public ctb createMenu(int $$0, cpv $$1, cpw $$2) {
      if (this.j != null && $$2.aa_()) {
         return null;
      } else {
         this.e($$1.k);
         return ctk.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cpw $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public aly<ewt> v() {
      return this.j;
   }

   @Override
   public void a(@Nullable aly<ewt> $$0) {
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
   public jz<cxo> B() {
      return this.i;
   }

   @Override
   public void C() {
      this.i = jz.a(this.b(), cxo.k);
   }

   @Override
   public void c(cpw $$0) {
      this.dV().a(ecq.j, this.dt(), ecq.a.a($$0));
   }
}
