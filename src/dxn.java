import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxn<T extends dxd> implements dxm<T> {
   private final dxf<T> a;
   private final dxi<T> b;

   public dxn(dxf<T> $$0, dxi<T> $$1) {
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
   public <U extends T> void a(dxk<T, U> $$0, awz<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ewr $$0, Consumer<T> $$1) {
      this.b.b($$0, awz.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dxk<T, U> $$0, ewr $$1, awz<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
