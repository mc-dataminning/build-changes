import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class efv<T extends efl> implements efu<T> {
   private final efn<T> a;
   private final efq<T> b;

   public efv(efn<T> $$0, efq<T> $$1) {
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
   public <U extends T> void a(efs<T, U> $$0, ayb<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ffn $$0, Consumer<T> $$1) {
      this.b.b($$0, ayb.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(efs<T, U> $$0, ffn $$1, ayb<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
