import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class daw extends ArrayList<dav> {
   public static final Codec<daw> a = dav.a.listOf().fieldOf("Recipes").xmap(daw::new, Function.identity()).codec();
   public static final zm<wz, daw> b = dav.b.a(zk.a(daw::new));

   public daw() {
   }

   private daw(int $$0) {
      super($$0);
   }

   private daw(Collection<dav> $$0) {
      super($$0);
   }

   @Nullable
   public dav a(cuo $$0, cuo $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dav $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dav $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public daw a() {
      daw $$0 = new daw(this.size());

      for (dav $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
