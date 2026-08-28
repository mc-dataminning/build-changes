import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class awf extends awd {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cyy<?>> $$0, arg $$1) {
      List<alf> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyy<?> $$4 : $$0) {
         alf $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().an_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aes.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cyy<?>> $$0, arg $$1) {
      List<alf> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyy<?> $$4 : $$0) {
         alf $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aes.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aes.a $$0, arg $$1, List<alf> $$2) {
      $$1.c.b(new aes($$0, $$2, Collections.emptyList(), this.a()));
   }

   public us b() {
      us $$0 = new us();
      this.a().b($$0);
      uy $$1 = new uy();

      for (alf $$2 : this.a) {
         $$1.add(vn.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      uy $$3 = new uy();

      for (alf $$4 : this.b) {
         $$3.add(vn.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(us $$0, cyz $$1) {
      this.a(awe.a($$0));
      uy $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uy $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(uy $$0, Consumer<cyy<?>> $$1, cyz $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            alf $$5 = new alf($$4);
            Optional<cyy<?>> $$6 = $$2.a($$5);
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

   public void a(arg $$0) {
      $$0.c.b(new aes(aes.a.a, this.a, this.b, this.a()));
   }
}
