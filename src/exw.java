import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exw<T> implements exz<T>, eyb<T> {
   private final List<exx<T>> a = Lists.newArrayList();
   private final Set<exx<?>> b = new ObjectOpenCustomHashSet(exx.a);

   @Override
   public void a(exy<T> $$0) {
      exx<T> $$1 = new exx<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exx<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.b.contains(exx.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public uu b(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();

      for (exx<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exx<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exw<T> a(ud $$0, Function<String, Optional<T>> $$1, dbn $$2) {
      exw<T> $$3 = new exw<>();
      exx.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
