import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aqd {
   public static Map<aeq<? extends hr<?>>, aqd.a> a(hl<afa> $$0) {
      return hv.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aqd.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aqd.a a(hr<T> $$0) {
      Map<aer, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hi<T> $$3 = (hi<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (he<T> $$5 : $$3) {
            if ($$5.f() != he.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((aqa)$$2.getFirst()).b(), $$4);
      });
      return new aqd.a($$1);
   }

   public static <T> void a(aeq<? extends hr<T>> $$0, hr<T> $$1, aqd.a $$2, aqd.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         aqa<T> $$5 = aqa.a($$0, $$3x);
         List<he<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aer, IntList> a;

      a(Map<aer, IntList> $$0) {
         this.a = $$0;
      }

      public void a(si $$0) {
         $$0.a(this.a, si::a, si::a);
      }

      public static aqd.a b(si $$0) {
         return new aqd.a($$0.a(si::s, si::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(aqa<T> var1, List<he<T>> var2);
   }
}
