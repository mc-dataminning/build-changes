import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dpg<T extends dow> implements dpf<T> {
   private final doy<T> a;
   private final dpb<T> b;

   public dpg(doy<T> $$0, dpb<T> $$1) {
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
   public <U extends T> void a(dpd<T, U> $$0, auu<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(enn $$0, Consumer<T> $$1) {
      this.b.b($$0, auu.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dpd<T, U> $$0, enn $$1, auu<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
