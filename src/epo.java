import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class epo<T> implements epr<T>, ept<T> {
   private final List<epp<T>> a = Lists.newArrayList();
   private final Set<epp<?>> b = new ObjectOpenCustomHashSet(epp.a);

   @Override
   public void a(epq<T> $$0) {
      epp<T> $$1 = new epp<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(epp<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hz $$0, T $$1) {
      return this.b.contains(epp.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tt b(long $$0, Function<T, String> $$1) {
      tc $$2 = new tc();

      for (epp<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<epp<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> epo<T> a(tc $$0, Function<String, Optional<T>> $$1, cuy $$2) {
      epo<T> $$3 = new epo<>();
      epp.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
