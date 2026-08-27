import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class awo {
   public static Map<akl<? extends jk<?>>, awo.a> a(je<akv> $$0) {
      return jo.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((awo.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> awo.a a(jk<T> $$0) {
      Map<akm, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         jb<T> $$3 = (jb<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ix<T> $$5 : $$3) {
            if ($$5.f() != ix.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awl)$$2.getFirst()).b(), $$4);
      });
      return new awo.a($$1);
   }

   static <T> void a(akl<? extends jk<T>> $$0, jk<T> $$1, awo.a $$2, awo.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awl<T> $$5 = awl.a($$0, $$3x);
         List<ix<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akm, IntList> a;

      a(Map<akm, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vx $$0) {
         $$0.a(this.a, vx::a, vx::a);
      }

      public static awo.a b(vx $$0) {
         return new awo.a($$0.a(vx::q, vx::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jk<T> $$0) {
         if (this.a() != 0) {
            Map<awl<T>, List<ix<T>>> $$1 = new HashMap<>(this.a());
            awo.a($$0.c(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awl<T> var1, List<ix<T>> var2);
   }
}
