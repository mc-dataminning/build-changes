import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ddz extends ArrayList<ddy> {
   public static final Codec<ddz> a = ddy.a.listOf().fieldOf("Recipes").xmap(ddz::new, Function.identity()).codec();
   public static final zg<wt, ddz> b = ddy.b.a(ze.a(ddz::new));

   public ddz() {
   }

   private ddz(int $$0) {
      super($$0);
   }

   private ddz(Collection<ddy> $$0) {
      super($$0);
   }

   @Nullable
   public ddy a(cwb $$0, cwb $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         ddy $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            ddy $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public ddz a() {
      ddz $$0 = new ddz(this.size());

      for (ddy $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
