import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dff extends ArrayList<dfe> {
   public static final Codec<dff> a = dfe.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dff::new, Function.identity()).codec();
   public static final yn<wa, dff> b = dfe.b.a(yl.a(dff::new));

   public dff() {
   }

   private dff(int $$0) {
      super($$0);
   }

   private dff(Collection<dfe> $$0) {
      super($$0);
   }

   @Nullable
   public dfe a(cwo $$0, cwo $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dfe $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dfe $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dff a() {
      dff $$0 = new dff(this.size());

      for (dfe $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
