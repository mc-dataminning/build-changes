import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axn {
   public static Map<ald<? extends kb<?>>, axn.a> a(jv<aln> $$0) {
      return kf.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axn.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axn.a a(kb<T> $$0) {
      Map<ale, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jo<T> $$4 : $$2) {
            if ($$4.f() != jo.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new axn.a($$1);
   }

   static <T> axm.b<T> a(kb<T> $$0, axn.a $$1) {
      ald<? extends kb<T>> $$2 = $$0.g();
      Map<axl<T>, List<jo<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axl<T> $$5 = axl.a($$2, $$3x);
         List<jo<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axm.b<>($$2, $$3);
   }

   public static final class a {
      public static final axn.a a = new axn.a(Map.of());
      final Map<ale, IntList> b;

      a(Map<ale, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wb $$0) {
         $$0.a(this.b, wb::a, wb::a);
      }

      public static axn.a b(wb $$0) {
         return new axn.a($$0.a(wb::q, wb::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public <T> axm.b<T> a(kb<T> $$0) {
         return axn.a($$0, this);
      }
   }
}
