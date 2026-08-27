import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class ele<T> implements elh<T>, elj<T> {
   private final List<elf<T>> a = Lists.newArrayList();
   private final Set<elf<?>> b = new ObjectOpenCustomHashSet(elf.a);

   @Override
   public void a(elg<T> $$0) {
      elf<T> $$1 = new elf<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(elf<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.b.contains(elf.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public sw b(long $$0, Function<T, String> $$1) {
      sf $$2 = new sf();

      for (elf<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<elf<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ele<T> a(sf $$0, Function<String, Optional<T>> $$1, crh $$2) {
      ele<T> $$3 = new ele<>();
      elf.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
