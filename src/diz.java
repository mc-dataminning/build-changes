import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class diz<T extends dip> implements diy<T> {
   private final dir<T> a;
   private final diu<T> b;

   public diz(dir<T> $$0, diu<T> $$1) {
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
   public <U extends T> void a(diw<T, U> $$0, aqe<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eha $$0, Consumer<T> $$1) {
      this.b.b($$0, aqe.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(diw<T, U> $$0, eha $$1, aqe<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
