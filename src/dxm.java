import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxm<T extends dxc> implements dxl<T> {
   private final dxe<T> b;
   private final dxh<T> c;

   public dxm(dxe<T> $$0, dxh<T> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return this.b.a($$0);
   }

   @Nullable
   @Override
   public T a(UUID $$0) {
      return this.b.a($$0);
   }

   @Override
   public Iterable<T> b() {
      return this.b.a();
   }

   @Override
   public <U extends T> void a(dxj<T, U> $$0, awz<U> $$1) {
      this.b.a($$0, $$1);
   }

   @Override
   public void a(ewp $$0, Consumer<T> $$1) {
      this.c.b($$0, awz.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dxj<T, U> $$0, ewp $$1, awz<U> $$2) {
      this.c.a($$0, $$1, $$2);
   }
}
