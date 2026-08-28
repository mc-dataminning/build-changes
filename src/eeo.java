import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eeo<T extends eee> implements een<T> {
   private final eeg<T> a;
   private final eej<T> b;

   public eeo(eeg<T> $$0, eej<T> $$1) {
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
   public <U extends T> void a(eel<T, U> $$0, axx<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fed $$0, Consumer<T> $$1) {
      this.b.b($$0, axx.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(eel<T, U> $$0, fed $$1, axx<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
