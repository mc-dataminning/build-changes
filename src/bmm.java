import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bmm<S> {
   private final Map<bmm.b<?>, bmm.a<?>> a = new HashMap<>();
   private final bmj<S> b;
   private final bmk<S> c;

   protected bmm(bmj<S> $$0, bmk<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmk<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmh<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmh<T> $$0) {
      bmm.b<T> $$1 = new bmm.b<>($$0, this.c());
      bmm.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmn<S, T> $$3 = this.b.a($$0);
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
   private <T> bmm.a<T> a(bmm.b<T> $$0) {
      return (bmm.a<T>)this.a.get($$0);
   }

   private <T> void a(bmm.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bmm.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmh<T> a, int b) {
   }
}
