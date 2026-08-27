import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dja<T extends diq> implements diz<T> {
   private final dis<T> a;
   private final div<T> b;

   public dja(dis<T> $$0, div<T> $$1) {
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
   public <U extends T> void a(dix<T, U> $$0, aqg<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(egy $$0, Consumer<T> $$1) {
      this.b.b($$0, aqg.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dix<T, U> $$0, egy $$1, aqg<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
