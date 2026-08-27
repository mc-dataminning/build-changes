import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class czw extends ArrayList<czv> {
   public static final Codec<czw> a = czv.a.listOf().fieldOf("Recipes").xmap(czw::new, Function.identity()).codec();
   public static final yv<wi, czw> b = czv.b.a(yt.a(czw::new));

   public czw() {
   }

   private czw(int $$0) {
      super($$0);
   }

   private czw(Collection<czv> $$0) {
      super($$0);
   }

   @Nullable
   public czv a(cto $$0, cto $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         czv $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            czv $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public czw a() {
      czw $$0 = new czw(this.size());

      for (czv $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
