import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class avw {
   public static Map<aju<? extends ja<?>>, avw.a> a(iu<ake> $$0) {
      return je.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((avw.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> avw.a a(ja<T> $$0) {
      Map<ajv, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ir<T> $$3 = (ir<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (in<T> $$5 : $$3) {
            if ($$5.f() != in.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((avt)$$2.getFirst()).b(), $$4);
      });
      return new avw.a($$1);
   }

   static <T> void a(aju<? extends ja<T>> $$0, ja<T> $$1, avw.a $$2, avw.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         avt<T> $$5 = avt.a($$0, $$3x);
         List<in<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<ajv, IntList> a;

      a(Map<ajv, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vi $$0) {
         $$0.a(this.a, vi::a, vi::a);
      }

      public static avw.a b(vi $$0) {
         return new avw.a($$0.a(vi::q, vi::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(ja<T> $$0) {
         if (this.a() != 0) {
            Map<avt<T>, List<in<T>>> $$1 = new HashMap<>(this.a());
            avw.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(avt<T> var1, List<in<T>> var2);
   }
}
