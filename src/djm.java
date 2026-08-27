import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djm<T extends djc> implements djl<T> {
   private final dje<T> a;
   private final djh<T> b;

   public djm(dje<T> $$0, djh<T> $$1) {
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
   public <U extends T> void a(djj<T, U> $$0, aqp<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ehk $$0, Consumer<T> $$1) {
      this.b.b($$0, aqp.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(djj<T, U> $$0, ehk $$1, aqp<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
