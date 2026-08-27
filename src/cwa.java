import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cwa extends ArrayList<cvz> {
   public static final Codec<cwa> a = cvz.a.listOf().fieldOf("Recipes").xmap(cwa::new, Function.identity()).codec();
   public static final xs<vf, cwa> b = cvz.b.a(xq.a(cwa::new));

   public cwa() {
   }

   private cwa(int $$0) {
      super($$0);
   }

   private cwa(Collection<cvz> $$0) {
      super($$0);
   }

   @Nullable
   public cvz a(cqm $$0, cqm $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cvz $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cvz $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public cwa a() {
      cwa $$0 = new cwa(this.size());

      for (cvz $$1 : this) {
         $$0.add($$1.u());
      }

      return $$0;
   }
}
