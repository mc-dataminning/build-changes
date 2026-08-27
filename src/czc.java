import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class czc extends ArrayList<czb> {
   public static final Codec<czc> a = czb.a.listOf().fieldOf("Recipes").xmap(czc::new, Function.identity()).codec();
   public static final ys<wf, czc> b = czb.b.a(yq.a(czc::new));

   public czc() {
   }

   private czc(int $$0) {
      super($$0);
   }

   private czc(Collection<czb> $$0) {
      super($$0);
   }

   @Nullable
   public czb a(csz $$0, csz $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         czb $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            czb $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public czc a() {
      czc $$0 = new czc(this.size());

      for (czb $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
