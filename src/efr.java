import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class efr<T> implements efu<T>, efw<T> {
   private final List<efs<T>> a = Lists.newArrayList();
   private final Set<efs<?>> b = new ObjectOpenCustomHashSet(efs.a);

   @Override
   public void a(eft<T> $$0) {
      efs<T> $$1 = new efs<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(efs<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.b.contains(efs.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rk b(long $$0, Function<T, String> $$1) {
      qx $$2 = new qx();

      for (efs<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<efs<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> efr<T> a(qx $$0, Function<String, Optional<T>> $$1, clt $$2) {
      efr<T> $$3 = new efr<>();
      efs.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
