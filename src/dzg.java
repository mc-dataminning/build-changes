import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzg<T extends dyw> implements dzf<T> {
   private final dyy<T> a;
   private final dzb<T> b;

   public dzg(dyy<T> $$0, dzb<T> $$1) {
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
   public <U extends T> void a(dzd<T, U> $$0, axr<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eyr $$0, Consumer<T> $$1) {
      this.b.b($$0, axr.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dzd<T, U> $$0, eyr $$1, axr<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
