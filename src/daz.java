import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class daz extends ArrayList<day> {
   public static final Codec<daz> a = day.a.listOf().fieldOf("Recipes").xmap(daz::new, Function.identity()).codec();
   public static final zc<wp, daz> b = day.b.a(za.a(daz::new));

   public daz() {
   }

   private daz(int $$0) {
      super($$0);
   }

   private daz(Collection<day> $$0) {
      super($$0);
   }

   @Nullable
   public day a(cuh $$0, cuh $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         day $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            day $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public daz a() {
      daz $$0 = new daz(this.size());

      for (day $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
