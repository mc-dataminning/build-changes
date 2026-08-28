import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ddh extends ArrayList<ddg> {
   public static final Codec<ddh> a = ddg.a.listOf().fieldOf("Recipes").xmap(ddh::new, Function.identity()).codec();
   public static final zc<wp, ddh> b = ddg.b.a(za.a(ddh::new));

   public ddh() {
   }

   private ddh(int $$0) {
      super($$0);
   }

   private ddh(Collection<ddg> $$0) {
      super($$0);
   }

   @Nullable
   public ddg a(cvs $$0, cvs $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         ddg $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            ddg $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public ddh a() {
      ddh $$0 = new ddh(this.size());

      for (ddg $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
