import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dlo<T extends dle> implements dln<T> {
   private final dlg<T> a;
   private final dlj<T> b;

   public dlo(dlg<T> $$0, dlj<T> $$1) {
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
   public <U extends T> void a(dll<T, U> $$0, asf<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eju $$0, Consumer<T> $$1) {
      this.b.b($$0, asf.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dll<T, U> $$0, eju $$1, asf<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
