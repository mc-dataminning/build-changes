import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axr {
   public static Map<alc<? extends kf<?>>, axr.a> a(jz<alm> $$0) {
      return kj.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axr.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axr.a a(kf<T> $$0) {
      Map<ald, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (js<T> $$4 : $$2) {
            if ($$4.f() != js.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new axr.a($$1);
   }

   static <T> axq.c<T> a(kf<T> $$0, axr.a $$1) {
      alc<? extends kf<T>> $$2 = $$0.g();
      Map<axp<T>, List<js<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axp<T> $$5 = axp.a($$2, $$3x);
         List<js<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axq.c<>($$2, $$3);
   }

   public static final class a {
      public static final axr.a a = new axr.a(Map.of());
      final Map<ald, IntList> b;

      a(Map<ald, IntList> $$0) {
         this.b = $$0;
      }

      public void a(vr $$0) {
         $$0.a(this.b, vr::a, vr::a);
      }

      public static axr.a b(vr $$0) {
         return new axr.a($$0.a(vr::q, vr::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> axq.c<T> a(kf<T> $$0) {
         return axr.a($$0, this);
      }
   }
}
