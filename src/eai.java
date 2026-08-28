import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eai<T extends dzy> implements eah<T> {
   private final eaa<T> a;
   private final ead<T> b;

   public eai(eaa<T> $$0, ead<T> $$1) {
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
   public <U extends T> void a(eaf<T, U> $$0, axy<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ezt $$0, Consumer<T> $$1) {
      this.b.b($$0, axy.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(eaf<T, U> $$0, ezt $$1, axy<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
