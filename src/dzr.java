import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzr<T extends dzh> implements dzq<T> {
   private final dzj<T> a;
   private final dzm<T> b;

   public dzr(dzj<T> $$0, dzm<T> $$1) {
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
   public <U extends T> void a(dzo<T, U> $$0, axv<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ezc $$0, Consumer<T> $$1) {
      this.b.b($$0, axv.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dzo<T, U> $$0, ezc $$1, axv<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
