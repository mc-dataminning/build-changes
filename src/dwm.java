import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwm<T extends dwc> implements dwl<T> {
   private final dwe<T> a;
   private final dwh<T> b;

   public dwm(dwe<T> $$0, dwh<T> $$1) {
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
   public <U extends T> void a(dwj<T, U> $$0, axl<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(evm $$0, Consumer<T> $$1) {
      this.b.b($$0, axl.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dwj<T, U> $$0, evm $$1, axl<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
