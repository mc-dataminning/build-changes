import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cvy extends ArrayList<cvx> {
   public static final Codec<cvy> a = cvx.a.listOf().fieldOf("Recipes").xmap(cvy::new, Function.identity()).codec();
   public static final xs<vf, cvy> b = cvx.b.a(xq.a(cvy::new));

   public cvy() {
   }

   private cvy(int $$0) {
      super($$0);
   }

   private cvy(Collection<cvx> $$0) {
      super($$0);
   }

   @Nullable
   public cvx a(cqk $$0, cqk $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cvx $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cvx $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public cvy a() {
      cvy $$0 = new cvy(this.size());

      for (cvx $$1 : this) {
         $$0.add($$1.u());
      }

      return $$0;
   }
}
