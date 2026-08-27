import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class arr extends arp {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cpx<?>> $$0, ana $$1) {
      List<ahd> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cpx<?> $$4 : $$0) {
         ahd $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().aq_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            am.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(abe.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cpx<?>> $$0, ana $$1) {
      List<ahd> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cpx<?> $$4 : $$0) {
         ahd $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(abe.a.c, $$1, $$2);
      return $$3;
   }

   private void a(abe.a $$0, ana $$1, List<ahd> $$2) {
      $$1.c.b(new abe($$0, $$2, Collections.emptyList(), this.a()));
   }

   public sl b() {
      sl $$0 = new sl();
      this.a().b($$0);
      sr $$1 = new sr();

      for (ahd $$2 : this.a) {
         $$1.add(tg.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      sr $$3 = new sr();

      for (ahd $$4 : this.b) {
         $$3.add(tg.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(sl $$0, cpy $$1) {
      this.a(arq.a($$0));
      sr $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      sr $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(sr $$0, Consumer<cpx<?>> $$1, cpy $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            ahd $$5 = new ahd($$4);
            Optional<cpx<?>> $$6 = $$2.a($$5);
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

   public void a(ana $$0) {
      $$0.c.b(new abe(abe.a.a, this.a, this.b, this.a()));
   }
}
