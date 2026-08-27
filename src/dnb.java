import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dnb<T extends dmr> implements dna<T> {
   private final dmt<T> a;
   private final dmw<T> b;

   public dnb(dmt<T> $$0, dmw<T> $$1) {
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
   public <U extends T> void a(dmy<T, U> $$0, asw<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(elh $$0, Consumer<T> $$1) {
      this.b.b($$0, asw.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dmy<T, U> $$0, elh $$1, asw<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
