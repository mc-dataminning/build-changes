import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class euu<T> implements eux<T>, euz<T> {
   private final List<euv<T>> a = Lists.newArrayList();
   private final Set<euv<?>> b = new ObjectOpenCustomHashSet(euv.a);

   @Override
   public void a(euw<T> $$0) {
      euv<T> $$1 = new euv<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(euv<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(im $$0, T $$1) {
      return this.b.contains(euv.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public uv b(long $$0, Function<T, String> $$1) {
      ue $$2 = new ue();

      for (euv<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<euv<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> euu<T> a(ue $$0, Function<String, Optional<T>> $$1, czb $$2) {
      euu<T> $$3 = new euu<>();
      euv.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
