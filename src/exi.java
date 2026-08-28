import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exi<T> implements exl<T>, exn<T> {
   private final List<exj<T>> a = Lists.newArrayList();
   private final Set<exj<?>> b = new ObjectOpenCustomHashSet(exj.a);

   @Override
   public void a(exk<T> $$0) {
      exj<T> $$1 = new exj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.b.contains(exj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vp b(long $$0, Function<T, String> $$1) {
      uy $$2 = new uy();

      for (exj<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exi<T> a(uy $$0, Function<String, Optional<T>> $$1, dbh $$2) {
      exi<T> $$3 = new exi<>();
      exj.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
