import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class czy extends ArrayList<czx> {
   public static final Codec<czy> a = czx.a.listOf().fieldOf("Recipes").xmap(czy::new, Function.identity()).codec();
   public static final yv<wi, czy> b = czx.b.a(yt.a(czy::new));

   public czy() {
   }

   private czy(int $$0) {
      super($$0);
   }

   private czy(Collection<czx> $$0) {
      super($$0);
   }

   @Nullable
   public czx a(ctq $$0, ctq $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         czx $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            czx $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public czy a() {
      czy $$0 = new czy(this.size());

      for (czx $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
