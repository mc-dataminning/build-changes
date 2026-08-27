import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class asc {
   public static Map<agl<? extends is<?>>, asc.a> a(in<agv> $$0) {
      return iw.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((asc.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> asc.a a(is<T> $$0) {
      Map<agm, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ik<T> $$3 = (ik<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ig<T> $$5 : $$3) {
            if ($$5.f() != ig.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((arz)$$2.getFirst()).b(), $$4);
      });
      return new asc.a($$1);
   }

   public static <T> void a(agl<? extends is<T>> $$0, is<T> $$1, asc.a $$2, asc.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         arz<T> $$5 = arz.a($$0, $$3x);
         List<ig<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<agm, IntList> a;

      a(Map<agm, IntList> $$0) {
         this.a = $$0;
      }

      public void a(ty $$0) {
         $$0.a(this.a, ty::a, ty::a);
      }

      public static asc.a b(ty $$0) {
         return new asc.a($$0.a(ty::t, ty::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(arz<T> var1, List<ig<T>> var2);
   }
}
