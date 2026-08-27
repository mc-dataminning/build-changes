import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aut extends aur {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cvu<?>> $$0, apv $$1) {
      List<ajv> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cvu<?> $$4 : $$0) {
         ajv $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().an_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(adj.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cvu<?>> $$0, apv $$1) {
      List<ajv> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cvu<?> $$4 : $$0) {
         ajv $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(adj.a.c, $$1, $$2);
      return $$3;
   }

   private void a(adj.a $$0, apv $$1, List<ajv> $$2) {
      $$1.d.b(new adj($$0, $$2, Collections.emptyList(), this.a()));
   }

   public to b() {
      to $$0 = new to();
      this.a().b($$0);
      tu $$1 = new tu();

      for (ajv $$2 : this.a) {
         $$1.add(uj.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      tu $$3 = new tu();

      for (ajv $$4 : this.b) {
         $$3.add(uj.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(to $$0, cvv $$1) {
      this.a(aus.a($$0));
      tu $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      tu $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(tu $$0, Consumer<cvu<?>> $$1, cvv $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ajv $$5 = new ajv($$4);
            Optional<cvu<?>> $$6 = $$2.a($$5);
            if ($$6.isEmpty()) {
               d.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept($$6.get());
            }
         } catch (z var8) {
            d.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }
   }

   public void a(apv $$0) {
      $$0.d.b(new adj(adj.a.a, this.a, this.b, this.a()));
   }
}
