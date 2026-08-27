import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cvd extends ArrayList<cvc> {
   public static final Codec<cvd> a = cvc.a.listOf().fieldOf("Recipes").xmap(cvd::new, Function.identity()).codec();
   public static final xq<vd, cvd> b = cvc.b.a(xo.a(cvd::new));

   public cvd() {
   }

   private cvd(int $$0) {
      super($$0);
   }

   private cvd(Collection<cvc> $$0) {
      super($$0);
   }

   @Nullable
   public cvc a(cpq $$0, cpq $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cvc $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cvc $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public cvd a() {
      cvd $$0 = new cvd(this.size());

      for (cvc $$1 : this) {
         $$0.add($$1.u());
      }

      return $$0;
   }
}
