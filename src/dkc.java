import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dkc<T extends djs> implements dkb<T> {
   private final dju<T> a;
   private final djx<T> b;

   public dkc(dju<T> $$0, djx<T> $$1) {
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
   public <U extends T> void a(djz<T, U> $$0, arn<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eia $$0, Consumer<T> $$1) {
      this.b.b($$0, arn.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(djz<T, U> $$0, eia $$1, arn<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
