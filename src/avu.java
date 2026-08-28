import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class avu extends avs {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<czb<?>> $$0, aqv $$1) {
      List<akr> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (czb<?> $$4 : $$0) {
         akr $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().as_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            an.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aee.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<czb<?>> $$0, aqv $$1) {
      List<akr> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (czb<?> $$4 : $$0) {
         akr $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aee.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aee.a $$0, aqv $$1, List<akr> $$2) {
      $$1.c.b(new aee($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ub b() {
      ub $$0 = new ub();
      this.a().b($$0);
      uh $$1 = new uh();

      for (akr $$2 : this.a) {
         $$1.add(uw.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      uh $$3 = new uh();

      for (akr $$4 : this.b) {
         $$3.add(uw.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ub $$0, czd $$1) {
      this.a(avt.a($$0));
      uh $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uh $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(uh $$0, Consumer<czb<?>> $$1, czd $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akr $$5 = akr.a($$4);
            Optional<czb<?>> $$6 = $$2.a($$5);
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

   public void a(aqv $$0) {
      $$0.c.b(new aee(aee.a.a, this.a, this.b, this.a()));
   }
}
