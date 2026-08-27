import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aww {
   public static Map<aks<? extends jn<?>>, aww.a> a(jh<alc> $$0) {
      return jr.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((aww.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aww.a a(jn<T> $$0) {
      Map<akt, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         je<T> $$3 = (je<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ja<T> $$5 : $$3) {
            if ($$5.f() != ja.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awt)$$2.getFirst()).b(), $$4);
      });
      return new aww.a($$1);
   }

   static <T> void a(aks<? extends jn<T>> $$0, jn<T> $$1, aww.a $$2, aww.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awt<T> $$5 = awt.a($$0, $$3x);
         List<ja<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akt, IntList> a;

      a(Map<akt, IntList> $$0) {
         this.a = $$0;
      }

      public void a(we $$0) {
         $$0.a(this.a, we::a, we::a);
      }

      public static aww.a b(we $$0) {
         return new aww.a($$0.a(we::q, we::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jn<T> $$0) {
         if (this.a() != 0) {
            Map<awt<T>, List<ja<T>>> $$1 = new HashMap<>(this.a());
            aww.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awt<T> var1, List<ja<T>> var2);
   }
}
