import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aud extends aub {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<ctp<?>> $$0, apg $$1) {
      List<ajh> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (ctp<?> $$4 : $$0) {
         ajh $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().aq_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(acv.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<ctp<?>> $$0, apg $$1) {
      List<ajh> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (ctp<?> $$4 : $$0) {
         ajh $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(acv.a.c, $$1, $$2);
      return $$3;
   }

   private void a(acv.a $$0, apg $$1, List<ajh> $$2) {
      $$1.d.b(new acv($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ta b() {
      ta $$0 = new ta();
      this.a().b($$0);
      tg $$1 = new tg();

      for (ajh $$2 : this.a) {
         $$1.add(tv.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      tg $$3 = new tg();

      for (ajh $$4 : this.b) {
         $$3.add(tv.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ta $$0, ctq $$1) {
      this.a(auc.a($$0));
      tg $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      tg $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(tg $$0, Consumer<ctp<?>> $$1, ctq $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ajh $$5 = new ajh($$4);
            Optional<ctp<?>> $$6 = $$2.a($$5);
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

   public void a(apg $$0) {
      $$0.d.b(new acv(acv.a.a, this.a, this.b, this.a()));
   }
}
