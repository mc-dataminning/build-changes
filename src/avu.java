import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class avu extends avs {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<czc<?>> $$0, aqu $$1) {
      List<akt> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (czc<?> $$4 : $$0) {
         akt $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().an_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            an.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aeg.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<czc<?>> $$0, aqu $$1) {
      List<akt> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (czc<?> $$4 : $$0) {
         akt $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aeg.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aeg.a $$0, aqu $$1, List<akt> $$2) {
      $$1.d.b(new aeg($$0, $$2, Collections.emptyList(), this.a()));
   }

   public uk b() {
      uk $$0 = new uk();
      this.a().b($$0);
      uq $$1 = new uq();

      for (akt $$2 : this.a) {
         $$1.add(vf.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      uq $$3 = new uq();

      for (akt $$4 : this.b) {
         $$3.add(vf.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(uk $$0, czd $$1) {
      this.a(avt.a($$0));
      uq $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uq $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(uq $$0, Consumer<czc<?>> $$1, czd $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akt $$5 = new akt($$4);
            Optional<czc<?>> $$6 = $$2.a($$5);
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
      $$0.d.b(new aeg(aeg.a.a, this.a, this.b, this.a()));
   }
}
