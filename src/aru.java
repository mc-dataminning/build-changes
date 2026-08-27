import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aru {
   public static Map<agf<? extends io<?>>, aru.a> a(ij<agp> $$0) {
      return is.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aru.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aru.a a(io<T> $$0) {
      Map<agg, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ig<T> $$3 = (ig<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ib<T> $$5 : $$3) {
            if ($$5.f() != ib.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((arr)$$2.getFirst()).b(), $$4);
      });
      return new aru.a($$1);
   }

   public static <T> void a(agf<? extends io<T>> $$0, io<T> $$1, aru.a $$2, aru.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         arr<T> $$5 = arr.a($$0, $$3x);
         List<ib<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<agg, IntList> a;

      a(Map<agg, IntList> $$0) {
         this.a = $$0;
      }

      public void a(tu $$0) {
         $$0.a(this.a, tu::a, tu::a);
      }

      public static aru.a b(tu $$0) {
         return new aru.a($$0.a(tu::t, tu::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(arr<T> var1, List<ib<T>> var2);
   }
}
