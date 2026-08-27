import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djf<T extends div> implements dje<T> {
   private final dix<T> a;
   private final dja<T> b;

   public djf(dix<T> $$0, dja<T> $$1) {
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
   public <U extends T> void a(djc<T, U> $$0, aqj<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ehd $$0, Consumer<T> $$1) {
      this.b.b($$0, aqj.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(djc<T, U> $$0, ehd $$1, aqj<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
