import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ary {
   public static Map<agh<? extends io<?>>, ary.a> a(ij<agr> $$0) {
      return is.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((ary.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> ary.a a(io<T> $$0) {
      Map<agi, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ig<T> $$3 = (ig<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ib<T> $$5 : $$3) {
            if ($$5.f() != ib.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((arv)$$2.getFirst()).b(), $$4);
      });
      return new ary.a($$1);
   }

   public static <T> void a(agh<? extends io<T>> $$0, io<T> $$1, ary.a $$2, ary.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         arv<T> $$5 = arv.a($$0, $$3x);
         List<ib<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<agi, IntList> a;

      a(Map<agi, IntList> $$0) {
         this.a = $$0;
      }

      public void a(tu $$0) {
         $$0.a(this.a, tu::a, tu::a);
      }

      public static ary.a b(tu $$0) {
         return new ary.a($$0.a(tu::t, tu::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(arv<T> var1, List<ib<T>> var2);
   }
}
