import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class ein<T> implements eiq<T>, eis<T> {
   private final List<eio<T>> a = Lists.newArrayList();
   private final Set<eio<?>> b = new ObjectOpenCustomHashSet(eio.a);

   @Override
   public void a(eip<T> $$0) {
      eio<T> $$1 = new eio<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eio<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.b.contains(eio.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rk b(long $$0, Function<T, String> $$1) {
      qx $$2 = new qx();

      for (eio<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eio<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ein<T> a(qx $$0, Function<String, Optional<T>> $$1, cos $$2) {
      ein<T> $$3 = new ein<>();
      eio.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
