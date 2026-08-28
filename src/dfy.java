import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dfy extends ArrayList<dfx> {
   public static final Codec<dfy> a = dfx.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dfy::new, Function.identity()).codec();
   public static final yn<wa, dfy> b = dfx.b.a(yl.a(dfy::new));

   public dfy() {
   }

   private dfy(int $$0) {
      super($$0);
   }

   private dfy(Collection<dfx> $$0) {
      super($$0);
   }

   @Nullable
   public dfx a(cxh $$0, cxh $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dfx $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dfx $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dfy a() {
      dfy $$0 = new dfy(this.size());

      for (dfx $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
