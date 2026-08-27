import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djk<T extends dja> implements djj<T> {
   private final djc<T> a;
   private final djf<T> b;

   public djk(djc<T> $$0, djf<T> $$1) {
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
   public <U extends T> void a(djh<T, U> $$0, aqn<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ehi $$0, Consumer<T> $$1) {
      this.b.b($$0, aqn.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(djh<T, U> $$0, ehi $$1, aqn<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
