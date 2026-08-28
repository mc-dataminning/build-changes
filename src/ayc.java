import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ayc {
   public static Map<alo<? extends kd<?>>, ayc.a> a(jx<aly> $$0) {
      return kh.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((ayc.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> ayc.a a(kd<T> $$0) {
      Map<alp, IntList> $$1 = new HashMap<>();
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
      return new ayc.a($$1);
   }

   static <T> ayb.c<T> a(kd<T> $$0, ayc.a $$1) {
      alo<? extends kd<T>> $$2 = $$0.g();
      Map<aya<T>, List<jq<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         aya<T> $$5 = aya.a($$2, $$3x);
         List<jq<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new ayb.c<>($$2, $$3);
   }

   public static final class a {
      public static final ayc.a a = new ayc.a(Map.of());
      final Map<alp, IntList> b;

      a(Map<alp, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wh $$0) {
         $$0.a(this.b, wh::a, wh::a);
      }

      public static ayc.a b(wh $$0) {
         return new ayc.a($$0.a(wh::q, wh::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> ayb.c<T> a(kd<T> $$0) {
         return ayc.a($$0, this);
      }
   }
}
