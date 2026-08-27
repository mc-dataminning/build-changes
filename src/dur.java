import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dur<T extends duh> implements duq<T> {
   private final duj<T> a;
   private final dum<T> b;

   public dur(duj<T> $$0, dum<T> $$1) {
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
   public <U extends T> void a(duo<T, U> $$0, awm<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(etk $$0, Consumer<T> $$1) {
      this.b.b($$0, awm.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(duo<T, U> $$0, etk $$1, awm<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
