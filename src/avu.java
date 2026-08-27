import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class avu {
   public static Map<ajs<? extends iy<?>>, avu.a> a(is<akc> $$0) {
      return jc.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((avu.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> avu.a a(iy<T> $$0) {
      Map<ajt, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ip<T> $$3 = (ip<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (il<T> $$5 : $$3) {
            if ($$5.f() != il.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((avr)$$2.getFirst()).b(), $$4);
      });
      return new avu.a($$1);
   }

   static <T> void a(ajs<? extends iy<T>> $$0, iy<T> $$1, avu.a $$2, avu.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         avr<T> $$5 = avr.a($$0, $$3x);
         List<il<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<ajt, IntList> a;

      a(Map<ajt, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vg $$0) {
         $$0.a(this.a, vg::a, vg::a);
      }

      public static avu.a b(vg $$0) {
         return new avu.a($$0.a(vg::q, vg::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(iy<T> $$0) {
         if (this.a() != 0) {
            Map<avr<T>, List<il<T>>> $$1 = new HashMap<>(this.a());
            avu.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(avr<T> var1, List<il<T>> var2);
   }
}
