import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dje<T extends diu> implements djd<T> {
   private final diw<T> a;
   private final diz<T> b;

   public dje(diw<T> $$0, diz<T> $$1) {
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
   public <U extends T> void a(djb<T, U> $$0, aqq<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ehc $$0, Consumer<T> $$1) {
      this.b.b($$0, aqq.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(djb<T, U> $$0, ehc $$1, aqq<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
