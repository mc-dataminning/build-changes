import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class atu extends ats {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<csu<?>> $$0, apb $$1) {
      List<ajc> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (csu<?> $$4 : $$0) {
         ajc $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ar_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(acr.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<csu<?>> $$0, apb $$1) {
      List<ajc> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (csu<?> $$4 : $$0) {
         ajc $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(acr.a.c, $$1, $$2);
      return $$3;
   }

   private void a(acr.a $$0, apb $$1, List<ajc> $$2) {
      $$1.d.b(new acr($$0, $$2, Collections.emptyList(), this.a()));
   }

   public sy b() {
      sy $$0 = new sy();
      this.a().b($$0);
      te $$1 = new te();

      for (ajc $$2 : this.a) {
         $$1.add(tt.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      te $$3 = new te();

      for (ajc $$4 : this.b) {
         $$3.add(tt.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(sy $$0, csv $$1) {
      this.a(att.a($$0));
      te $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      te $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(te $$0, Consumer<csu<?>> $$1, csv $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ajc $$5 = new ajc($$4);
            Optional<csu<?>> $$6 = $$2.a($$5);
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

   public void a(apb $$0) {
      $$0.d.b(new acr(acr.a.a, this.a, this.b, this.a()));
   }
}
