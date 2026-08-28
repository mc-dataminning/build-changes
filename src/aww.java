import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aww {
   public static Map<akp<? extends jz<?>>, aww.a> a(jt<akz> $$0) {
      return kd.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((aww.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aww.a a(jz<T> $$0) {
      Map<akq, IntList> $$1 = new HashMap<>();
      $$0.j().forEach($$2 -> {
         jq<T> $$3 = (jq<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (jm<T> $$5 : $$3) {
            if ($$5.f() != jm.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awt)$$2.getFirst()).b(), $$4);
      });
      return new aww.a($$1);
   }

   static <T> void a(akp<? extends jz<T>> $$0, jz<T> $$1, aww.a $$2, aww.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awt<T> $$5 = awt.a($$0, $$3x);
         List<jm<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akq, IntList> a;

      a(Map<akq, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vv $$0) {
         $$0.a(this.a, vv::a, vv::a);
      }

      public static aww.a b(vv $$0) {
         return new aww.a($$0.a(vv::q, vv::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jz<T> $$0) {
         if (this.a() != 0) {
            Map<awt<T>, List<jm<T>>> $$1 = new HashMap<>(this.a());
            aww.a($$0.d(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awt<T> var1, List<jm<T>> var2);
   }
}
