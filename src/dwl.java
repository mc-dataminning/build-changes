import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwl<T extends dwb> implements dwk<T> {
   private final dwd<T> a;
   private final dwg<T> b;

   public dwl(dwd<T> $$0, dwg<T> $$1) {
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
   public <U extends T> void a(dwi<T, U> $$0, axk<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(evl $$0, Consumer<T> $$1) {
      this.b.b($$0, axk.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dwi<T, U> $$0, evl $$1, axk<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
