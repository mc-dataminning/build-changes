import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aoz extends aox {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<clz<?>> $$0, akj $$1) {
      List<aep> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (clz<?> $$4 : $$0) {
         aep $$5 = $$4.e();
         if (!this.a.contains($$5) && !$$4.ai_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            ai.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(yw.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<clz<?>> $$0, akj $$1) {
      List<aep> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (clz<?> $$4 : $$0) {
         aep $$5 = $$4.e();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(yw.a.c, $$1, $$2);
      return $$3;
   }

   private void a(yw.a $$0, akj $$1, List<aep> $$2) {
      $$1.c.b(new yw($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qs b() {
      qs $$0 = new qs();
      this.a().b($$0);
      qy $$1 = new qy();

      for (aep $$2 : this.a) {
         $$1.add(rj.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      qy $$3 = new qy();

      for (aep $$4 : this.b) {
         $$3.add(rj.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qs $$0, cma $$1) {
      this.a(aoy.a($$0));
      qy $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      qy $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(qy $$0, Consumer<clz<?>> $$1, cma $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aep $$5 = new aep($$4);
            Optional<? extends clz<?>> $$6 = $$2.a($$5);
            if (!$$6.isPresent()) {
               d.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept((clz<?>)$$6.get());
            }
         } catch (z var8) {
            d.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }
   }

   public void a(akj $$0) {
      $$0.c.b(new yw(yw.a.a, this.a, this.b, this.a()));
   }
}
