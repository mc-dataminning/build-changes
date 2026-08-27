import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eml<T> implements emo<T>, emq<T> {
   private final List<emm<T>> a = Lists.newArrayList();
   private final Set<emm<?>> b = new ObjectOpenCustomHashSet(emm.a);

   @Override
   public void a(emn<T> $$0) {
      emm<T> $$1 = new emm<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(emm<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hv $$0, T $$1) {
      return this.b.contains(emm.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tg b(long $$0, Function<T, String> $$1) {
      sp $$2 = new sp();

      for (emm<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<emm<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eml<T> a(sp $$0, Function<String, Optional<T>> $$1, csf $$2) {
      eml<T> $$3 = new eml<>();
      emm.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
