import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class avt extends avr {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cyz<?>> $$0, aqu $$1) {
      List<akq> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyz<?> $$4 : $$0) {
         akq $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ao_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            an.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aed.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cyz<?>> $$0, aqu $$1) {
      List<akq> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cyz<?> $$4 : $$0) {
         akq $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aed.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aed.a $$0, aqu $$1, List<akq> $$2) {
      $$1.c.b(new aed($$0, $$2, Collections.emptyList(), this.a()));
   }

   public ua b() {
      ua $$0 = new ua();
      this.a().b($$0);
      ug $$1 = new ug();

      for (akq $$2 : this.a) {
         $$1.add(uv.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ug $$3 = new ug();

      for (akq $$4 : this.b) {
         $$3.add(uv.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ua $$0, czb $$1) {
      this.a(avs.a($$0));
      ug $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ug $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ug $$0, Consumer<cyz<?>> $$1, czb $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akq $$5 = akq.a($$4);
            Optional<cyz<?>> $$6 = $$2.a($$5);
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

   public void a(aqu $$0) {
      $$0.c.b(new aed(aed.a.a, this.a, this.b, this.a()));
   }
}
