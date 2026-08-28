import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dgf extends ArrayList<dge> {
   public static final Codec<dgf> a = dge.a.listOf().fieldOf("Recipes").xmap(dgf::new, Function.identity()).codec();
   public static final zt<xg, dgf> b = dge.b.a(zr.a(dgf::new));

   public dgf() {
   }

   private dgf(int $$0) {
      super($$0);
   }

   private dgf(Collection<dge> $$0) {
      super($$0);
   }

   @Nullable
   public dge a(cxo $$0, cxo $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dge $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dge $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dgf a() {
      dgf $$0 = new dgf(this.size());

      for (dge $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
