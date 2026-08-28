import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwo<T extends dwe> implements dwn<T> {
   private final dwg<T> a;
   private final dwj<T> b;

   public dwo(dwg<T> $$0, dwj<T> $$1) {
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
   public <U extends T> void a(dwl<T, U> $$0, axl<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(evo $$0, Consumer<T> $$1) {
      this.b.b($$0, axl.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dwl<T, U> $$0, evo $$1, axl<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
