import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axx {
   public static Map<alj<? extends jt<?>>, axx.a> a(jn<alt> $$0) {
      return jx.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axx.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axx.a a(jt<T> $$0) {
      Map<alk, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jg<T> $$4 : $$2) {
            if ($$4.f() != jg.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new axx.a($$1);
   }

   static <T> axw.c<T> a(jt<T> $$0, axx.a $$1) {
      alj<? extends jt<T>> $$2 = $$0.g();
      Map<axv<T>, List<jg<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axv<T> $$5 = axv.a($$2, $$3x);
         List<jg<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axw.c<>($$2, $$3);
   }

   public static final class a {
      public static final axx.a a = new axx.a(Map.of());
      final Map<alk, IntList> b;

      a(Map<alk, IntList> $$0) {
         this.b = $$0;
      }

      public void a(vy $$0) {
         $$0.a(this.b, vy::a, vy::a);
      }

      public static axx.a b(vy $$0) {
         return new axx.a($$0.a(vy::q, vy::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> axw.c<T> a(jt<T> $$0) {
         return axx.a($$0, this);
      }
   }
}
