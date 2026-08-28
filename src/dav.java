import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dav extends ArrayList<dau> {
   public static final Codec<dav> a = dau.a.listOf().fieldOf("Recipes").xmap(dav::new, Function.identity()).codec();
   public static final zm<wz, dav> b = dau.b.a(zk.a(dav::new));

   public dav() {
   }

   private dav(int $$0) {
      super($$0);
   }

   private dav(Collection<dau> $$0) {
      super($$0);
   }

   @Nullable
   public dau a(cun $$0, cun $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dau $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dau $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dav a() {
      dav $$0 = new dav(this.size());

      for (dau $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
