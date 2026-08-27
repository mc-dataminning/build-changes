import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aql {
   public static Map<aew<? extends ht<?>>, aql.a> a(hn<afg> $$0) {
      return hx.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aql.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aql.a a(ht<T> $$0) {
      Map<aex, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hk<T> $$3 = (hk<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (hg<T> $$5 : $$3) {
            if ($$5.f() != hg.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((aqi)$$2.getFirst()).b(), $$4);
      });
      return new aql.a($$1);
   }

   public static <T> void a(aew<? extends ht<T>> $$0, ht<T> $$1, aql.a $$2, aql.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         aqi<T> $$5 = aqi.a($$0, $$3x);
         List<hg<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aex, IntList> a;

      a(Map<aex, IntList> $$0) {
         this.a = $$0;
      }

      public void a(so $$0) {
         $$0.a(this.a, so::a, so::a);
      }

      public static aql.a b(so $$0) {
         return new aql.a($$0.a(so::s, so::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(aqi<T> var1, List<hg<T>> var2);
   }
}
