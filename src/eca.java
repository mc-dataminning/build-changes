import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eca<T extends ebq> implements ebz<T> {
   private final ebs<T> a;
   private final ebv<T> b;

   public eca(ebs<T> $$0, ebv<T> $$1) {
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
   public <U extends T> void a(ebx<T, U> $$0, ayq<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fbn $$0, Consumer<T> $$1) {
      this.b.b($$0, ayq.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(ebx<T, U> $$0, fbn $$1, ayq<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
