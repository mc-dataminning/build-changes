import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ecb<T extends ebr> implements eca<T> {
   private final ebt<T> a;
   private final ebw<T> b;

   public ecb(ebt<T> $$0, ebw<T> $$1) {
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
   public <U extends T> void a(eby<T, U> $$0, ayg<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fbm $$0, Consumer<T> $$1) {
      this.b.b($$0, ayg.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(eby<T, U> $$0, fbm $$1, ayg<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
