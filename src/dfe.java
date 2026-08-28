import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dfe extends ArrayList<dfd> {
   public static final Codec<dfe> a = dfd.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dfe::new, Function.identity()).codec();
   public static final ym<vz, dfe> b = dfd.b.a(yk.a(dfe::new));

   public dfe() {
   }

   private dfe(int $$0) {
      super($$0);
   }

   private dfe(Collection<dfd> $$0) {
      super($$0);
   }

   @Nullable
   public dfd a(cwn $$0, cwn $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dfd $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dfd $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dfe a() {
      dfe $$0 = new dfe(this.size());

      for (dfd $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
