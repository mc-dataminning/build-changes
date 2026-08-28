import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class diw extends ArrayList<div> {
   public static final Codec<diw> a = div.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(diw::new, Function.identity()).codec();
   public static final za<wn, diw> b = div.b.a(yy.a(diw::new));

   public diw() {
   }

   private diw(int $$0) {
      super($$0);
   }

   private diw(Collection<div> $$0) {
      super($$0);
   }

   @Nullable
   public div a(daa $$0, daa $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         div $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            div $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public diw a() {
      diw $$0 = new diw(this.size());

      for (div $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
