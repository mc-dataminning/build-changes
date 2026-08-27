import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class ety<T> implements eub<T>, eud<T> {
   private final List<etz<T>> a = Lists.newArrayList();
   private final Set<etz<?>> b = new ObjectOpenCustomHashSet(etz.a);

   @Override
   public void a(eua<T> $$0) {
      etz<T> $$1 = new etz<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(etz<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(id $$0, T $$1) {
      return this.b.contains(etz.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public ul b(long $$0, Function<T, String> $$1) {
      tu $$2 = new tu();

      for (etz<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<etz<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ety<T> a(tu $$0, Function<String, Optional<T>> $$1, cyn $$2) {
      ety<T> $$3 = new ety<>();
      etz.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
