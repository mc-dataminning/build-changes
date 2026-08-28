import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class awt extends awr {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<dav<?>> $$0, arr $$1) {
      List<all> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (dav<?> $$4 : $$0) {
         all $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ap_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            ao.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aes.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<dav<?>> $$0, arr $$1) {
      List<all> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (dav<?> $$4 : $$0) {
         all $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aes.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aes.a $$0, arr $$1, List<all> $$2) {
      $$1.g.b(new aes($$0, $$2, Collections.emptyList(), this.a()));
   }

   public un b() {
      un $$0 = new un();
      this.a().b($$0);
      ut $$1 = new ut();

      for (all $$2 : this.a) {
         $$1.add(vi.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ut $$3 = new ut();

      for (all $$4 : this.b) {
         $$3.add(vi.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(un $$0, dax $$1) {
      this.a(aws.a($$0));
      ut $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ut $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ut $$0, Consumer<dav<?>> $$1, dax $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            all $$5 = all.a($$4);
            Optional<dav<?>> $$6 = $$2.a($$5);
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

   public void a(arr $$0) {
      $$0.g.b(new aes(aes.a.a, this.a, this.b, this.a()));
   }
}
