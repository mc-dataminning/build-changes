import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class diu extends ArrayList<dit> {
   public static final Codec<diu> a = dit.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(diu::new, Function.identity()).codec();
   public static final yy<wl, diu> b = dit.b.a(yw.a(diu::new));

   public diu() {
   }

   private diu(int $$0) {
      super($$0);
   }

   private diu(Collection<dit> $$0) {
      super($$0);
   }

   @Nullable
   public dit a(czy $$0, czy $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dit $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dit $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public diu a() {
      diu $$0 = new diu(this.size());

      for (dit $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
