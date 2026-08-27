import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ary extends arw {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cqm<?>> $$0, anf $$1) {
      List<ahh> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cqm<?> $$4 : $$0) {
         ahh $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().as_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(abi.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cqm<?>> $$0, anf $$1) {
      List<ahh> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cqm<?> $$4 : $$0) {
         ahh $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(abi.a.c, $$1, $$2);
      return $$3;
   }

   private void a(abi.a $$0, anf $$1, List<ahh> $$2) {
      $$1.c.b(new abi($$0, $$2, Collections.emptyList(), this.a()));
   }

   public so b() {
      so $$0 = new so();
      this.a().b($$0);
      su $$1 = new su();

      for (ahh $$2 : this.a) {
         $$1.add(tj.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      su $$3 = new su();

      for (ahh $$4 : this.b) {
         $$3.add(tj.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(so $$0, cqn $$1) {
      this.a(arx.a($$0));
      su $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      su $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(su $$0, Consumer<cqm<?>> $$1, cqn $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ahh $$5 = new ahh($$4);
            Optional<cqm<?>> $$6 = $$2.a($$5);
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

   public void a(anf $$0) {
      $$0.c.b(new abi(abi.a.a, this.a, this.b, this.a()));
   }
}
