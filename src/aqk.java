import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aqk {
   public static Map<aev<? extends hq<?>>, aqk.a> a(hl<aff> $$0) {
      return hu.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aqk.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aqk.a a(hq<T> $$0) {
      Map<aew, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hi<T> $$3 = (hi<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (he<T> $$5 : $$3) {
            if ($$5.f() != he.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((aqh)$$2.getFirst()).b(), $$4);
      });
      return new aqk.a($$1);
   }

   public static <T> void a(aev<? extends hq<T>> $$0, hq<T> $$1, aqk.a $$2, aqk.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         aqh<T> $$5 = aqh.a($$0, $$3x);
         List<he<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aew, IntList> a;

      a(Map<aew, IntList> $$0) {
         this.a = $$0;
      }

      public void a(so $$0) {
         $$0.a(this.a, so::a, so::a);
      }

      public static aqk.a b(so $$0) {
         return new aqk.a($$0.a(so::s, so::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(aqh<T> var1, List<he<T>> var2);
   }
}
