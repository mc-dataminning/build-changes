import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class ctv extends ctu implements bwz, cub {
   private static final int h = 27;
   private jo<czk> i = jo.a(27, czk.k);
   @Nullable
   private alf<ezt> j;
   private long k;

   public ctv(bwr<? extends ctv> $$0, djh $$1, Supplier<czg> $$2) {
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
      this.a($$0, this.dW());
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.b($$0, this.dW());
   }

   @Override
   public void a(arq $$0, bux $$1) {
      this.a($$0, this.o());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bwi.d $$0) {
      if (!this.dU().C && $$0.a()) {
         buc.a(this.dU(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      if (!$$0.fX()) {
         bug $$2 = super.a($$0, $$1);
         if ($$2 != bug.e) {
            return $$2;
         }
      }

      if (this.r($$0) && !$$0.fX()) {
         return bug.e;
      } else {
         bug $$3 = this.b_($$0);
         if ($$3.a() && $$0.dU() instanceof arq $$4) {
            this.a(efo.k, $$0);
            cpz.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(crj $$0) {
      $$0.a(this);
      if ($$0.dU() instanceof arq $$1) {
         this.a(efo.k, $$0);
         cpz.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.ag_();
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   public czk a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czk a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czk b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czk $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bya a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crj $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cvc createMenu(int $$0, cri $$1, crj $$2) {
      if (this.j != null && $$2.V_()) {
         return null;
      } else {
         this.e($$1.h);
         return cvl.a($$0, $$1, this);
      }
   }

   public void e(@Nullable crj $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alf<ezt> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable alf<ezt> $$0) {
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
   public jo<czk> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = jo.a(this.b(), czk.k);
   }

   @Override
   public void c(crj $$0) {
      this.dU().a(efo.j, this.ds(), efo.a.a($$0));
   }
}
