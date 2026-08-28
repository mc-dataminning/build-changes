import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dbc extends ArrayList<dbb> {
   public static final Codec<dbc> a = dbb.a.listOf().fieldOf("Recipes").xmap(dbc::new, Function.identity()).codec();
   public static final ys<wf, dbc> b = dbb.b.a(yq.a(dbc::new));

   public dbc() {
   }

   private dbc(int $$0) {
      super($$0);
   }

   private dbc(Collection<dbb> $$0) {
      super($$0);
   }

   @Nullable
   public dbb a(cua $$0, cua $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dbb $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dbb $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dbc a() {
      dbc $$0 = new dbc(this.size());

      for (dbb $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
