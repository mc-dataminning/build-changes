import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eni<T> implements enl<T>, enn<T> {
   private final List<enj<T>> a = Lists.newArrayList();
   private final Set<enj<?>> b = new ObjectOpenCustomHashSet(enj.a);

   @Override
   public void a(enk<T> $$0) {
      enj<T> $$1 = new enj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(enj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.b.contains(enj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tk b(long $$0, Function<T, String> $$1) {
      st $$2 = new st();

      for (enj<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<enj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eni<T> a(st $$0, Function<String, Optional<T>> $$1, csw $$2) {
      eni<T> $$3 = new eni<>();
      enj.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
