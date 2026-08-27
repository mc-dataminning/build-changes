import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dvn<T extends dvd> implements dvm<T> {
   private final dvf<T> a;
   private final dvi<T> b;

   public dvn(dvf<T> $$0, dvi<T> $$1) {
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
   public <U extends T> void a(dvk<T, U> $$0, aws<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(euh $$0, Consumer<T> $$1) {
      this.b.b($$0, aws.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dvk<T, U> $$0, euh $$1, aws<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
