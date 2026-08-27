import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dui<T extends dty> implements duh<T> {
   private final dua<T> a;
   private final dud<T> b;

   public dui(dua<T> $$0, dud<T> $$1) {
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
   public <U extends T> void a(duf<T, U> $$0, awj<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eta $$0, Consumer<T> $$1) {
      this.b.b($$0, awj.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(duf<T, U> $$0, eta $$1, awj<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
