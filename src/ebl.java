import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ebl<T extends ebb> implements ebk<T> {
   private final ebd<T> a;
   private final ebg<T> b;

   public ebl(ebd<T> $$0, ebg<T> $$1) {
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
   public <U extends T> void a(ebi<T, U> $$0, axl<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(faw $$0, Consumer<T> $$1) {
      this.b.b($$0, axl.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(ebi<T, U> $$0, faw $$1, axl<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
