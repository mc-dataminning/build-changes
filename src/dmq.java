import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dmq<T extends dmg> implements dmp<T> {
   private final dmi<T> a;
   private final dml<T> b;

   public dmq(dmi<T> $$0, dml<T> $$1) {
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
   public <U extends T> void a(dmn<T, U> $$0, asm<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(ekw $$0, Consumer<T> $$1) {
      this.b.b($$0, asm.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dmn<T, U> $$0, ekw $$1, asm<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
