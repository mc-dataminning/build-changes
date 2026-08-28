import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class axv {
   public static Map<alh<? extends js<?>>, axv.a> a(jm<alr> $$0) {
      return jw.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((axv.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> axv.a a(js<T> $$0) {
      Map<ali, IntList> $$1 = new HashMap<>();
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
      return new axv.a($$1);
   }

   static <T> axu.c<T> a(js<T> $$0, axv.a $$1) {
      alh<? extends js<T>> $$2 = $$0.g();
      Map<axt<T>, List<jf<T>>> $$3 = new HashMap<>();
      $$1.b.forEach(($$3x, $$4) -> {
         axt<T> $$5 = axt.a($$2, $$3x);
         List<jf<T>> $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.put($$5, $$6);
      });
      return new axu.c<>($$2, $$3);
   }

   public static final class a {
      public static final axv.a a = new axv.a(Map.of());
      final Map<ali, IntList> b;

      a(Map<ali, IntList> $$0) {
         this.b = $$0;
      }

      public void a(vw $$0) {
         $$0.a(this.b, vw::a, vw::a);
      }

      public static axv.a b(vw $$0) {
         return new axv.a($$0.a(vw::q, vw::a));
      }

      public boolean a() {
         return this.b.isEmpty();
      }

      public int b() {
         return this.b.size();
      }

      public <T> axu.c<T> a(js<T> $$0) {
         return axv.a($$0, this);
      }
   }
}
