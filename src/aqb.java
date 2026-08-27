import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aqb {
   public static Map<aeo<? extends hs<?>>, aqb.a> a(hm<aey> $$0) {
      return hw.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aqb.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aqb.a a(hs<T> $$0) {
      Map<aep, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hj<T> $$3 = (hj<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (hf<T> $$5 : $$3) {
            if ($$5.f() != hf.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((apy)$$2.getFirst()).b(), $$4);
      });
      return new aqb.a($$1);
   }

   public static <T> void a(aeo<? extends hs<T>> $$0, hs<T> $$1, aqb.a $$2, aqb.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         apy<T> $$5 = apy.a($$0, $$3x);
         List<hf<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aep, IntList> a;

      a(Map<aep, IntList> $$0) {
         this.a = $$0;
      }

      public void a(sh $$0) {
         $$0.a(this.a, sh::a, sh::a);
      }

      public static aqb.a b(sh $$0) {
         return new aqb.a($$0.a(sh::s, sh::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(apy<T> var1, List<hf<T>> var2);
   }
}
