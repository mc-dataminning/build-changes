import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aur extends aup {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cvl<?>> $$0, apt $$1) {
      List<ajt> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cvl<?> $$4 : $$0) {
         ajt $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ao_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(adh.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cvl<?>> $$0, apt $$1) {
      List<ajt> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cvl<?> $$4 : $$0) {
         ajt $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(adh.a.c, $$1, $$2);
      return $$3;
   }

   private void a(adh.a $$0, apt $$1, List<ajt> $$2) {
      $$1.d.b(new adh($$0, $$2, Collections.emptyList(), this.a()));
   }

   public tm b() {
      tm $$0 = new tm();
      this.a().b($$0);
      ts $$1 = new ts();

      for (ajt $$2 : this.a) {
         $$1.add(uh.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ts $$3 = new ts();

      for (ajt $$4 : this.b) {
         $$3.add(uh.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(tm $$0, cvm $$1) {
      this.a(auq.a($$0));
      ts $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ts $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ts $$0, Consumer<cvl<?>> $$1, cvm $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ajt $$5 = new ajt($$4);
            Optional<cvl<?>> $$6 = $$2.a($$5);
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

   public void a(apt $$0) {
      $$0.d.b(new adh(adh.a.a, this.a, this.b, this.a()));
   }
}
