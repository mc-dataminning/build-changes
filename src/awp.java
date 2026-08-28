import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class awp {
   public static Map<akj<? extends jw<?>>, awp.a> a(jq<akt> $$0) {
      return ka.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> ((awp.a)$$0x.getSecond()).a() > 0)
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> awp.a a(jw<T> $$0) {
      Map<akk, IntList> $$1 = new HashMap<>();
      $$0.j().forEach($$2 -> {
         jn<T> $$3 = (jn<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (jj<T> $$5 : $$3) {
            if ($$5.f() != jj.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((awm)$$2.getFirst()).b(), $$4);
      });
      return new awp.a($$1);
   }

   static <T> void a(akj<? extends jw<T>> $$0, jw<T> $$1, awp.a $$2, awp.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         awm<T> $$5 = awm.a($$0, $$3x);
         List<jj<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<akk, IntList> a;

      a(Map<akk, IntList> $$0) {
         this.a = $$0;
      }

      public void a(vr $$0) {
         $$0.a(this.a, vr::a, vr::a);
      }

      public static awp.a b(vr $$0) {
         return new awp.a($$0.a(vr::q, vr::a));
      }

      public int a() {
         return this.a.size();
      }

      public <T> void a(jw<T> $$0) {
         if (this.a() != 0) {
            Map<awm<T>, List<jj<T>>> $$1 = new HashMap<>(this.a());
            awp.a($$0.d(), $$0, this, $$1::put);
            $$0.a($$1);
         }
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(awm<T> var1, List<jj<T>> var2);
   }
}
