import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eyl<T> implements eyo<T>, eyq<T> {
   private final List<eym<T>> a = Lists.newArrayList();
   private final Set<eym<?>> b = new ObjectOpenCustomHashSet(eym.a);

   @Override
   public void a(eyn<T> $$0) {
      eym<T> $$1 = new eym<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eym<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jd $$0, T $$1) {
      return this.b.contains(eym.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public ux b(long $$0, Function<T, String> $$1) {
      ug $$2 = new ug();

      for (eym<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eym<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eyl<T> a(ug $$0, Function<String, Optional<T>> $$1, dcb $$2) {
      eyl<T> $$3 = new eyl<>();
      eym.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
