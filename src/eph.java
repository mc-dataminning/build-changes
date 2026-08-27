import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eph<T> implements epk<T>, epm<T> {
   private final List<epi<T>> a = Lists.newArrayList();
   private final Set<epi<?>> b = new ObjectOpenCustomHashSet(epi.a);

   @Override
   public void a(epj<T> $$0) {
      epi<T> $$1 = new epi<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(epi<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hz $$0, T $$1) {
      return this.b.contains(epi.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tt b(long $$0, Function<T, String> $$1) {
      tc $$2 = new tc();

      for (epi<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<epi<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eph<T> a(tc $$0, Function<String, Optional<T>> $$1, cuu $$2) {
      eph<T> $$3 = new eph<>();
      epi.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
