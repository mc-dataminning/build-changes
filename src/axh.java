import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axh {
   public static Map<ald<? extends jv<?>>, axh.a> a(jp<aln> $$0) {
      return jz.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((axh.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axh.a a(jv<T> $$0) {
      Map<ale, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         jm<T> $$3 = (jm<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ji<T> $$5 : $$3) {
            if ($$5.f() != ji.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((axe)$$2.getFirst()).b(), $$4);
      });
      return new axh.a($$1);
   }

   static <T> void a(ald<? extends jv<T>> $$0, jv<T> $$1, axh.a $$2, axh.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         axe<T> $$5 = axe.a($$0, $$3x);
         List<ji<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<ale, IntList> a;

      a(Map<ale, IntList> $$0) {
         this.a = $$0;
      }

      public void a(wl $$0) {
         $$0.a(this.a, wl::a, wl::a);
      }

      public static axh.a b(wl $$0) {
         return new axh.a($$0.a(wl::q, wl::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jv<T> $$0) {
         if (this.a() != 0) {
            Map<axe<T>, List<ji<T>>> $$1 = new HashMap<>(this.a());
            axh.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(axe<T> var1, List<ji<T>> var2);
   }
}
