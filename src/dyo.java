import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dyo<T extends dye> implements dyn<T> {
   private final dyg<T> a;
   private final dyj<T> b;

   public dyo(dyg<T> $$0, dyj<T> $$1) {
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
   public <U extends T> void a(dyl<T, U> $$0, axo<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(exz $$0, Consumer<T> $$1) {
      this.b.b($$0, axo.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dyl<T, U> $$0, exz $$1, axo<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
