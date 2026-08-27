import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public abstract class cv<T extends cv.a> implements ap<T> {
   private final Map<aho, Set<ap.a<T>>> a = Maps.newIdentityHashMap();

   @Override
   public final void a(aho $$0, ap.a<T> $$1) {
      this.a.computeIfAbsent($$0, $$0x -> Sets.newHashSet()).add($$1);
   }

   @Override
   public final void b(aho $$0, ap.a<T> $$1) {
      Set<ap.a<T>> $$2 = this.a.get($$0);
      if ($$2 != null) {
         $$2.remove($$1);
         if ($$2.isEmpty()) {
            this.a.remove($$0);
         }
      }
   }

   @Override
   public final void a(aho $$0) {
      this.a.remove($$0);
   }

   protected void a(ane $$0, Predicate<T> $$1) {
      aho $$2 = $$0.Q();
      Set<ap.a<T>> $$3 = this.a.get($$2);
      if ($$3 != null && !$$3.isEmpty()) {
         egw $$4 = bp.b($$0, $$0);
         List<ap.a<T>> $$5 = null;

         for (ap.a<T> $$6 : $$3) {
            T $$7 = $$6.a();
            if ($$1.test($$7)) {
               Optional<bb> $$8 = $$7.a();
               if ($$8.isEmpty() || $$8.get().a($$4)) {
                  if ($$5 == null) {
                     $$5 = Lists.newArrayList();
                  }

                  $$5.add($$6);
               }
            }
         }

         if ($$5 != null) {
            for (ap.a<T> $$9 : $$5) {
               $$9.a($$2);
            }
         }
      }
   }

   public interface a extends aq {
      @Override
      default void a(bc $$0) {
         $$0.a(this.a(), ".player");
      }

      Optional<bb> a();
   }
}
