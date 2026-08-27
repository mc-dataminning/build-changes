import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class avg {
   public static Map<ajg<? extends iy<?>>, avg.a> a(is<ajq> $$0) {
      return jc.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((avg.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> avg.a a(iy<T> $$0) {
      Map<ajh, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ip<T> $$3 = (ip<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (il<T> $$5 : $$3) {
            if ($$5.f() != il.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((avd)$$2.getFirst()).b(), $$4);
      });
      return new avg.a($$1);
   }

   static <T> void a(ajg<? extends iy<T>> $$0, iy<T> $$1, avg.a $$2, avg.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         avd<T> $$5 = avd.a($$0, $$3x);
         List<il<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<ajh, IntList> a;

      a(Map<ajh, IntList> $$0) {
         this.a = $$0;
      }

      public void a(uu $$0) {
         $$0.a(this.a, uu::a, uu::a);
      }

      public static avg.a b(uu $$0) {
         return new avg.a($$0.a(uu::q, uu::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(iy<T> $$0) {
         if (this.a() != 0) {
            Map<avd<T>, List<il<T>>> $$1 = new HashMap<>(this.a());
            avg.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(avd<T> var1, List<il<T>> var2);
   }
}
