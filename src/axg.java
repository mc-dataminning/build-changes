import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axg {
   public static Map<akt<? extends ke<?>>, axg.a> a(jy<ald> $$0) {
      return ki.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axg.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axg.a a(ke<T> $$0) {
      Map<aku, IntList> $$1 = new HashMap<>();
      $$0.l().forEach($$2 -> {
         IntList $$3 = new IntArrayList($$2.b());

         for (jr<T> $$4 : $$2) {
            if ($$4.f() != jr.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$4);
            }

            $$3.add($$0.a($$4.a()));
         }

         $$1.put($$2.h().b(), $$3);
      });
      return new axg.a($$1);
   }

   static <T> axf.c<T> a(ke<T> $$0, axg.a $$1) {
      akt<? extends ke<T>> $$2 = $$0.g();
      Map<axe<T>, List<jr<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axe<T> $$5 = axe.a($$2, $$3x);
         List<jr<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axf.c<>($$2, $$3);
   }

   public static final class a {
      public static final axg.a a = new axg.a(Map.of());
      final Map<aku, IntList> b;

      a(Map<aku, IntList> $$0) {
         this.b = $$0;
      }

      public void a(vl $$0) {
         $$0.a(this.b, vl::a, vl::a);
      }

      public static axg.a b(vl $$0) {
         return new axg.a($$0.a(vl::q, vl::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> axf.c<T> a(ke<T> $$0) {
         return axg.a($$0, this);
      }
   }
}
