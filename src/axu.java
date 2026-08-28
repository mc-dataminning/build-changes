import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axu {
   public static Map<ali<? extends kd<?>>, axu.a> a(jx<als> $$0) {
      return kh.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axu.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axu.a a(kd<T> $$0) {
      Map<alj, IntList> $$1 = new HashMap<>();
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
      return new axu.a($$1);
   }

   static <T> axt.b<T> a(kd<T> $$0, axu.a $$1) {
      ali<? extends kd<T>> $$2 = $$0.g();
      Map<axs<T>, List<jq<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axs<T> $$5 = axs.a($$2, $$3x);
         List<jq<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axt.b<>($$2, $$3);
   }

   public static final class a {
      public static final axu.a a = new axu.a(Map.of());
      final Map<alj, IntList> b;

      a(Map<alj, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wg $$0) {
         $$0.a(this.b, wg::a, wg::a);
      }

      public static axu.a b(wg $$0) {
         return new axu.a($$0.a(wg::q, wg::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public <T> axt.b<T> a(kd<T> $$0) {
         return axu.a($$0, this);
      }
   }
}
