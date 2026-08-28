import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwh<T extends dvx> implements dwg<T> {
   private final dvz<T> a;
   private final dwc<T> b;

   public dwh(dvz<T> $$0, dwc<T> $$1) {
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
   public <U extends T> void a(dwe<T, U> $$0, axh<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(evh $$0, Consumer<T> $$1) {
      this.b.b($$0, axh.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dwe<T, U> $$0, evh $$1, axh<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
