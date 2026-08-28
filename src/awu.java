import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class awu extends aws {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private static final Codec<List<alh<dep<?>>>> f = dep.b.listOf();
   private final awu.a g;
   @VisibleForTesting
   protected final Set<alh<dep<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<alh<dep<?>>> d = Sets.newIdentityHashSet();

   public awu(awu.a $$0) {
      this.g = $$0;
   }

   public void a(alh<dep<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(alh<dep<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(alh<dep<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(alh<dep<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(alh<dep<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<deu<?>> $$0, art $$1) {
      List<aei.a> $$2 = new ArrayList<>();

      for (deu<?> $$3 : $$0) {
         alh<dep<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().aq_()) {
            this.a($$4);
            this.e($$4);
            this.g.displaysForRecipe($$4, $$2x -> $$2.add(new aei.a($$2x, $$3.b().i(), true)));
            aq.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aei($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<deu<?>> $$0, art $$1) {
      List<dfx> $$2 = Lists.newArrayList();

      for (deu<?> $$3 : $$0) {
         alh<dep<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.g.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aej($$2));
      }

      return $$2.size();
   }

   public tz b() {
      tz $$0 = new tz();
      this.a().b($$0);
      uf $$1 = new uf();

      for (alh<dep<?>> $$2 : this.c) {
         $$1.add(uw.a($$2.a().toString()));
      }

      $$0.a("recipes", $$1);
      uf $$3 = new uf();

      for (alh<dep<?>> $$4 : this.d) {
         $$3.add(uw.a($$4.a().toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(tz $$0, Predicate<alh<dep<?>>> $$1) {
      this.a(awt.a($$0));
      List<alh<dep<?>>> $$2 = $$0.<List<alh<dep<?>>>>a("recipes", f).orElse(List.of());
      this.a($$2, this::a, $$1);
      List<alh<dep<?>>> $$3 = $$0.<List<alh<dep<?>>>>a("toBeDisplayed", f).orElse(List.of());
      this.a($$3, this::e, $$1);
   }

   private void a(List<alh<dep<?>>> $$0, Consumer<alh<dep<?>>> $$1, Predicate<alh<dep<?>>> $$2) {
      for (alh<dep<?>> $$3 : $$0) {
         if (!$$2.test($$3)) {
            e.error("Tried to load unrecognized recipe: {} removed now.", $$3);
         } else {
            $$1.accept($$3);
         }
      }
   }

   public void a(art $$0) {
      $$0.f.b(new aek(this.a()));
      List<aei.a> $$1 = new ArrayList<>(this.c.size());

      for (alh<dep<?>> $$2 : this.c) {
         this.g.displaysForRecipe($$2, $$2x -> $$1.add(new aei.a($$2x, false, this.d.contains($$2))));
      }

      $$0.f.b(new aei($$1, true));
   }

   public void a(awu $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.a);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(alh<dep<?>> var1, Consumer<dfw> var2);
   }
}
