import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axs {
   public static Map<alh<? extends kd<?>>, axs.a> a(jx<alr> $$0) {
      return kh.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axs.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axs.a a(kd<T> $$0) {
      Map<ali, IntList> $$1 = new HashMap<>();
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
      return new axs.a($$1);
   }

   static <T> axr.b<T> a(kd<T> $$0, axs.a $$1) {
      alh<? extends kd<T>> $$2 = $$0.g();
      Map<axq<T>, List<jq<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axq<T> $$5 = axq.a($$2, $$3x);
         List<jq<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axr.b<>($$2, $$3);
   }

   public static final class a {
      public static final axs.a a = new axs.a(Map.of());
      final Map<ali, IntList> b;

      a(Map<ali, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wf $$0) {
         $$0.a(this.b, wf::a, wf::a);
      }

      public static axs.a b(wf $$0) {
         return new axs.a($$0.a(wf::q, wf::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public <T> axr.b<T> a(kd<T> $$0) {
         return axs.a($$0, this);
      }
   }
}
