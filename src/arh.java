import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class arh extends arf {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cpn<?>> $$0, amq $$1) {
      List<agt> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cpn<?> $$4 : $$0) {
         agt $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().aq_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aav.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cpn<?>> $$0, amq $$1) {
      List<agt> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cpn<?> $$4 : $$0) {
         agt $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aav.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aav.a $$0, amq $$1, List<agt> $$2) {
      $$1.c.b(new aav($$0, $$2, Collections.emptyList(), this.a()));
   }

   public sj b() {
      sj $$0 = new sj();
      this.a().b($$0);
      sp $$1 = new sp();

      for (agt $$2 : this.a) {
         $$1.add(te.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      sp $$3 = new sp();

      for (agt $$4 : this.b) {
         $$3.add(te.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(sj $$0, cpo $$1) {
      this.a(arg.a($$0));
      sp $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      sp $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(sp $$0, Consumer<cpn<?>> $$1, cpo $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            agt $$5 = new agt($$4);
            Optional<cpn<?>> $$6 = $$2.a($$5);
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

   public void a(amq $$0) {
      $$0.c.b(new aav(aav.a.a, this.a, this.b, this.a()));
   }
}
