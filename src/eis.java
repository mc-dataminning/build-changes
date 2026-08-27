import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eis<T> implements eiv<T>, eix<T> {
   private final List<eit<T>> a = Lists.newArrayList();
   private final Set<eit<?>> b = new ObjectOpenCustomHashSet(eit.a);

   @Override
   public void a(eiu<T> $$0) {
      eit<T> $$1 = new eit<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eit<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.b.contains(eit.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rn b(long $$0, Function<T, String> $$1) {
      ra $$2 = new ra();

      for (eit<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eit<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eis<T> a(ra $$0, Function<String, Optional<T>> $$1, cox $$2) {
      eis<T> $$3 = new eis<>();
      eit.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
