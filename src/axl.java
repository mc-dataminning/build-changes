import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axl {
   public static Map<alb<? extends ka<?>>, axl.a> a(ju<all> $$0) {
      return ke.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axl.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axl.a a(ka<T> $$0) {
      Map<alc, IntList> $$1 = new HashMap<>();
      $$0.j().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jn<T> $$4 : $$2) {
            if ($$4.f() != jn.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new axl.a($$1);
   }

   static <T> axk.b<T> a(ka<T> $$0, axl.a $$1) {
      alb<? extends ka<T>> $$2 = $$0.d();
      Map<axj<T>, List<jn<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axj<T> $$5 = axj.a($$2, $$3x);
         List<jn<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axk.b<>($$2, $$3);
   }

   public static final class a {
      public static final axl.a a = new axl.a(Map.of());
      final Map<alc, IntList> b;

      a(Map<alc, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wa $$0) {
         $$0.a(this.b, wa::a, wa::a);
      }

      public static axl.a b(wa $$0) {
         return new axl.a($$0.a(wa::q, wa::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public <T> axk.b<T> a(ka<T> $$0) {
         return axl.a($$0, this);
      }
   }
}
