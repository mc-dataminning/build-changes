import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class awp extends awn {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<dal<?>> $$0, arn $$1) {
      List<alh> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (dal<?> $$4 : $$0) {
         alh $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().aq_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            an.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aeo.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<dal<?>> $$0, arn $$1) {
      List<alh> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (dal<?> $$4 : $$0) {
         alh $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aeo.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aeo.a $$0, arn $$1, List<alh> $$2) {
      $$1.d.b(new aeo($$0, $$2, Collections.emptyList(), this.a()));
   }

   public uj b() {
      uj $$0 = new uj();
      this.a().b($$0);
      up $$1 = new up();

      for (alh $$2 : this.a) {
         $$1.add(ve.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      up $$3 = new up();

      for (alh $$4 : this.b) {
         $$3.add(ve.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(uj $$0, dan $$1) {
      this.a(awo.a($$0));
      up $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      up $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(up $$0, Consumer<dal<?>> $$1, dan $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            alh $$5 = alh.a($$4);
            Optional<dal<?>> $$6 = $$2.a($$5);
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

   public void a(arn $$0) {
      $$0.d.b(new aeo(aeo.a.a, this.a, this.b, this.a()));
   }
}
