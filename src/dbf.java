import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dbf extends ArrayList<dbe> {
   public static final Codec<dbf> a = dbe.a.listOf().fieldOf("Recipes").xmap(dbf::new, Function.identity()).codec();
   public static final ys<wf, dbf> b = dbe.b.a(yq.a(dbf::new));

   public dbf() {
   }

   private dbf(int $$0) {
      super($$0);
   }

   private dbf(Collection<dbe> $$0) {
      super($$0);
   }

   @Nullable
   public dbe a(cud $$0, cud $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dbe $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dbe $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dbf a() {
      dbf $$0 = new dbf(this.size());

      for (dbe $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
