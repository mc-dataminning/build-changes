import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class enh<T> implements enk<T>, enm<T> {
   private final List<eni<T>> a = Lists.newArrayList();
   private final Set<eni<?>> b = new ObjectOpenCustomHashSet(eni.a);

   @Override
   public void a(enj<T> $$0) {
      eni<T> $$1 = new eni<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eni<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.b.contains(eni.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tk b(long $$0, Function<T, String> $$1) {
      st $$2 = new st();

      for (eni<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eni<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> enh<T> a(st $$0, Function<String, Optional<T>> $$1, csv $$2) {
      enh<T> $$3 = new enh<>();
      eni.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
