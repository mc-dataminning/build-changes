import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class day extends ArrayList<dax> {
   public static final Codec<day> a = dax.a.listOf().fieldOf("Recipes").xmap(day::new, Function.identity()).codec();
   public static final zn<xa, day> b = dax.b.a(zl.a(day::new));

   public day() {
   }

   private day(int $$0) {
      super($$0);
   }

   private day(Collection<dax> $$0) {
      super($$0);
   }

   @Nullable
   public dax a(cuq $$0, cuq $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dax $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dax $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public day a() {
      day $$0 = new day(this.size());

      for (dax $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
