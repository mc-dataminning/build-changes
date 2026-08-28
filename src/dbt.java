import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dbt extends ArrayList<dbs> {
   public static final Codec<dbt> a = dbs.a.listOf().fieldOf("Recipes").xmap(dbt::new, Function.identity()).codec();
   public static final yw<wj, dbt> b = dbs.b.a(yu.a(dbt::new));

   public dbt() {
   }

   private dbt(int $$0) {
      super($$0);
   }

   private dbt(Collection<dbs> $$0) {
      super($$0);
   }

   @Nullable
   public dbs a(cuo $$0, cuo $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dbs $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dbs $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dbt a() {
      dbt $$0 = new dbt(this.size());

      for (dbs $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
