import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dqi<T extends dpy> implements dqh<T> {
   private final dqa<T> a;
   private final dqd<T> b;

   public dqi(dqa<T> $$0, dqd<T> $$1) {
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
   public <U extends T> void a(dqf<T, U> $$0, ava<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eoq $$0, Consumer<T> $$1) {
      this.b.b($$0, ava.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dqf<T, U> $$0, eoq $$1, ava<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
