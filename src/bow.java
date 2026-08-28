import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bow<S> {
   private final Map<bow.b<?>, bow.a<?>> a = new HashMap<>();
   private final bot<S> b;
   private final bou<S> c;

   protected bow(bot<S> $$0, bou<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bou<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bor<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bor<T> $$0) {
      bow.b<T> $$1 = new bow.b<>($$0, this.c());
      bow.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         box<S, T> $$3 = this.b.a($$0);
         if ($$3 == null) {
            throw new IllegalStateException("No symbol " + $$0);
         } else {
            Optional<T> $$4 = $$3.a(this);
            this.a($$1, $$4);
            return $$4;
         }
      }
   }

   @Nullable
   private <T> bow.a<T> a(bow.b<T> $$0) {
      return (bow.a<T>)this.a.get($$0);
   }

   private <T> void a(bow.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bow.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bor<T> a, int b) {
   }
}
