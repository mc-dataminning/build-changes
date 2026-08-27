import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class atq extends ato {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<csh<?>> $$0, aox $$1) {
      List<aiy> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (csh<?> $$4 : $$0) {
         aiy $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().as_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aco.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<csh<?>> $$0, aox $$1) {
      List<aiy> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (csh<?> $$4 : $$0) {
         aiy $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aco.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aco.a $$0, aox $$1, List<aiy> $$2) {
      $$1.d.b(new aco($$0, $$2, Collections.emptyList(), this.a()));
   }

   public sw b() {
      sw $$0 = new sw();
      this.a().b($$0);
      tc $$1 = new tc();

      for (aiy $$2 : this.a) {
         $$1.add(tr.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      tc $$3 = new tc();

      for (aiy $$4 : this.b) {
         $$3.add(tr.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(sw $$0, csi $$1) {
      this.a(atp.a($$0));
      tc $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      tc $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(tc $$0, Consumer<csh<?>> $$1, csi $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aiy $$5 = new aiy($$4);
            Optional<csh<?>> $$6 = $$2.a($$5);
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

   public void a(aox $$0) {
      $$0.d.b(new aco(aco.a.a, this.a, this.b, this.a()));
   }
}
