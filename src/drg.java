import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class drg<T extends dqw> implements drf<T> {
   private final dqy<T> a;
   private final drb<T> b;

   public drg(dqy<T> $$0, drb<T> $$1) {
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
   public <U extends T> void a(drd<T, U> $$0, avj<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(epo $$0, Consumer<T> $$1) {
      this.b.b($$0, avj.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(drd<T, U> $$0, epo $$1, avj<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
