import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dde extends ArrayList<ddd> {
   public static final Codec<dde> a = ddd.a.listOf().fieldOf("Recipes").xmap(dde::new, Function.identity()).codec();
   public static final zb<wo, dde> b = ddd.b.a(yz.a(dde::new));

   public dde() {
   }

   private dde(int $$0) {
      super($$0);
   }

   private dde(Collection<ddd> $$0) {
      super($$0);
   }

   @Nullable
   public ddd a(cvp $$0, cvp $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         ddd $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            ddd $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dde a() {
      dde $$0 = new dde(this.size());

      for (ddd $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
