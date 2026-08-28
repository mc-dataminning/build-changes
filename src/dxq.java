import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxq<T extends dxg> implements dxp<T> {
   private final dxi<T> a;
   private final dxl<T> b;

   public dxq(dxi<T> $$0, dxl<T> $$1) {
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
   public <U extends T> void a(dxn<T, U> $$0, axa<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ewx $$0, Consumer<T> $$1) {
      this.b.b($$0, axa.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dxn<T, U> $$0, ewx $$1, axa<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
