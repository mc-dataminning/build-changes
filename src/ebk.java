import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ebk<T extends eba> implements ebj<T> {
   private final ebc<T> a;
   private final ebf<T> b;

   public ebk(ebc<T> $$0, ebf<T> $$1) {
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
   public <U extends T> void a(ebh<T, U> $$0, axl<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fav $$0, Consumer<T> $$1) {
      this.b.b($$0, axl.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(ebh<T, U> $$0, fav $$1, axl<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
