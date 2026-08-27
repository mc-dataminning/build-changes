import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dpn<T extends dpd> implements dpm<T> {
   private final dpf<T> a;
   private final dpi<T> b;

   public dpn(dpf<T> $$0, dpi<T> $$1) {
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
   public <U extends T> void a(dpk<T, U> $$0, auv<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(enu $$0, Consumer<T> $$1) {
      this.b.b($$0, auv.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dpk<T, U> $$0, enu $$1, auv<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
