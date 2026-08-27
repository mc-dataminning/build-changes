import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ape extends apc {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cmf<?>> $$0, ako $$1) {
      List<aeu> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmf<?> $$4 : $$0) {
         aeu $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ah_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            al.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(za.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cmf<?>> $$0, ako $$1) {
      List<aeu> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmf<?> $$4 : $$0) {
         aeu $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(za.a.c, $$1, $$2);
      return $$3;
   }

   private void a(za.a $$0, ako $$1, List<aeu> $$2) {
      $$1.c.b(new za($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qu b() {
      qu $$0 = new qu();
      this.a().b($$0);
      ra $$1 = new ra();

      for (aeu $$2 : this.a) {
         $$1.add(rl.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ra $$3 = new ra();

      for (aeu $$4 : this.b) {
         $$3.add(rl.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qu $$0, cmg $$1) {
      this.a(apd.a($$0));
      ra $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ra $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ra $$0, Consumer<cmf<?>> $$1, cmg $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aeu $$5 = new aeu($$4);
            Optional<cmf<?>> $$6 = $$2.a($$5);
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

   public void a(ako $$0) {
      $$0.c.b(new za(za.a.a, this.a, this.b, this.a()));
   }
}
