import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bmi<S> {
   private final Map<bmi.b<?>, bmi.a<?>> a = new HashMap<>();
   private final bmf<S> b;
   private final bmg<S> c;

   protected bmi(bmf<S> $$0, bmg<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmg<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmd<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmd<T> $$0) {
      bmi.b<T> $$1 = new bmi.b<>($$0, this.c());
      bmi.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmj<S, T> $$3 = this.b.a($$0);
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
   private <T> bmi.a<T> a(bmi.b<T> $$0) {
      return (bmi.a<T>)this.a.get($$0);
   }

   private <T> void a(bmi.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bmi.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmd<T> a, int b) {
   }
}
