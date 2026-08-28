import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dfg extends ArrayList<dff> {
   public static final Codec<dfg> a = dff.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dfg::new, Function.identity()).codec();
   public static final yn<wa, dfg> b = dff.b.a(yl.a(dfg::new));

   public dfg() {
   }

   private dfg(int $$0) {
      super($$0);
   }

   private dfg(Collection<dff> $$0) {
      super($$0);
   }

   @Nullable
   public dff a(cwp $$0, cwp $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dff $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dff $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dfg a() {
      dfg $$0 = new dfg(this.size());

      for (dff $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
