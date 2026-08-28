import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class egf<T extends efv> implements ege<T> {
   private final efx<T> a;
   private final ega<T> b;

   public egf(efx<T> $$0, ega<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return this.a.a($$0);
   }

   @Nullable
   @Override
   public T a(UUID $$0) {
      return this.a.a($$0);
   }

   @Override
   public Iterable<T> a() {
      return this.a.a();
   }

   @Override
   public <U extends T> void a(egc<T, U> $$0, ayi<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ffx $$0, Consumer<T> $$1) {
      this.b.b($$0, ayi.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(egc<T, U> $$0, ffx $$1, ayi<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
