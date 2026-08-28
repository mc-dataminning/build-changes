import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axt {
   public static Map<alf<? extends js<?>>, axt.a> a(jm<alp> $$0) {
      return jw.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axt.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axt.a a(js<T> $$0) {
      Map<alg, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jf<T> $$4 : $$2) {
            if ($$4.f() != jf.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new axt.a($$1);
   }

   static <T> axs.c<T> a(js<T> $$0, axt.a $$1) {
      alf<? extends js<T>> $$2 = $$0.g();
      Map<axr<T>, List<jf<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axr<T> $$5 = axr.a($$2, $$3x);
         List<jf<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axs.c<>($$2, $$3);
   }

   public static final class a {
      public static final axt.a a = new axt.a(Map.of());
      final Map<alg, IntList> b;

      a(Map<alg, IntList> $$0) {
         this.b = $$0;
      }

      public void a(vu $$0) {
         $$0.a(this.b, vu::a, vu::a);
      }

      public static axt.a b(vu $$0) {
         return new axt.a($$0.a(vu::q, vu::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> axs.c<T> a(js<T> $$0) {
         return axt.a($$0, this);
      }
   }
}
