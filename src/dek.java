import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dek extends ArrayList<dej> {
   public static final Codec<dek> a = dej.a.listOf().fieldOf("Recipes").xmap(dek::new, Function.identity()).codec();
   public static final zh<wu, dek> b = dej.b.a(zf.a(dek::new));

   public dek() {
   }

   private dek(int $$0) {
      super($$0);
   }

   private dek(Collection<dej> $$0) {
      super($$0);
   }

   @Nullable
   public dej a(cwm $$0, cwm $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dej $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dej $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dek a() {
      dek $$0 = new dek(this.size());

      for (dej $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
