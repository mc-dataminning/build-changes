import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class awj {
   public static Map<akg<? extends jj<?>>, awj.a> a(jd<akq> $$0) {
      return jn.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((awj.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> awj.a a(jj<T> $$0) {
      Map<akh, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ja<T> $$3 = (ja<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (iw<T> $$5 : $$3) {
            if ($$5.f() != iw.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awg)$$2.getFirst()).b(), $$4);
      });
      return new awj.a($$1);
   }

   static <T> void a(akg<? extends jj<T>> $$0, jj<T> $$1, awj.a $$2, awj.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awg<T> $$5 = awg.a($$0, $$3x);
         List<iw<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akh, IntList> a;

      a(Map<akh, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vu $$0) {
         $$0.a(this.a, vu::a, vu::a);
      }

      public static awj.a b(vu $$0) {
         return new awj.a($$0.a(vu::q, vu::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jj<T> $$0) {
         if (this.a() != 0) {
            Map<awg<T>, List<iw<T>>> $$1 = new HashMap<>(this.a());
            awj.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awg<T> var1, List<iw<T>> var2);
   }
}
