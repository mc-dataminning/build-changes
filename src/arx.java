import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class arx extends arv {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cqe<?>> $$0, ane $$1) {
      List<ahg> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cqe<?> $$4 : $$0) {
         ahg $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().aq_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(abh.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cqe<?>> $$0, ane $$1) {
      List<ahg> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cqe<?> $$4 : $$0) {
         ahg $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(abh.a.c, $$1, $$2);
      return $$3;
   }

   private void a(abh.a $$0, ane $$1, List<ahg> $$2) {
      $$1.c.b(new abh($$0, $$2, Collections.emptyList(), this.a()));
   }

   public sn b() {
      sn $$0 = new sn();
      this.a().b($$0);
      st $$1 = new st();

      for (ahg $$2 : this.a) {
         $$1.add(ti.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      st $$3 = new st();

      for (ahg $$4 : this.b) {
         $$3.add(ti.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(sn $$0, cqf $$1) {
      this.a(arw.a($$0));
      st $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      st $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(st $$0, Consumer<cqe<?>> $$1, cqf $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ahg $$5 = new ahg($$4);
            Optional<cqe<?>> $$6 = $$2.a($$5);
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

   public void a(ane $$0) {
      $$0.c.b(new abh(abh.a.a, this.a, this.b, this.a()));
   }
}
