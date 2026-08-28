import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ddt extends ArrayList<dds> {
   public static final Codec<ddt> a = dds.a.listOf().fieldOf("Recipes").xmap(ddt::new, Function.identity()).codec();
   public static final zf<ws, ddt> b = dds.b.a(zd.a(ddt::new));

   public ddt() {
   }

   private ddt(int $$0) {
      super($$0);
   }

   private ddt(Collection<dds> $$0) {
      super($$0);
   }

   @Nullable
   public dds a(cvx $$0, cvx $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dds $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dds $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public ddt a() {
      ddt $$0 = new ddt(this.size());

      for (dds $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
