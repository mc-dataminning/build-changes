import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dgc<T extends dfs> implements dgb<T> {
   private final dfu<T> a;
   private final dfx<T> b;

   public dgc(dfu<T> $$0, dfx<T> $$1) {
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
   public <U extends T> void a(dfz<T, U> $$0, anr<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(eed $$0, Consumer<T> $$1) {
      this.b.b($$0, anr.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dfz<T, U> $$0, eed $$1, anr<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
