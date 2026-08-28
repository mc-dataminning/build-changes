import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aws extends awq {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<dbc<?>> $$0, arq $$1) {
      List<alj> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (dbc<?> $$4 : $$0) {
         alj $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ao_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            ao.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aeq.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<dbc<?>> $$0, arq $$1) {
      List<alj> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (dbc<?> $$4 : $$0) {
         alj $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aeq.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aeq.a $$0, arq $$1, List<alj> $$2) {
      $$1.f.b(new aeq($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ul b() {
      ul $$0 = new ul();
      this.a().b($$0);
      ur $$1 = new ur();

      for (alj $$2 : this.a) {
         $$1.add(vg.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ur $$3 = new ur();

      for (alj $$4 : this.b) {
         $$3.add(vg.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ul $$0, dbe $$1) {
      this.a(awr.a($$0));
      ur $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ur $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ur $$0, Consumer<dbc<?>> $$1, dbe $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            alj $$5 = alj.a($$4);
            Optional<dbc<?>> $$6 = $$2.a($$5);
            if ($$6.isEmpty()) {
               d.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept($$6.get());
            }
         } catch (aa var8) {
            d.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }
   }

   public void a(arq $$0) {
      $$0.f.b(new aeq(aeq.a.a, this.a, this.b, this.a()));
   }
}
