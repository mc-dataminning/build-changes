import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class aym {
   public static Map<aly<? extends kd<?>>, aym.a> a(jx<ami> $$0) {
      return kh.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((aym.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> aym.a a(kd<T> $$0) {
      Map<alz, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jq<T> $$4 : $$2) {
            if ($$4.f() != jq.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new aym.a($$1);
   }

   static <T> ayl.c<T> a(kd<T> $$0, aym.a $$1) {
      aly<? extends kd<T>> $$2 = $$0.g();
      Map<ayk<T>, List<jq<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         ayk<T> $$5 = ayk.a($$2, $$3x);
         List<jq<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new ayl.c<>($$2, $$3);
   }

   public static final class a {
      public static final aym.a a = new aym.a(Map.of());
      final Map<alz, IntList> b;

      a(Map<alz, IntList> $$0) {
         this.b = $$0;
      }

      public void a(ws $$0) {
         $$0.a(this.b, ws::a, ws::a);
      }

      public static aym.a b(ws $$0) {
         return new aym.a($$0.a(ws::q, ws::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> ayl.c<T> a(kd<T> $$0) {
         return aym.a($$0, this);
      }
   }
}
