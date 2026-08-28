import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class djg extends ArrayList<djf> {
   public static final Codec<djg> a = djf.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(djg::new, Function.identity()).codec();
   public static final ze<wp, djg> b = djf.b.a(zc.a(djg::new));

   public djg() {
   }

   private djg(int $$0) {
      super($$0);
   }

   private djg(Collection<djf> $$0) {
      super($$0);
   }

   @Nullable
   public djf a(dak $$0, dak $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         djf $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            djf $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public djg a() {
      djg $$0 = new djg(this.size());

      for (djf $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
