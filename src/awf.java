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

public class awf extends awd {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private final awf.a f;
   @VisibleForTesting
   protected final Set<akt<dbv<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<akt<dbv<?>>> d = Sets.newIdentityHashSet();

   public awf(awf.a $$0) {
      this.f = $$0;
   }

   public void a(akt<dbv<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(akt<dbv<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(akt<dbv<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(akt<dbv<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(akt<dbv<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<dca<?>> $$0, are $$1) {
      List<adx.a> $$2 = new ArrayList<>();

      for (dca<?> $$3 : $$0) {
         akt<dbv<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().ap_()) {
            this.a($$4);
            this.e($$4);
            this.f.displaysForRecipe($$4, $$2x -> $$2.add(new adx.a($$2x, $$3.b().i(), true)));
            ap.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new adx($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<dca<?>> $$0, are $$1) {
      List<ddd> $$2 = Lists.newArrayList();

      for (dca<?> $$3 : $$0) {
         akt<dbv<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.f.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new ady($$2));
      }

      return $$2.size();
   }

   public tq b() {
      tq $$0 = new tq();
      this.a().b($$0);
      tw $$1 = new tw();

      for (akt<dbv<?>> $$2 : this.c) {
         $$1.add(ul.a($$2.a().toString()));
      }

      $$0.a("recipes", $$1);
      tw $$3 = new tw();

      for (akt<dbv<?>> $$4 : this.d) {
         $$3.add(ul.a($$4.a().toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(tq $$0, Predicate<akt<dbv<?>>> $$1) {
      this.a(awe.a($$0));
      tw $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      tw $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::e, $$1);
   }

   private void a(tw $$0, Consumer<akt<dbv<?>>> $$1, Predicate<akt<dbv<?>>> $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            akt<dbv<?>> $$5 = akt.a(mc.bm, aku.a($$4));
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

   public void a(are $$0) {
      $$0.f.b(new adz(this.a()));
      List<adx.a> $$1 = new ArrayList<>(this.c.size());

      for (akt<dbv<?>> $$2 : this.c) {
         this.f.displaysForRecipe($$2, $$2x -> $$1.add(new adx.a($$2x, false, this.d.contains($$2))));
      }

      $$0.f.b(new adx($$1, true));
   }

   public void a(awf $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.a);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(akt<dbv<?>> var1, Consumer<ddc> var2);
   }
}
