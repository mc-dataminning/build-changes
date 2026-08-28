import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dax extends ArrayList<daw> {
   public static final Codec<dax> a = daw.a.listOf().fieldOf("Recipes").xmap(dax::new, Function.identity()).codec();
   public static final zn<xa, dax> b = daw.b.a(zl.a(dax::new));

   public dax() {
   }

   private dax(int $$0) {
      super($$0);
   }

   private dax(Collection<daw> $$0) {
      super($$0);
   }

   @Nullable
   public daw a(cup $$0, cup $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         daw $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            daw $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dax a() {
      dax $$0 = new dax(this.size());

      for (daw $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
