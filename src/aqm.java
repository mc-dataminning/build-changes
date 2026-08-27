import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aqm {
   public static Map<aex<? extends ht<?>>, aqm.a> a(hn<afh> $$0) {
      return hx.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aqm.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aqm.a a(ht<T> $$0) {
      Map<aey, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hk<T> $$3 = (hk<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (hg<T> $$5 : $$3) {
            if ($$5.f() != hg.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((aqj)$$2.getFirst()).b(), $$4);
      });
      return new aqm.a($$1);
   }

   public static <T> void a(aex<? extends ht<T>> $$0, ht<T> $$1, aqm.a $$2, aqm.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         aqj<T> $$5 = aqj.a($$0, $$3x);
         List<hg<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aey, IntList> a;

      a(Map<aey, IntList> $$0) {
         this.a = $$0;
      }

      public void a(sq $$0) {
         $$0.a(this.a, sq::a, sq::a);
      }

      public static aqm.a b(sq $$0) {
         return new aqm.a($$0.a(sq::s, sq::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(aqj<T> var1, List<hg<T>> var2);
   }
}
