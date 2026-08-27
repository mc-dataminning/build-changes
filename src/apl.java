import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class apl extends apj {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cmq<?>> $$0, aku $$1) {
      List<aez> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmq<?> $$4 : $$0) {
         aez $$5 = $$4.a();
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

   public int b(Collection<cmq<?>> $$0, aku $$1) {
      List<aez> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmq<?> $$4 : $$0) {
         aez $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(ze.a.c, $$1, $$2);
      return $$3;
   }

   private void a(ze.a $$0, aku $$1, List<aez> $$2) {
      $$1.c.b(new ze($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qw b() {
      qw $$0 = new qw();
      this.a().b($$0);
      rc $$1 = new rc();

      for (aez $$2 : this.a) {
         $$1.add(ro.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      rc $$3 = new rc();

      for (aez $$4 : this.b) {
         $$3.add(ro.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qw $$0, cmr $$1) {
      this.a(apk.a($$0));
      rc $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      rc $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(rc $$0, Consumer<cmq<?>> $$1, cmr $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aez $$5 = new aez($$4);
            Optional<cmq<?>> $$6 = $$2.a($$5);
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

   public void a(aku $$0) {
      $$0.c.b(new ze(ze.a.a, this.a, this.b, this.a()));
   }
}
