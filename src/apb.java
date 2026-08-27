import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class apb extends aoz {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cmb<?>> $$0, akl $$1) {
      List<aer> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmb<?> $$4 : $$0) {
         aer $$5 = $$4.e();
         if (!this.a.contains($$5) && !$$4.ai_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            ai.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(yx.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cmb<?>> $$0, akl $$1) {
      List<aer> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmb<?> $$4 : $$0) {
         aer $$5 = $$4.e();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(yx.a.c, $$1, $$2);
      return $$3;
   }

   private void a(yx.a $$0, akl $$1, List<aer> $$2) {
      $$1.c.b(new yx($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qr b() {
      qr $$0 = new qr();
      this.a().b($$0);
      qx $$1 = new qx();

      for (aer $$2 : this.a) {
         $$1.add(ri.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      qx $$3 = new qx();

      for (aer $$4 : this.b) {
         $$3.add(ri.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qr $$0, cmc $$1) {
      this.a(apa.a($$0));
      qx $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      qx $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(qx $$0, Consumer<cmb<?>> $$1, cmc $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aer $$5 = new aer($$4);
            Optional<? extends cmb<?>> $$6 = $$2.a($$5);
            if ($$6.isEmpty()) {
               d.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept((cmb<?>)$$6.get());
            }
         } catch (z var8) {
            d.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }
   }

   public void a(akl $$0) {
      $$0.c.b(new yx(yx.a.a, this.a, this.b, this.a()));
   }
}
