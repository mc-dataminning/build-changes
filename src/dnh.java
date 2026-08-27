import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dnh<T extends dmx> implements dng<T> {
   private final dmz<T> a;
   private final dnc<T> b;

   public dnh(dmz<T> $$0, dnc<T> $$1) {
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
   public <U extends T> void a(dne<T, U> $$0, atb<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eln $$0, Consumer<T> $$1) {
      this.b.b($$0, atb.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dne<T, U> $$0, eln $$1, atb<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
