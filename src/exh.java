import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exh<T> implements exk<T>, exm<T> {
   private final List<exi<T>> a = Lists.newArrayList();
   private final Set<exi<?>> b = new ObjectOpenCustomHashSet(exi.a);

   @Override
   public void a(exj<T> $$0) {
      exi<T> $$1 = new exi<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exi<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.b.contains(exi.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vp b(long $$0, Function<T, String> $$1) {
      uy $$2 = new uy();

      for (exi<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exi<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exh<T> a(uy $$0, Function<String, Optional<T>> $$1, dbg $$2) {
      exh<T> $$3 = new exh<>();
      exi.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
