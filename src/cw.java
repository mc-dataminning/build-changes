import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public abstract class cw<T extends cw.a> implements ao<T> {
   private final Map<afe, Set<ao.a<T>>> a = Maps.newIdentityHashMap();

   @Override
   public final void a(afe $$0, ao.a<T> $$1) {
      this.a.computeIfAbsent($$0, $$0x -> Sets.newHashSet()).add($$1);
   }

   @Override
   public final void b(afe $$0, ao.a<T> $$1) {
      Set<ao.a<T>> $$2 = this.a.get($$0);
      if ($$2 != null) {
         $$2.remove($$1);
         if ($$2.isEmpty()) {
            this.a.remove($$0);
         }
      }
   }

   @Override
   public final void a(afe $$0) {
      this.a.remove($$0);
   }

   protected abstract T b(JsonObject var1, Optional<bc> var2, bg var3);

   public final T b(JsonObject $$0, bg $$1) {
      Optional<bc> $$2 = bq.a($$0, "player", $$1);
      return this.b($$0, $$2, $$1);
   }

   protected void a(akr $$0, Predicate<T> $$1) {
      afe $$2 = $$0.O();
      Set<ao.a<T>> $$3 = this.a.get($$2);
      if ($$3 != null && !$$3.isEmpty()) {
         ecq $$4 = bq.b($$0, $$0);
         List<ao.a<T>> $$5 = null;

         for (ao.a<T> $$6 : $$3) {
            T $$7 = $$6.a();
            if ($$1.test($$7)) {
               Optional<bc> $$8 = $$7.b();
               if ($$8.isEmpty() || $$8.get().a($$4)) {
                  if ($$5 == null) {
                     $$5 = Lists.newArrayList();
                  }

                  $$5.add($$6);
               }
            }
         }

         if ($$5 != null) {
            for (ao.a<T> $$9 : $$5) {
               $$9.a($$2);
            }
         }
      }
   }

   public interface a extends ap {
      Optional<bc> b();
   }
}
