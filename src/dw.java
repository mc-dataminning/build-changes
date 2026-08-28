import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public abstract class dw<T extends dw.a> implements aq<T> {
   private final Map<alm, Set<aq.a<T>>> a = Maps.newIdentityHashMap();

   @Override
   public final void a(alm $$0, aq.a<T> $$1) {
      this.a.computeIfAbsent($$0, $$0x -> Sets.newHashSet()).add($$1);
   }

   @Override
   public final void b(alm $$0, aq.a<T> $$1) {
      Set<aq.a<T>> $$2 = this.a.get($$0);
      if ($$2 != null) {
         $$2.remove($$1);
         if ($$2.isEmpty()) {
            this.a.remove($$0);
         }
      }
   }

   @Override
   public final void a(alm $$0) {
      this.a.remove($$0);
   }

   protected void a(ark $$0, Predicate<T> $$1) {
      alm $$2 = $$0.T();
      Set<aq.a<T>> $$3 = this.a.get($$2);
      if ($$3 != null && !$$3.isEmpty()) {
         etl $$4 = bv.b($$0, $$0);
         List<aq.a<T>> $$5 = null;

         for (aq.a<T> $$6 : $$3) {
            T $$7 = $$6.a();
            if ($$1.test($$7)) {
               Optional<bg> $$8 = $$7.a();
               if ($$8.isEmpty() || $$8.get().a($$4)) {
                  if ($$5 == null) {
                     $$5 = Lists.newArrayList();
                  }

                  $$5.add($$6);
               }
            }
         }

         if ($$5 != null) {
            for (aq.a<T> $$9 : $$5) {
               $$9.a($$2);
            }
         }
      }
   }

   public interface a extends ar {
      @Override
      default void a(bh $$0) {
         $$0.a(this.a(), ".player");
      }

      Optional<bg> a();
   }
}
