import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dbv extends ArrayList<dbu> {
   public static final Codec<dbv> a = dbu.a.listOf().fieldOf("Recipes").xmap(dbv::new, Function.identity()).codec();
   public static final yx<wk, dbv> b = dbu.b.a(yv.a(dbv::new));

   public dbv() {
   }

   private dbv(int $$0) {
      super($$0);
   }

   private dbv(Collection<dbu> $$0) {
      super($$0);
   }

   @Nullable
   public dbu a(cuq $$0, cuq $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dbu $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dbu $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dbv a() {
      dbv $$0 = new dbv(this.size());

      for (dbu $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
