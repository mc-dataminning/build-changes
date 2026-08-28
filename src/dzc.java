import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzc<T extends dys> implements dzb<T> {
   private final dyu<T> a;
   private final dyx<T> b;

   public dzc(dyu<T> $$0, dyx<T> $$1) {
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
   public <U extends T> void a(dyz<T, U> $$0, axp<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eyn $$0, Consumer<T> $$1) {
      this.b.b($$0, axp.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dyz<T, U> $$0, eyn $$1, axp<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
