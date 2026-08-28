import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cty extends ctx implements bwz, cue {
   private static final int h = 27;
   private jo<czn> i = jo.a(27, czn.k);
   @Nullable
   private alf<ezy> j;
   private long k;

   public cty(bwr<? extends cty> $$0, djm $$1, Supplier<czj> $$2) {
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
   public bug a(crm $$0, buf $$1) {
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
            this.a(eft.k, $$0);
            cqc.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(crm $$0) {
      $$0.a(this);
      if ($$0.dU() instanceof arq $$1) {
         this.a(eft.k, $$0);
         cqc.a($$1, $$0, true);
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
   public czn a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public czn a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public czn b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, czn $$1) {
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
   public boolean a(crm $$0) {
      return this.g($$0);
   }

   @Nullable
   @Override
   public cvf createMenu(int $$0, crl $$1, crm $$2) {
      if (this.j != null && $$2.V_()) {
         return null;
      } else {
         this.e($$1.h);
         return cvo.a($$0, $$1, this);
      }
   }

   public void e(@Nullable crm $$0) {
      this.f($$0);
   }

   @Nullable
   @Override
   public alf<ezy> q() {
      return this.j;
   }

   @Override
   public void a(@Nullable alf<ezy> $$0) {
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
   public jo<czn> t() {
      return this.i;
   }

   @Override
   public void u() {
      this.i = jo.a(this.b(), czn.k);
   }

   @Override
   public void c(crm $$0) {
      this.dU().a(eft.j, this.ds(), eft.a.a($$0));
   }
}
