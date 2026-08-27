import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ara extends aqy {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cov<?>> $$0, amj $$1) {
      List<agm> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cov<?> $$4 : $$0) {
         agm $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ar_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            al.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aao.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cov<?>> $$0, amj $$1) {
      List<agm> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cov<?> $$4 : $$0) {
         agm $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aao.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aao.a $$0, amj $$1, List<agm> $$2) {
      $$1.c.b(new aao($$0, $$2, Collections.emptyList(), this.a()));
   }

   public sd b() {
      sd $$0 = new sd();
      this.a().b($$0);
      sj $$1 = new sj();

      for (agm $$2 : this.a) {
         $$1.add(sy.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      sj $$3 = new sj();

      for (agm $$4 : this.b) {
         $$3.add(sy.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(sd $$0, cow $$1) {
      this.a(aqz.a($$0));
      sj $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      sj $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(sj $$0, Consumer<cov<?>> $$1, cow $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            agm $$5 = new agm($$4);
            Optional<cov<?>> $$6 = $$2.a($$5);
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

   public void a(amj $$0) {
      $$0.c.b(new aao(aao.a.a, this.a, this.b, this.a()));
   }
}
