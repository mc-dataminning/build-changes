import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bmk<S> {
   private final Map<bmk.b<?>, bmk.a<?>> a = new HashMap<>();
   private final bmh<S> b;
   private final bmi<S> c;

   protected bmk(bmh<S> $$0, bmi<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmi<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmf<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmf<T> $$0) {
      bmk.b<T> $$1 = new bmk.b<>($$0, this.c());
      bmk.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bml<S, T> $$3 = this.b.a($$0);
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
   private <T> bmk.a<T> a(bmk.b<T> $$0) {
      return (bmk.a<T>)this.a.get($$0);
   }

   private <T> void a(bmk.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bmk.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmf<T> a, int b) {
   }
}
