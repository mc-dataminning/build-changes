import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aqn {
   public static Map<aey<? extends hq<?>>, aqn.a> a(hl<afi> $$0) {
      return hu.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aqn.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aqn.a a(hq<T> $$0) {
      Map<aez, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hi<T> $$3 = (hi<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (he<T> $$5 : $$3) {
            if ($$5.f() != he.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((aqk)$$2.getFirst()).b(), $$4);
      });
      return new aqn.a($$1);
   }

   public static <T> void a(aey<? extends hq<T>> $$0, hq<T> $$1, aqn.a $$2, aqn.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         aqk<T> $$5 = aqk.a($$0, $$3x);
         List<he<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aez, IntList> a;

      a(Map<aez, IntList> $$0) {
         this.a = $$0;
      }

      public void a(so $$0) {
         $$0.a(this.a, so::a, so::a);
      }

      public static aqn.a b(so $$0) {
         return new aqn.a($$0.a(so::t, so::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(aqk<T> var1, List<he<T>> var2);
   }
}
