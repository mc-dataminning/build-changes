import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dcq extends ArrayList<dcp> {
   public static final Codec<dcq> a = dcp.a.listOf().fieldOf("Recipes").xmap(dcq::new, Function.identity()).codec();
   public static final zb<wo, dcq> b = dcp.b.a(yz.a(dcq::new));

   public dcq() {
   }

   private dcq(int $$0) {
      super($$0);
   }

   private dcq(Collection<dcp> $$0) {
      super($$0);
   }

   @Nullable
   public dcp a(cvl $$0, cvl $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dcp $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dcp $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dcq a() {
      dcq $$0 = new dcq(this.size());

      for (dcp $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
