import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eio<T> implements eir<T>, eit<T> {
   private final List<eip<T>> a = Lists.newArrayList();
   private final Set<eip<?>> b = new ObjectOpenCustomHashSet(eip.a);

   @Override
   public void a(eiq<T> $$0) {
      eip<T> $$1 = new eip<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eip<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.b.contains(eip.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rk b(long $$0, Function<T, String> $$1) {
      qx $$2 = new qx();

      for (eip<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eip<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eio<T> a(qx $$0, Function<String, Optional<T>> $$1, cot $$2) {
      eio<T> $$3 = new eio<>();
      eip.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
