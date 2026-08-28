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

   public int a(Collection<cyk<?>> $$0, aqn $$1) {
      List<akk> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyk<?> $$4 : $$0) {
         akk $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ao_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(adx.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cyk<?>> $$0, aqn $$1) {
      List<akk> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyk<?> $$4 : $$0) {
         akk $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(adx.a.c, $$1, $$2);
      return $$3;
   }

   private void a(adx.a $$0, aqn $$1, List<akk> $$2) {
      $$1.c.b(new adx($$0, $$2, Collections.emptyList(), this.a()));
   }

   public tx b() {
      tx $$0 = new tx();
      this.a().b($$0);
      ud $$1 = new ud();

      for (akk $$2 : this.a) {
         $$1.add(us.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ud $$3 = new ud();

      for (akk $$4 : this.b) {
         $$3.add(us.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(tx $$0, cym $$1) {
      this.a(avl.a($$0));
      ud $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ud $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ud $$0, Consumer<cyk<?>> $$1, cym $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akk $$5 = new akk($$4);
            Optional<cyk<?>> $$6 = $$2.a($$5);
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
      $$0.c.b(new adx(adx.a.a, this.a, this.b, this.a()));
   }
}
