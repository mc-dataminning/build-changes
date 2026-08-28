import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dij extends ArrayList<dii> {
   public static final Codec<dij> a = dii.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dij::new, Function.identity()).codec();
   public static final yw<wj, dij> b = dii.b.a(yu.a(dij::new));

   public dij() {
   }

   private dij(int $$0) {
      super($$0);
   }

   private dij(Collection<dii> $$0) {
      super($$0);
   }

   @Nullable
   public dii a(czn $$0, czn $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dii $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dii $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dij a() {
      dij $$0 = new dij(this.size());

      for (dii $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
