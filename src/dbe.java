import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dbe extends ArrayList<dbd> {
   public static final Codec<dbe> a = dbd.a.listOf().fieldOf("Recipes").xmap(dbe::new, Function.identity()).codec();
   public static final ys<wf, dbe> b = dbd.b.a(yq.a(dbe::new));

   public dbe() {
   }

   private dbe(int $$0) {
      super($$0);
   }

   private dbe(Collection<dbd> $$0) {
      super($$0);
   }

   @Nullable
   public dbd a(cuc $$0, cuc $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dbd $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dbd $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dbe a() {
      dbe $$0 = new dbe(this.size());

      for (dbd $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
