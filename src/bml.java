import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bml<S> {
   private final Map<bml.b<?>, bml.a<?>> a = new HashMap<>();
   private final bmi<S> b;
   private final bmj<S> c;

   protected bml(bmi<S> $$0, bmj<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmj<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmg<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmg<T> $$0) {
      bml.b<T> $$1 = new bml.b<>($$0, this.c());
      bml.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmm<S, T> $$3 = this.b.a($$0);
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
   private <T> bml.a<T> a(bml.b<T> $$0) {
      return (bml.a<T>)this.a.get($$0);
   }

   private <T> void a(bml.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bml.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmg<T> a, int b) {
   }
}
