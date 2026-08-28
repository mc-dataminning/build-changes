import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class das extends ArrayList<dar> {
   public static final Codec<das> a = dar.a.listOf().fieldOf("Recipes").xmap(das::new, Function.identity()).codec();
   public static final zj<ww, das> b = dar.b.a(zh.a(das::new));

   public das() {
   }

   private das(int $$0) {
      super($$0);
   }

   private das(Collection<dar> $$0) {
      super($$0);
   }

   @Nullable
   public dar a(cuk $$0, cuk $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dar $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dar $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public das a() {
      das $$0 = new das(this.size());

      for (dar $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
