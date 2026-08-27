import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public abstract class cv<T extends ar> implements al<T> {
   private final Map<acy, Set<al.a<T>>> a = Maps.newIdentityHashMap();

   @Override
   public final void a(acy $$0, al.a<T> $$1) {
      this.a.computeIfAbsent($$0, $$0x -> Sets.newHashSet()).add($$1);
   }

   @Override
   public final void b(acy $$0, al.a<T> $$1) {
      Set<al.a<T>> $$2 = this.a.get($$0);
      if ($$2 != null) {
         $$2.remove($$1);
         if ($$2.isEmpty()) {
            this.a.remove($$0);
         }
      }
   }

   @Override
   public final void a(acy $$0) {
      this.a.remove($$0);
   }

   protected abstract T b(JsonObject var1, ba var2, be var3);

   public final T b(JsonObject $$0, be $$1) {
      ba $$2 = bo.a($$0, "player", $$1);
      return this.b($$0, $$2, $$1);
   }

   protected void a(aig $$0, Predicate<T> $$1) {
      acy $$2 = $$0.M();
      Set<al.a<T>> $$3 = this.a.get($$2);
      if ($$3 != null && !$$3.isEmpty()) {
         dzk $$4 = bo.b($$0, $$0);
         List<al.a<T>> $$5 = null;

         for (al.a<T> $$6 : $$3) {
            T $$7 = $$6.a();
            if ($$1.test($$7) && $$7.b().a($$4)) {
               if ($$5 == null) {
                  $$5 = Lists.newArrayList();
               }

               $$5.add($$6);
            }
         }

         if ($$5 != null) {
            for (al.a<T> $$8 : $$5) {
               $$8.a($$2);
            }
         }
      }
   }
}
