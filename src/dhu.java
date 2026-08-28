import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dhu extends ArrayList<dht> {
   public static final Codec<dhu> a = dht.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dhu::new, Function.identity()).codec();
   public static final yw<wj, dhu> b = dht.b.a(yu.a(dhu::new));

   public dhu() {
   }

   private dhu(int $$0) {
      super($$0);
   }

   private dhu(Collection<dht> $$0) {
      super($$0);
   }

   @Nullable
   public dht a(cyy $$0, cyy $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dht $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dht $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dhu a() {
      dhu $$0 = new dhu(this.size());

      for (dht $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
