import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzx<T extends dzn> implements dzw<T> {
   private final dzp<T> a;
   private final dzs<T> b;

   public dzx(dzp<T> $$0, dzs<T> $$1) {
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
   public <U extends T> void a(dzu<T, U> $$0, axw<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ezi $$0, Consumer<T> $$1) {
      this.b.b($$0, axw.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dzu<T, U> $$0, ezi $$1, axw<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
