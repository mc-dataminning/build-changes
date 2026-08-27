import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class apk extends api {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<cmm<?>> $$0, akt $$1) {
      List<aey> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmm<?> $$4 : $$0) {
         aey $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().am_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            al.f.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(zf.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<cmm<?>> $$0, akt $$1) {
      List<aey> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (cmm<?> $$4 : $$0) {
         aey $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(zf.a.c, $$1, $$2);
      return $$3;
   }

   private void a(zf.a $$0, akt $$1, List<aey> $$2) {
      $$1.c.b(new zf($$0, $$2, Collections.emptyList(), this.a()));
   }

   public qy b() {
      qy $$0 = new qy();
      this.a().b($$0);
      re $$1 = new re();

      for (aey $$2 : this.a) {
         $$1.add(rq.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      re $$3 = new re();

      for (aey $$4 : this.b) {
         $$3.add(rq.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(qy $$0, cmn $$1) {
      this.a(apj.a($$0));
      re $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      re $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(re $$0, Consumer<cmm<?>> $$1, cmn $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aey $$5 = new aey($$4);
            Optional<cmm<?>> $$6 = $$2.a($$5);
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

   public void a(akt $$0) {
      $$0.c.b(new zf(zf.a.a, this.a, this.b, this.a()));
   }
}
