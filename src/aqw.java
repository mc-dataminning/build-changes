import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aqw extends aqu {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<coq<?>> $$0, amf $$1) {
      List<agi> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (coq<?> $$4 : $$0) {
         agi $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ap_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            al.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aak.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<coq<?>> $$0, amf $$1) {
      List<agi> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (coq<?> $$4 : $$0) {
         agi $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aak.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aak.a $$0, amf $$1, List<agi> $$2) {
      $$1.c.b(new aak($$0, $$2, Collections.emptyList(), this.a()));
   }

   public rz b() {
      rz $$0 = new rz();
      this.a().b($$0);
      sf $$1 = new sf();

      for (agi $$2 : this.a) {
         $$1.add(su.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      sf $$3 = new sf();

      for (agi $$4 : this.b) {
         $$3.add(su.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(rz $$0, cor $$1) {
      this.a(aqv.a($$0));
      sf $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      sf $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(sf $$0, Consumer<coq<?>> $$1, cor $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            agi $$5 = new agi($$4);
            Optional<coq<?>> $$6 = $$2.a($$5);
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

   public void a(amf $$0) {
      $$0.c.b(new aak(aak.a.a, this.a, this.b, this.a()));
   }
}
