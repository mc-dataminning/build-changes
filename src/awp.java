import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class awp {
   public static Map<akm<? extends jk<?>>, awp.a> a(je<akw> $$0) {
      return jo.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((awp.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> awp.a a(jk<T> $$0) {
      Map<akn, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         jb<T> $$3 = (jb<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ix<T> $$5 : $$3) {
            if ($$5.f() != ix.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awm)$$2.getFirst()).b(), $$4);
      });
      return new awp.a($$1);
   }

   static <T> void a(akm<? extends jk<T>> $$0, jk<T> $$1, awp.a $$2, awp.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awm<T> $$5 = awm.a($$0, $$3x);
         List<ix<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akn, IntList> a;

      a(Map<akn, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vx $$0) {
         $$0.a(this.a, vx::a, vx::a);
      }

      public static awp.a b(vx $$0) {
         return new awp.a($$0.a(vx::q, vx::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jk<T> $$0) {
         if (this.a() != 0) {
            Map<awm<T>, List<ix<T>>> $$1 = new HashMap<>(this.a());
            awp.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awm<T> var1, List<ix<T>> var2);
   }
}
