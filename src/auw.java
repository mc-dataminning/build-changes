import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class auw {
   public static Map<ajb<? extends ix<?>>, auw.a> a(is<ajl> $$0) {
      return jb.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((auw.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> auw.a a(ix<T> $$0) {
      Map<ajc, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ip<T> $$3 = (ip<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (il<T> $$5 : $$3) {
            if ($$5.f() != il.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((aut)$$2.getFirst()).b(), $$4);
      });
      return new auw.a($$1);
   }

   static <T> void a(ajb<? extends ix<T>> $$0, ix<T> $$1, auw.a $$2, auw.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         aut<T> $$5 = aut.a($$0, $$3x);
         List<il<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<ajc, IntList> a;

      a(Map<ajc, IntList> $$0) {
         this.a = $$0;
      }

      public void a(us $$0) {
         $$0.a(this.a, us::a, us::a);
      }

      public static auw.a b(us $$0) {
         return new auw.a($$0.a(us::q, us::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(ix<T> $$0) {
         if (this.a() != 0) {
            Map<aut<T>, List<il<T>>> $$1 = new HashMap<>(this.a());
            auw.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(aut<T> var1, List<il<T>> var2);
   }
}
