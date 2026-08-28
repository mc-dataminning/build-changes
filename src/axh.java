import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axh {
   public static Map<akt<? extends ke<?>>, axh.a> a(jy<ald> $$0) {
      return ki.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axh.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axh.a a(ke<T> $$0) {
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
      return new axh.a($$1);
   }

   static <T> axg.c<T> a(ke<T> $$0, axh.a $$1) {
      akt<? extends ke<T>> $$2 = $$0.g();
      Map<axf<T>, List<jr<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axf<T> $$5 = axf.a($$2, $$3x);
         List<jr<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axg.c<>($$2, $$3);
   }

   public static final class a {
      public static final axh.a a = new axh.a(Map.of());
      final Map<aku, IntList> b;

      a(Map<aku, IntList> $$0) {
         this.b = $$0;
      }

      public void a(vl $$0) {
         $$0.a(this.b, vl::a, vl::a);
      }

      public static axh.a b(vl $$0) {
         return new axh.a($$0.a(vl::q, vl::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> axg.c<T> a(ke<T> $$0) {
         return axh.a($$0, this);
      }
   }
}
