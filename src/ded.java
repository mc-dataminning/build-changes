import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ded extends ArrayList<dec> {
   public static final Codec<ded> a = dec.a.listOf().fieldOf("Recipes").xmap(ded::new, Function.identity()).codec();
   public static final zj<ww, ded> b = dec.b.a(zh.a(ded::new));

   public ded() {
   }

   private ded(int $$0) {
      super($$0);
   }

   private ded(Collection<dec> $$0) {
      super($$0);
   }

   @Nullable
   public dec a(cwf $$0, cwf $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dec $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dec $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public ded a() {
      ded $$0 = new ded(this.size());

      for (dec $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
