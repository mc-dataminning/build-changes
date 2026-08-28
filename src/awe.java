import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class awe extends awc {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cyv<?>> $$0, arf $$1) {
      List<ale> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyv<?> $$4 : $$0) {
         ale $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ao_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aer.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cyv<?>> $$0, arf $$1) {
      List<ale> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyv<?> $$4 : $$0) {
         ale $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aer.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aer.a $$0, arf $$1, List<ale> $$2) {
      $$1.c.b(new aer($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ur b() {
      ur $$0 = new ur();
      this.a().b($$0);
      ux $$1 = new ux();

      for (ale $$2 : this.a) {
         $$1.add(vm.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ux $$3 = new ux();

      for (ale $$4 : this.b) {
         $$3.add(vm.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ur $$0, cyw $$1) {
      this.a(awd.a($$0));
      ux $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ux $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ux $$0, Consumer<cyv<?>> $$1, cyw $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ale $$5 = new ale($$4);
            Optional<cyv<?>> $$6 = $$2.a($$5);
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

   public void a(arf $$0) {
      $$0.c.b(new aer(aer.a.a, this.a, this.b, this.a()));
   }
}
