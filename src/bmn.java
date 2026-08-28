import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bmn<S> {
   private final Map<bmn.b<?>, bmn.a<?>> a = new HashMap<>();
   private final bmk<S> b;
   private final bml<S> c;

   protected bmn(bmk<S> $$0, bml<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bml<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmi<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmi<T> $$0) {
      bmn.b<T> $$1 = new bmn.b<>($$0, this.c());
      bmn.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmo<S, T> $$3 = this.b.a($$0);
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
   private <T> bmn.a<T> a(bmn.b<T> $$0) {
      return (bmn.a<T>)this.a.get($$0);
   }

   private <T> void a(bmn.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bmn.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmi<T> a, int b) {
   }
}
