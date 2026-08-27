import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ano {
   public static Map<acp<? extends hr<?>>, ano.a> a(hl<acz> $$0) {
      return hv.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((ano.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> ano.a a(hr<T> $$0) {
      Map<acq, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         hi<T> $$3 = (hi<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (he<T> $$5 : $$3) {
            if ($$5.f() != he.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((anl)$$2.getFirst()).b(), $$4);
      });
      return new ano.a($$1);
   }

   public static <T> void a(acp<? extends hr<T>> $$0, hr<T> $$1, ano.a $$2, ano.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         anl<T> $$5 = anl.a($$0, $$3x);
         List<he<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<acq, IntList> a;

      a(Map<acq, IntList> $$0) {
         this.a = $$0;
      }

      public void a(sf $$0) {
         $$0.a(this.a, sf::a, sf::a);
      }

      public static ano.a b(sf $$0) {
         return new ano.a($$0.a(sf::t, sf::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(anl<T> var1, List<he<T>> var2);
   }
}
