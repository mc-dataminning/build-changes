import javax.annotation.Nullable;

public class cms extends cjh implements cka {
   private final aqu c;

   public cms(cvf $$0, aqu $$1, clj.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bjb a(cny $$0) {
      bjb $$1 = super.a($$0);
      cdz $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bja $$3 = $$0.p();
         $$2.a($$3, clr.qv.an_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected aqu a(dhn $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable cdz $$0, csf $$1, hx $$2, @Nullable ejv $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().o(), 3);
         }

         $$1.a($$0, dlx.z, $$2);
         $$1.a($$0, $$2, this.c, aqw.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
