import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cxw extends ArrayList<cxv> {
   public static final Codec<cxw> a = cxv.a.listOf().fieldOf("Recipes").xmap(cxw::new, Function.identity()).codec();
   public static final ye<vr, cxw> b = cxv.b.a(yc.a(cxw::new));

   public cxw() {
   }

   private cxw(int $$0) {
      super($$0);
   }

   private cxw(Collection<cxv> $$0) {
      super($$0);
   }

   @Nullable
   public cxv a(crj $$0, crj $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cxv $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cxv $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public cxw a() {
      cxw $$0 = new cxw(this.size());

      for (cxv $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
