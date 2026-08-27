import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class avm extends avk {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cxw<?>> $$0, aqn $$1) {
      List<akm> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cxw<?> $$4 : $$0) {
         akm $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().an_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(adz.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cxw<?>> $$0, aqn $$1) {
      List<akm> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cxw<?> $$4 : $$0) {
         akm $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(adz.a.c, $$1, $$2);
      return $$3;
   }

   private void a(adz.a $$0, aqn $$1, List<akm> $$2) {
      $$1.d.b(new adz($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ud b() {
      ud $$0 = new ud();
      this.a().b($$0);
      uj $$1 = new uj();

      for (akm $$2 : this.a) {
         $$1.add(uy.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      uj $$3 = new uj();

      for (akm $$4 : this.b) {
         $$3.add(uy.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ud $$0, cxx $$1) {
      this.a(avl.a($$0));
      uj $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uj $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(uj $$0, Consumer<cxw<?>> $$1, cxx $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akm $$5 = new akm($$4);
            Optional<cxw<?>> $$6 = $$2.a($$5);
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

   public void a(aqn $$0) {
      $$0.d.b(new adz(adz.a.a, this.a, this.b, this.a()));
   }
}
