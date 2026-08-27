import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class avn extends avl {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cxy<?>> $$0, aqo $$1) {
      List<akn> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cxy<?> $$4 : $$0) {
         akn $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ao_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aea.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cxy<?>> $$0, aqo $$1) {
      List<akn> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cxy<?> $$4 : $$0) {
         akn $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aea.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aea.a $$0, aqo $$1, List<akn> $$2) {
      $$1.c.b(new aea($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ud b() {
      ud $$0 = new ud();
      this.a().b($$0);
      uj $$1 = new uj();

      for (akn $$2 : this.a) {
         $$1.add(uy.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      uj $$3 = new uj();

      for (akn $$4 : this.b) {
         $$3.add(uy.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ud $$0, cxz $$1) {
      this.a(avm.a($$0));
      uj $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uj $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(uj $$0, Consumer<cxy<?>> $$1, cxz $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akn $$5 = new akn($$4);
            Optional<cxy<?>> $$6 = $$2.a($$5);
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

   public void a(aqo $$0) {
      $$0.c.b(new aea(aea.a.a, this.a, this.b, this.a()));
   }
}
