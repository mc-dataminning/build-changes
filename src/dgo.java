import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dgo extends ArrayList<dgn> {
   public static final Codec<dgo> a = dgn.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dgo::new, Function.identity()).codec();
   public static final yt<wg, dgo> b = dgn.b.a(yr.a(dgo::new));

   public dgo() {
   }

   private dgo(int $$0) {
      super($$0);
   }

   private dgo(Collection<dgn> $$0) {
      super($$0);
   }

   @Nullable
   public dgn a(cxy $$0, cxy $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dgn $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dgn $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dgo a() {
      dgo $$0 = new dgo(this.size());

      for (dgn $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
