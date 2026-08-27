import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class asj {
   public static Map<ags<? extends ir<?>>, asj.a> a(im<ahc> $$0) {
      return iv.b($$0)
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((asj.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> asj.a a(ir<T> $$0) {
      Map<agt, IntList> $$1 = new HashMap<>();
      $$0.i().forEach($$2 -> {
         ij<T> $$3 = (ij<T>)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for (ie<T> $$5 : $$3) {
            if ($$5.f() != ie.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((asg)$$2.getFirst()).b(), $$4);
      });
      return new asj.a($$1);
   }

   public static <T> void a(ags<? extends ir<T>> $$0, ir<T> $$1, asj.a $$2, asj.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         asg<T> $$5 = asg.a($$0, $$3x);
         List<ie<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<agt, IntList> a;

      a(Map<agt, IntList> $$0) {
         this.a = $$0;
      }

      public void a(ue $$0) {
         $$0.a(this.a, ue::a, ue::a);
      }

      public static asj.a b(ue $$0) {
         return new asj.a($$0.a(ue::t, ue::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(asg<T> var1, List<ie<T>> var2);
   }
}
