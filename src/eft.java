import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eft<T extends efj> implements efs<T> {
   private final efl<T> a;
   private final efo<T> b;

   public eft(efl<T> $$0, efo<T> $$1) {
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
   public <U extends T> void a(efq<T, U> $$0, axz<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ffl $$0, Consumer<T> $$1) {
      this.b.b($$0, axz.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(efq<T, U> $$0, ffl $$1, axz<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
