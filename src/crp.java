import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class crp extends cro implements bvq, crv {
   private static final int h = 27;
   private ka<cxh> i = ka.a(27, cxh.k);
   @Nullable
   private akt<ewt> j;
   private long k;

   public crp(bvi<? extends crp> $$0, dgz $$1, Supplier<cxd> $$2) {
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
   protected void b(tq $$0) {
      super.b($$0);
      this.a($$0, this.dW());
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      this.b($$0, this.dW());
   }

   @Override
   public void a(ard $$0, btp $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bva.d $$0) {
      if (!this.dU().C && $$0.a()) {
         bsu.a(this.dU(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      if (!$$0.ga()) {
         bsy $$2 = super.a($$0, $$1);
         if ($$2 != bsy.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.ga()) {
         return bsy.e;
      } else {
         bsy $$3 = this.b_($$0);
         if ($$3.a() && $$0.dU() instanceof ard $$4) {
            this.a(ecp.k, $$0);
            cog.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cpr $$0) {
      $$0.a(this);
      if ($$0.dU() instanceof ard $$1) {
         this.a(ecp.k, $$0);
         cog.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.aj_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public cxh a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cxh b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, cxh $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bwq a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cpr $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      if (this.j != null && $$2.U_()) {
         return null;
      } else {
         this.e($$1.k);
         return ctf.a($$0, $$1, this);
      }
   }

   public void e(@Nullable cpr $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public akt<ewt> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable akt<ewt> $$0) {
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
   public ka<cxh> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = ka.a(this.b(), cxh.k);
   }

   @Override
   public void c(cpr $$0) {
      this.dU().a(ecp.j, this.ds(), ecp.a.a($$0));
   }
}
