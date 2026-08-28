import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eci<T extends eby> implements ech<T> {
   private final eca<T> a;
   private final ecd<T> b;

   public eci(eca<T> $$0, ecd<T> $$1) {
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
   public <U extends T> void a(ecf<T, U> $$0, ayq<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fbt $$0, Consumer<T> $$1) {
      this.b.b($$0, ayq.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(ecf<T, U> $$0, fbt $$1, ayq<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
