import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ave extends avc {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cwi<?>> $$0, aqf $$1) {
      List<akf> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cwi<?> $$4 : $$0) {
         akf $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().an_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(adt.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cwi<?>> $$0, aqf $$1) {
      List<akf> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cwi<?> $$4 : $$0) {
         akf $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(adt.a.c, $$1, $$2);
      return $$3;
   }

   private void a(adt.a $$0, aqf $$1, List<akf> $$2) {
      $$1.d.b(new adt($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ty b() {
      ty $$0 = new ty();
      this.a().b($$0);
      ue $$1 = new ue();

      for (akf $$2 : this.a) {
         $$1.add(ut.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ue $$3 = new ue();

      for (akf $$4 : this.b) {
         $$3.add(ut.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ty $$0, cwj $$1) {
      this.a(avd.a($$0));
      ue $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ue $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ue $$0, Consumer<cwi<?>> $$1, cwj $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akf $$5 = new akf($$4);
            Optional<cwi<?>> $$6 = $$2.a($$5);
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

   public void a(aqf $$0) {
      $$0.d.b(new adt(adt.a.a, this.a, this.b, this.a()));
   }
}
