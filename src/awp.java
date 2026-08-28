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

public class awp extends awn {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private final awp.a f;
   @VisibleForTesting
   protected final Set<alc<dcl<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<alc<dcl<?>>> d = Sets.newIdentityHashSet();

   public awp(awp.a $$0) {
      this.f = $$0;
   }

   public void a(alc<dcl<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(alc<dcl<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(alc<dcl<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(alc<dcl<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(alc<dcl<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<dcq<?>> $$0, aro $$1) {
      List<aed.a> $$2 = new ArrayList<>();

      for (dcq<?> $$3 : $$0) {
         alc<dcl<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().al_()) {
            this.a($$4);
            this.e($$4);
            this.f.displaysForRecipe($$4, $$2x -> $$2.add(new aed.a($$2x, $$3.b().i(), true)));
            ap.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aed($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<dcq<?>> $$0, aro $$1) {
      List<ddt> $$2 = Lists.newArrayList();

      for (dcq<?> $$3 : $$0) {
         alc<dcl<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.f.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aee($$2));
      }

      return $$2.size();
   }

   public tw b() {
      tw $$0 = new tw();
      this.a().b($$0);
      uc $$1 = new uc();

      for (alc<dcl<?>> $$2 : this.c) {
         $$1.add(ur.a($$2.a().toString()));
      }

      $$0.a("recipes", $$1);
      uc $$3 = new uc();

      for (alc<dcl<?>> $$4 : this.d) {
         $$3.add(ur.a($$4.a().toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(tw $$0, Predicate<alc<dcl<?>>> $$1) {
      this.a(awo.a($$0));
      uc $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uc $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::e, $$1);
   }

   private void a(uc $$0, Consumer<alc<dcl<?>>> $$1, Predicate<alc<dcl<?>>> $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            alc<dcl<?>> $$5 = alc.a(me.br, ald.a($$4));
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

   public void a(aro $$0) {
      $$0.f.b(new aef(this.a()));
      List<aed.a> $$1 = new ArrayList<>(this.c.size());

      for (alc<dcl<?>> $$2 : this.c) {
         this.f.displaysForRecipe($$2, $$2x -> $$1.add(new aed.a($$2x, false, this.d.contains($$2))));
      }

      $$0.f.b(new aed($$1, true));
   }

   public void a(awp $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.a);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(alc<dcl<?>> var1, Consumer<dds> var2);
   }
}
