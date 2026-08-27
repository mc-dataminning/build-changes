import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class amm extends amk {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cjc<?>> $$0, aig $$1) {
      List<acq> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cjc<?> $$4 : $$0) {
         acq $$5 = $$4.e();
         if (!this.a.contains($$5) && !$$4.ai_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            ai.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(xb.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cjc<?>> $$0, aig $$1) {
      List<acq> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cjc<?> $$4 : $$0) {
         acq $$5 = $$4.e();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(xb.a.c, $$1, $$2);
      return $$3;
   }

   private void a(xb.a $$0, aig $$1, List<acq> $$2) {
      $$1.c.a(new xb($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qr b() {
      qr $$0 = new qr();
      this.a().b($$0);
      qx $$1 = new qx();

      for (acq $$2 : this.a) {
         $$1.add(ri.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      qx $$3 = new qx();

      for (acq $$4 : this.b) {
         $$3.add(ri.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qr $$0, cjd $$1) {
      this.a(aml.a($$0));
      qx $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      qx $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(qx $$0, Consumer<cjc<?>> $$1, cjd $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            acq $$5 = new acq($$4);
            Optional<? extends cjc<?>> $$6 = $$2.a($$5);
            if (!$$6.isPresent()) {
               d.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept((cjc<?>)$$6.get());
            }
         } catch (z var8) {
            d.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }
   }

   public void a(aig $$0) {
      $$0.c.a(new xb(xb.a.a, this.a, this.b, this.a()));
   }
}
