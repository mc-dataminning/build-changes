import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dnq<T extends dng> implements dnp<T> {
   private final dni<T> a;
   private final dnl<T> b;

   public dnq(dni<T> $$0, dnl<T> $$1) {
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
   public <U extends T> void a(dnn<T, U> $$0, atd<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(elx $$0, Consumer<T> $$1) {
      this.b.b($$0, atd.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dnn<T, U> $$0, elx $$1, atd<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
