import javax.annotation.Nullable;

public class cvt extends csl implements cte {
   private final avy a;

   public cvt(dex $$0, avy $$1, cui.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bqs a(cya $$0) {
      bqs $$1 = super.a($$0);
      cmv $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bqr $$3 = $$0.p();
         $$2.a($$3, cuq.qy.w());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected avy a(dsa $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cmv $$0, dbw $$1, iz $$2, @Nullable evl $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dwt.z, $$2);
         $$1.a($$0, $$2, this.a, awa.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
