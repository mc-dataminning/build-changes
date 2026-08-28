import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dhz extends ArrayList<dhy> {
   public static final Codec<dhz> a = dhy.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dhz::new, Function.identity()).codec();
   public static final yw<wj, dhz> b = dhy.b.a(yu.a(dhz::new));

   public dhz() {
   }

   private dhz(int $$0) {
      super($$0);
   }

   private dhz(Collection<dhy> $$0) {
      super($$0);
   }

   @Nullable
   public dhy a(czd $$0, czd $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dhy $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dhy $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dhz a() {
      dhz $$0 = new dhz(this.size());

      for (dhy $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
