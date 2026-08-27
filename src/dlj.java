import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dlj<T extends dkz> implements dli<T> {
   private final dlb<T> a;
   private final dle<T> b;

   public dlj(dlb<T> $$0, dle<T> $$1) {
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
   public <U extends T> void a(dlg<T, U> $$0, asb<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ejp $$0, Consumer<T> $$1) {
      this.b.b($$0, asb.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dlg<T, U> $$0, ejp $$1, asb<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
