import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class apj extends aph {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cmk<?>> $$0, aks $$1) {
      List<aex> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmk<?> $$4 : $$0) {
         aex $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().am_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            al.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(ze.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cmk<?>> $$0, aks $$1) {
      List<aex> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmk<?> $$4 : $$0) {
         aex $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(ze.a.c, $$1, $$2);
      return $$3;
   }

   private void a(ze.a $$0, aks $$1, List<aex> $$2) {
      $$1.c.b(new ze($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qy b() {
      qy $$0 = new qy();
      this.a().b($$0);
      re $$1 = new re();

      for (aex $$2 : this.a) {
         $$1.add(rp.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      re $$3 = new re();

      for (aex $$4 : this.b) {
         $$3.add(rp.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qy $$0, cml $$1) {
      this.a(api.a($$0));
      re $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      re $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(re $$0, Consumer<cmk<?>> $$1, cml $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aex $$5 = new aex($$4);
            Optional<cmk<?>> $$6 = $$2.a($$5);
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

   public void a(aks $$0) {
      $$0.c.b(new ze(ze.a.a, this.a, this.b, this.a()));
   }
}
