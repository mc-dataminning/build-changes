import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class awg {
   public static Map<ake<? extends ji<?>>, awg.a> a(jc<ako> $$0) {
      return jm.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((awg.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> awg.a a(ji<T> $$0) {
      Map<akf, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         iz<T> $$3 = (iz<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (iv<T> $$5 : $$3) {
            if ($$5.f() != iv.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awd)$$2.getFirst()).b(), $$4);
      });
      return new awg.a($$1);
   }

   static <T> void a(ake<? extends ji<T>> $$0, ji<T> $$1, awg.a $$2, awg.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awd<T> $$5 = awd.a($$0, $$3x);
         List<iv<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akf, IntList> a;

      a(Map<akf, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vs $$0) {
         $$0.a(this.a, vs::a, vs::a);
      }

      public static awg.a b(vs $$0) {
         return new awg.a($$0.a(vs::q, vs::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(ji<T> $$0) {
         if (this.a() != 0) {
            Map<awd<T>, List<iv<T>>> $$1 = new HashMap<>(this.a());
            awg.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awd<T> var1, List<iv<T>> var2);
   }
}
