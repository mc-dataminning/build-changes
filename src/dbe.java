import javax.annotation.Nullable;

public class dbe extends cyg implements cyu {
   private final awo a;

   public dbe(dnc $$0, awo $$1, czu.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bur a(ddt $$0) {
      bur $$1 = super.a($$0);
      crx $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cym.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awo a(ebe $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable bxu $$0, djx $$1, iv $$2, @Nullable ffm $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, ege.z, $$2);
         $$1.a($$0, $$2, this.a, awq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
