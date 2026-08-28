import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dfh extends ArrayList<dfg> {
   public static final Codec<dfh> a = dfg.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dfh::new, Function.identity()).codec();
   public static final yn<wa, dfh> b = dfg.b.a(yl.a(dfh::new));

   public dfh() {
   }

   private dfh(int $$0) {
      super($$0);
   }

   private dfh(Collection<dfg> $$0) {
      super($$0);
   }

   @Nullable
   public dfg a(cwq $$0, cwq $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dfg $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dfg $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dfh a() {
      dfh $$0 = new dfh(this.size());

      for (dfg $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
