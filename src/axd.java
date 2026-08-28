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

public class axd extends axb {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private static final Codec<List<alq<dfb<?>>>> f = dfb.b.listOf();
   private final axd.a g;
   @VisibleForTesting
   protected final Set<alq<dfb<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<alq<dfb<?>>> d = Sets.newIdentityHashSet();

   public axd(axd.a $$0) {
      this.g = $$0;
   }

   public void a(alq<dfb<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(alq<dfb<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(alq<dfb<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(alq<dfb<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(alq<dfb<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<dfg<?>> $$0, asc $$1) {
      List<aer.a> $$2 = new ArrayList<>();

      for (dfg<?> $$3 : $$0) {
         alq<dfb<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().am_()) {
            this.a($$4);
            this.e($$4);
            this.g.displaysForRecipe($$4, $$2x -> $$2.add(new aer.a($$2x, $$3.b().i(), true)));
            aq.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aer($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<dfg<?>> $$0, asc $$1) {
      List<dgj> $$2 = Lists.newArrayList();

      for (dfg<?> $$3 : $$0) {
         alq<dfb<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.g.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aes($$2));
      }

      return $$2.size();
   }

   public ua b() {
      ua $$0 = new ua();
      this.a().b($$0);
      ug $$1 = new ug();

      for (alq<dfb<?>> $$2 : this.c) {
         $$1.add(uy.a($$2.a().toString()));
      }

      $$0.a("recipes", $$1);
      ug $$3 = new ug();

      for (alq<dfb<?>> $$4 : this.d) {
         $$3.add(uy.a($$4.a().toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(ua $$0, Predicate<alq<dfb<?>>> $$1) {
      this.a(axc.a($$0));
      List<alq<dfb<?>>> $$2 = $$0.<List<alq<dfb<?>>>>a("recipes", f).orElse(List.of());
      this.a($$2, this::a, $$1);
      List<alq<dfb<?>>> $$3 = $$0.<List<alq<dfb<?>>>>a("toBeDisplayed", f).orElse(List.of());
      this.a($$3, this::e, $$1);
   }

   private void a(List<alq<dfb<?>>> $$0, Consumer<alq<dfb<?>>> $$1, Predicate<alq<dfb<?>>> $$2) {
      for (alq<dfb<?>> $$3 : $$0) {
         if (!$$2.test($$3)) {
            e.error("Tried to load unrecognized recipe: {} removed now.", $$3);
         } else {
            $$1.accept($$3);
         }
      }
   }

   public void a(asc $$0) {
      $$0.f.b(new aet(this.a()));
      List<aer.a> $$1 = new ArrayList<>(this.c.size());

      for (alq<dfb<?>> $$2 : this.c) {
         this.g.displaysForRecipe($$2, $$2x -> $$1.add(new aer.a($$2x, false, this.d.contains($$2))));
      }

      $$0.f.b(new aer($$1, true));
   }

   public void a(axd $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.a);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(alq<dfb<?>> var1, Consumer<dgi> var2);
   }
}
