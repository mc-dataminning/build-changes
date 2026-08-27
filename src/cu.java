import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public abstract class cu<T extends ar> implements al<T> {
   private final Map<aez, Set<al.a<T>>> a = Maps.newIdentityHashMap();

   @Override
   public final void a(aez $$0, al.a<T> $$1) {
      this.a.computeIfAbsent($$0, $$0x -> Sets.newHashSet()).add($$1);
   }

   @Override
   public final void b(aez $$0, al.a<T> $$1) {
      Set<al.a<T>> $$2 = this.a.get($$0);
      if ($$2 != null) {
         $$2.remove($$1);
         if ($$2.isEmpty()) {
            this.a.remove($$0);
         }
      }
   }

   @Override
   public final void a(aez $$0) {
      this.a.remove($$0);
   }

   protected abstract T b(JsonObject var1, Optional<ba> var2, be var3);

   public final T b(JsonObject $$0, be $$1) {
      Optional<ba> $$2 = bo.a($$0, "player", $$1);
      return this.b($$0, $$2, $$1);
   }

   protected void a(akl $$0, Predicate<T> $$1) {
      aez $$2 = $$0.N();
      Set<al.a<T>> $$3 = this.a.get($$2);
      if ($$3 != null && !$$3.isEmpty()) {
         ecg $$4 = bo.b($$0, $$0);
         List<al.a<T>> $$5 = null;

         for (al.a<T> $$6 : $$3) {
            T $$7 = $$6.a();
            if ($$1.test($$7)) {
               Optional<ba> $$8 = $$7.c();
               if ($$8.isEmpty() || $$8.get().a($$4)) {
                  if ($$5 == null) {
                     $$5 = Lists.newArrayList();
                  }

                  $$5.add($$6);
               }
            }
         }

         if ($$5 != null) {
            for (al.a<T> $$9 : $$5) {
               $$9.a($$2);
            }
         }
      }
   }
}
