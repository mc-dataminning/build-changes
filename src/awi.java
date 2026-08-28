import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class awi extends awg {
   public static final String c = "recipeBook";
   private static final Logger d = LogUtils.getLogger();

   public int a(Collection<czv<?>> $$0, arh $$1) {
      List<alb> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (czv<?> $$4 : $$0) {
         alb $$5 = $$4.a();
         if (!this.a.contains($$5) && !$$4.b().ar_()) {
            this.a($$5);
            this.d($$5);
            $$2.add($$5);
            an.g.a($$1, $$4);
            $$3++;
         }
      }

      if ($$2.size() > 0) {
         this.a(aek.a.b, $$1, $$2);
      }

      return $$3;
   }

   public int b(Collection<czv<?>> $$0, arh $$1) {
      List<alb> $$2 = Lists.newArrayList();
      int $$3 = 0;

      for (czv<?> $$4 : $$0) {
         alb $$5 = $$4.a();
         if (this.a.contains($$5)) {
            this.c($$5);
            $$2.add($$5);
            $$3++;
         }
      }

      this.a(aek.a.c, $$1, $$2);
      return $$3;
   }

   private void a(aek.a $$0, arh $$1, List<alb> $$2) {
      $$1.c.b(new aek($$0, $$2, Collections.emptyList(), this.a()));
   }

   public uf b() {
      uf $$0 = new uf();
      this.a().b($$0);
      ul $$1 = new ul();

      for (alb $$2 : this.a) {
         $$1.add(va.a($$2.toString()));
      }

      $$0.a("recipes", $$1);
      ul $$3 = new ul();

      for (alb $$4 : this.b) {
         $$3.add(va.a($$4.toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(uf $$0, czx $$1) {
      this.a(awh.a($$0));
      ul $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      ul $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::f, $$1);
   }

   private void a(ul $$0, Consumer<czv<?>> $$1, czx $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            alb $$5 = alb.a($$4);
            Optional<czv<?>> $$6 = $$2.a($$5);
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

   public void a(arh $$0) {
      $$0.c.b(new aek(aek.a.a, this.a, this.b, this.a()));
   }
}
