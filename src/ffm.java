import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class ffm<T> implements ffp<T>, ffr<T> {
   private final List<ffn<T>> a = Lists.newArrayList();
   private final Set<ffn<?>> b = new ObjectOpenCustomHashSet(ffn.a);

   @Override
   public void a(ffo<T> $$0) {
      ffn<T> $$1 = new ffn<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ffn<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.b.contains(ffn.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<ffn<T>> a(long $$0) {
      return this.a;
   }

   public List<ffn<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ffm<T> a(List<ffn<T>> $$0) {
      ffm<T> $$1 = new ffm<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
