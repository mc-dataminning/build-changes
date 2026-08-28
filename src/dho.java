import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dho extends ArrayList<dhn> {
   public static final Codec<dho> a = dhn.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dho::new, Function.identity()).codec();
   public static final yu<wh, dho> b = dhn.b.a(ys.a(dho::new));

   public dho() {
   }

   private dho(int $$0) {
      super($$0);
   }

   private dho(Collection<dhn> $$0) {
      super($$0);
   }

   @Nullable
   public dhn a(cys $$0, cys $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dhn $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dhn $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dho a() {
      dho $$0 = new dho(this.size());

      for (dhn $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
