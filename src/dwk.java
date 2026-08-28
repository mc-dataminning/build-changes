import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwk<T extends dwa> implements dwj<T> {
   private final dwc<T> a;
   private final dwf<T> b;

   public dwk(dwc<T> $$0, dwf<T> $$1) {
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
   public <U extends T> void a(dwh<T, U> $$0, axk<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(evk $$0, Consumer<T> $$1) {
      this.b.b($$0, axk.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dwh<T, U> $$0, evk $$1, axk<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
