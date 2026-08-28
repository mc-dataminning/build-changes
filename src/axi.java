import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axi {
   public static Map<ale<? extends jv<?>>, axi.a> a(jp<alo> $$0) {
      return jz.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((axi.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axi.a a(jv<T> $$0) {
      Map<alf, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         jm<T> $$3 = (jm<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ji<T> $$5 : $$3) {
            if ($$5.f() != ji.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((axf)$$2.getFirst()).b(), $$4);
      });
      return new axi.a($$1);
   }

   static <T> void a(ale<? extends jv<T>> $$0, jv<T> $$1, axi.a $$2, axi.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         axf<T> $$5 = axf.a($$0, $$3x);
         List<ji<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<alf, IntList> a;

      a(Map<alf, IntList> $$0) {
         this.a = $$0;
      }

      public void a(wm $$0) {
         $$0.a(this.a, wm::a, wm::a);
      }

      public static axi.a b(wm $$0) {
         return new axi.a($$0.a(wm::q, wm::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jv<T> $$0) {
         if (this.a() != 0) {
            Map<axf<T>, List<ji<T>>> $$1 = new HashMap<>(this.a());
            axi.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(axf<T> var1, List<ji<T>> var2);
   }
}
