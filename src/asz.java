import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class asz {
   public static Map<ahf<? extends it<?>>, asz.a> a(io<ahp> $$0) {
      return ix.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((asz.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> asz.a a(it<T> $$0) {
      Map<ahg, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         il<T> $$3 = (il<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ih<T> $$5 : $$3) {
            if ($$5.f() != ih.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((asw)$$2.getFirst()).b(), $$4);
      });
      return new asz.a($$1);
   }

   public static <T> void a(ahf<? extends it<T>> $$0, it<T> $$1, asz.a $$2, asz.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         asw<T> $$5 = asw.a($$0, $$3x);
         List<ih<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<ahg, IntList> a;

      a(Map<ahg, IntList> $$0) {
         this.a = $$0;
      }

      public void a(ui $$0) {
         $$0.a(this.a, ui::a, ui::a);
      }

      public static asz.a b(ui $$0) {
         return new asz.a($$0.a(ui::t, ui::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(asw<T> var1, List<ih<T>> var2);
   }
}
