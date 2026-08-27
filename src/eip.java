import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eip<T> implements eis<T>, eiu<T> {
   private final List<eiq<T>> a = Lists.newArrayList();
   private final Set<eiq<?>> b = new ObjectOpenCustomHashSet(eiq.a);

   @Override
   public void a(eir<T> $$0) {
      eiq<T> $$1 = new eiq<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eiq<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gv $$0, T $$1) {
      return this.b.contains(eiq.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rl b(long $$0, Function<T, String> $$1) {
      qy $$2 = new qy();

      for (eiq<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eiq<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eip<T> a(qy $$0, Function<String, Optional<T>> $$1, cor $$2) {
      eip<T> $$3 = new eip<>();
      eiq.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
