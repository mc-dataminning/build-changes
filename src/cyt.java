import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cyt extends ArrayList<cys> {
   public static final Codec<cyt> a = cys.a.listOf().fieldOf("Recipes").xmap(cyt::new, Function.identity()).codec();
   public static final yq<wd, cyt> b = cys.b.a(yo.a(cyt::new));

   public cyt() {
   }

   private cyt(int $$0) {
      super($$0);
   }

   private cyt(Collection<cys> $$0) {
      super($$0);
   }

   @Nullable
   public cys a(csd $$0, csd $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cys $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cys $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public cyt a() {
      cyt $$0 = new cyt(this.size());

      for (cys $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
