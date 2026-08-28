import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dgg extends ArrayList<dgf> {
   public static final Codec<dgg> a = dgf.a.listOf().fieldOf("Recipes").xmap(dgg::new, Function.identity()).codec();
   public static final zt<xg, dgg> b = dgf.b.a(zr.a(dgg::new));

   public dgg() {
   }

   private dgg(int $$0) {
      super($$0);
   }

   private dgg(Collection<dgf> $$0) {
      super($$0);
   }

   @Nullable
   public dgf a(cxp $$0, cxp $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dgf $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dgf $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dgg a() {
      dgg $$0 = new dgg(this.size());

      for (dgf $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
