import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class efi<T extends eey> implements efh<T> {
   private final efa<T> a;
   private final efd<T> b;

   public efi(efa<T> $$0, efd<T> $$1) {
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
   public <U extends T> void a(eff<T, U> $$0, axx<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fex $$0, Consumer<T> $$1) {
      this.b.b($$0, axx.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(eff<T, U> $$0, fex $$1, axx<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
