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

public class aws extends awq {
   public static final String b = "recipeBook";
   private static final Logger e = LogUtils.getLogger();
   private final aws.a f;
   @VisibleForTesting
   protected final Set<alf<ddu<?>>> c = Sets.newIdentityHashSet();
   @VisibleForTesting
   protected final Set<alf<ddu<?>>> d = Sets.newIdentityHashSet();

   public aws(aws.a $$0) {
      this.f = $$0;
   }

   public void a(alf<ddu<?>> $$0) {
      this.c.add($$0);
   }

   public boolean b(alf<ddu<?>> $$0) {
      return this.c.contains($$0);
   }

   public void c(alf<ddu<?>> $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   public void d(alf<ddu<?>> $$0) {
      this.d.remove($$0);
   }

   private void e(alf<ddu<?>> $$0) {
      this.d.add($$0);
   }

   public int a(Collection<ddz<?>> $$0, arr $$1) {
      List<aeg.a> $$2 = new ArrayList<>();

      for (ddz<?> $$3 : $$0) {
         alf<ddu<?>> $$4 = $$3.a();
         if (!this.c.contains($$4) && !$$3.b().am_()) {
            this.a($$4);
            this.e($$4);
            this.f.displaysForRecipe($$4, $$2x -> $$2.add(new aeg.a($$2x, $$3.b().i(), true)));
            ap.g.a($$1, $$3);
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aeg($$2, false));
      }

      return $$2.size();
   }

   public int b(Collection<ddz<?>> $$0, arr $$1) {
      List<dfc> $$2 = Lists.newArrayList();

      for (ddz<?> $$3 : $$0) {
         alf<ddu<?>> $$4 = $$3.a();
         if (this.c.contains($$4)) {
            this.c($$4);
            this.f.displaysForRecipe($$4, $$1x -> $$2.add($$1x.a()));
         }
      }

      if (!$$2.isEmpty()) {
         $$1.f.b(new aeh($$2));
      }

      return $$2.size();
   }

   public tz b() {
      tz $$0 = new tz();
      this.a().b($$0);
      uf $$1 = new uf();

      for (alf<ddu<?>> $$2 : this.c) {
         $$1.add(uu.a($$2.a().toString()));
      }

      $$0.a("recipes", $$1);
      uf $$3 = new uf();

      for (alf<ddu<?>> $$4 : this.d) {
         $$3.add(uu.a($$4.a().toString()));
      }

      $$0.a("toBeDisplayed", $$3);
      return $$0;
   }

   public void a(tz $$0, Predicate<alf<ddu<?>>> $$1) {
      this.a(awr.a($$0));
      uf $$2 = $$0.c("recipes", 8);
      this.a($$2, this::a, $$1);
      uf $$3 = $$0.c("toBeDisplayed", 8);
      this.a($$3, this::e, $$1);
   }

   private void a(uf $$0, Consumer<alf<ddu<?>>> $$1, Predicate<alf<ddu<?>>> $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         String $$4 = $$0.j($$3);

         try {
            alf<ddu<?>> $$5 = alf.a(mg.bu, alg.a($$4));
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

   public void a(arr $$0) {
      $$0.f.b(new aei(this.a()));
      List<aeg.a> $$1 = new ArrayList<>(this.c.size());

      for (alf<ddu<?>> $$2 : this.c) {
         this.f.displaysForRecipe($$2, $$2x -> $$1.add(new aeg.a($$2x, false, this.d.contains($$2))));
      }

      $$0.f.b(new aeg($$1, true));
   }

   public void a(aws $$0) {
      this.c.clear();
      this.d.clear();
      this.a.a($$0.a);
      this.c.addAll($$0.c);
      this.d.addAll($$0.d);
   }

   @FunctionalInterface
   public interface a {
      void displaysForRecipe(alf<ddu<?>> var1, Consumer<dfb> var2);
   }
}
