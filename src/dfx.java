import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dfx extends ArrayList<dfw> {
   public static final Codec<dfx> a = dfw.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dfx::new, Function.identity()).codec();
   public static final zi<wv, dfx> b = dfw.b.a(zg.a(dfx::new));

   public dfx() {
   }

   private dfx(int $$0) {
      super($$0);
   }

   private dfx(Collection<dfw> $$0) {
      super($$0);
   }

   @Nullable
   public dfw a(cxg $$0, cxg $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dfw $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dfw $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dfx a() {
      dfx $$0 = new dfx(this.size());

      for (dfw $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
