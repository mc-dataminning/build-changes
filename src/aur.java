import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aur {
   public static Map<aix<? extends iv<?>>, aur.a> a(iq<ajh> $$0) {
      return iz.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aur.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aur.a a(iv<T> $$0) {
      Map<aiy, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         in<T> $$3 = (in<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ij<T> $$5 : $$3) {
            if ($$5.f() != ij.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((auo)$$2.getFirst()).b(), $$4);
      });
      return new aur.a($$1);
   }

   public static <T> void a(aix<? extends iv<T>> $$0, iv<T> $$1, aur.a $$2, aur.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         auo<T> $$5 = auo.a($$0, $$3x);
         List<ij<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<aiy, IntList> a;

      a(Map<aiy, IntList> $$0) {
         this.a = $$0;
      }

      public void a(uq $$0) {
         $$0.a(this.a, uq::a, uq::a);
      }

      public static aur.a b(uq $$0) {
         return new aur.a($$0.a(uq::s, uq::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(auo<T> var1, List<ij<T>> var2);
   }
}
