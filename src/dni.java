import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dni<T extends dmy> implements dnh<T> {
   private final dna<T> a;
   private final dnd<T> b;

   public dni(dna<T> $$0, dnd<T> $$1) {
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
   public <U extends T> void a(dnf<T, U> $$0, atc<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(elo $$0, Consumer<T> $$1) {
      this.b.b($$0, atc.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(dnf<T, U> $$0, elo $$1, atc<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
