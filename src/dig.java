import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dig extends ArrayList<dif> {
   public static final Codec<dig> a = dif.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dig::new, Function.identity()).codec();
   public static final yw<wj, dig> b = dif.b.a(yu.a(dig::new));

   public dig() {
   }

   private dig(int $$0) {
      super($$0);
   }

   private dig(Collection<dif> $$0) {
      super($$0);
   }

   @Nullable
   public dif a(czk $$0, czk $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dif $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dif $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dig a() {
      dig $$0 = new dig(this.size());

      for (dif $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
