import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class aqi extends aqg {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cno<?>> $$0, alr $$1) {
      List<afw> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cno<?> $$4 : $$0) {
         afw $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ap_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            al.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aab.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cno<?>> $$0, alr $$1) {
      List<afw> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cno<?> $$4 : $$0) {
         afw $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aab.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aab.a $$0, alr $$1, List<afw> $$2) {
      $$1.c.b(new aab($$0, $$2, Collections.emptyList(), this.a()));
   }

   public rt b() {
      rt $$0 = new rt();
      this.a().b($$0);
      rz $$1 = new rz();

      for (afw $$2 : this.a) {
         $$1.add(sl.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      rz $$3 = new rz();

      for (afw $$4 : this.b) {
         $$3.add(sl.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(rt $$0, cnp $$1) {
      this.a(aqh.a($$0));
      rz $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      rz $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(rz $$0, Consumer<cno<?>> $$1, cnp $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            afw $$5 = new afw($$4);
            Optional<cno<?>> $$6 = $$2.a($$5);
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

   public void a(alr $$0) {
      $$0.c.b(new aab(aab.a.a, this.a, this.b, this.a()));
   }
}
