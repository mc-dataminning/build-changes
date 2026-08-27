import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dts<T extends dti> implements dtr<T> {
   private final dtk<T> a;
   private final dtn<T> b;

   public dts(dtk<T> $$0, dtn<T> $$1) {
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
   public <U extends T> void a(dtp<T, U> $$0, avz<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ese $$0, Consumer<T> $$1) {
      this.b.b($$0, avz.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dtp<T, U> $$0, ese $$1, avz<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
