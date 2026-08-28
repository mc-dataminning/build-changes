import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class axk extends axi {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private final axk.a f;
   @VisibleForTesting
   protected final Set<aly<dce<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<aly<dce<?>>> d = Sets.newIdentityHashSet();

   public axk(axk.a $$0) {
      this.f = $$0;
   }

   public void a(aly<dce<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(aly<dce<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(aly<dce<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(aly<dce<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(aly<dce<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<dcj<?>> $$0, asi $$1) {
      List<afe.a> $$2 = new ArrayList<>();

      for (dcj<?> $$3 : $$0) {
         aly<dce<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().aq_()) {
            this.a($$4);
            this.e($$4);
            this.f.displaysForRecipe($$4, $$2x -> $$2.add(new afe.a($$2x, $$3.b().i(), true)));
            ao.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new afe($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<dcj<?>> $$0, asi $$1) {
      List<ddl> $$2 = Lists.newArrayList();

      for (dcj<?> $$3 : $$0) {
         aly<dce<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.f.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aff($$2));
      }

      return $$2.size();
   }

   public ux b() {
      ux $$0 = new ux();
      this.a().b($$0);
      vd $$1 = new vd();

      for (aly<dce<?>> $$2 : this.c) {
         $$1.add(vs.a($$2.a().toString()));
      }

      $$0.a("recipes", $$1);
      vd $$3 = new vd();

      for (aly<dce<?>> $$4 : this.d) {
         $$3.add(vs.a($$4.a().toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ux $$0, Predicate<aly<dce<?>>> $$1) {
      this.a(axj.a($$0));
      vd $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      vd $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::e, $$1);
   }

   private void a(vd $$0, Consumer<aly<dce<?>>> $$1, Predicate<aly<dce<?>>> $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            aly<dce<?>> $$5 = aly.a(mb.bk, alz.a($$4));
            if (!$$2.test($$5)) {
               e.error("Tried to load unrecognized recipe: {} removed now.", $$5);
            } else {
               $$1.accept($$5);
            }
         } catch (aa var7) {
            e.error("Tried to load improperly formatted recipe: {} removed now.", $$4);
         }
      }
   }

   public void a(asi $$0) {
      $$0.f.b(new afg(this.a()));
      List<afe.a> $$1 = new ArrayList<>(this.c.size());

      for (aly<dce<?>> $$2 : this.c) {
         this.f.displaysForRecipe($$2, $$2x -> $$1.add(new afe.a($$2x, false, this.d.contains($$2))));
      }

      $$0.f.b(new afe($$1, true));
   }

   public void a(axk $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.a);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(aly<dce<?>> var1, Consumer<ddk> var2);
   }
}
