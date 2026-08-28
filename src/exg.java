import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exg<T> implements exj<T>, exl<T> {
   private final List<exh<T>> a = Lists.newArrayList();
   private final Set<exh<?>> b = new ObjectOpenCustomHashSet(exh.a);

   @Override
   public void a(exi<T> $$0) {
      exh<T> $$1 = new exh<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exh<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.b.contains(exh.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vp b(long $$0, Function<T, String> $$1) {
      uy $$2 = new uy();

      for (exh<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exh<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exg<T> a(uy $$0, Function<String, Optional<T>> $$1, dbf $$2) {
      exg<T> $$3 = new exg<>();
      exh.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
