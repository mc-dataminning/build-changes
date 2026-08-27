import com.mojang.serialization.Codec;

public class dpg extends dnq<dqb> {
   public dpg(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      cqv $$1 = $$0.b();
      gw $$2 = $$0.e();
      $$0.f();
      if (!$$1.t($$2)) {
         return false;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$3 != ha.a && dbt.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cte.ff.o().a(dbt.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
