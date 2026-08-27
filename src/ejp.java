import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class ejp<T> implements ejs<T>, eju<T> {
   private final List<ejq<T>> a = Lists.newArrayList();
   private final Set<ejq<?>> b = new ObjectOpenCustomHashSet(ejq.a);

   @Override
   public void a(ejr<T> $$0) {
      ejq<T> $$1 = new ejq<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ejq<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.b.contains(ejq.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public sn b(long $$0, Function<T, String> $$1) {
      rz $$2 = new rz();

      for (ejq<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<ejq<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ejp<T> a(rz $$0, Function<String, Optional<T>> $$1, cqg $$2) {
      ejp<T> $$3 = new ejp<>();
      ejq.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
