import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axv {
   public static Map<alk<? extends kd<?>>, axv.a> a(jx<alu> $$0) {
      return kh.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axv.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axv.a a(kd<T> $$0) {
      Map<all, IntList> $$1 = new HashMap<>();
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
      return new axv.a($$1);
   }

   static <T> axu.b<T> a(kd<T> $$0, axv.a $$1) {
      alk<? extends kd<T>> $$2 = $$0.g();
      Map<axt<T>, List<jq<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axt<T> $$5 = axt.a($$2, $$3x);
         List<jq<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axu.b<>($$2, $$3);
   }

   public static final class a {
      public static final axv.a a = new axv.a(Map.of());
      final Map<all, IntList> b;

      a(Map<all, IntList> $$0) {
         this.b = $$0;
      }

      public void a(wi $$0) {
         $$0.a(this.b, wi::a, wi::a);
      }

      public static axv.a b(wi $$0) {
         return new axv.a($$0.a(wi::q, wi::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public <T> axu.b<T> a(kd<T> $$0) {
         return axv.a($$0, this);
      }
   }
}
