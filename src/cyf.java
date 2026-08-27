import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cyf extends ArrayList<cye> {
   public static final Codec<cyf> a = cye.a.listOf().fieldOf("Recipes").xmap(cyf::new, Function.identity()).codec();
   public static final yg<vt, cyf> b = cye.b.a(ye.a(cyf::new));

   public cyf() {
   }

   private cyf(int $$0) {
      super($$0);
   }

   private cyf(Collection<cye> $$0) {
      super($$0);
   }

   @Nullable
   public cye a(crs $$0, crs $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         cye $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            cye $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public cyf a() {
      cyf $$0 = new cyf(this.size());

      for (cye $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
