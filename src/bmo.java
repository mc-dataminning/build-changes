import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bmo<S> {
   private final Map<bmo.b<?>, bmo.a<?>> a = new HashMap<>();
   private final bml<S> b;
   private final bmm<S> c;

   protected bmo(bml<S> $$0, bmm<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmm<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmj<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmj<T> $$0) {
      bmo.b<T> $$1 = new bmo.b<>($$0, this.c());
      bmo.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmp<S, T> $$3 = this.b.a($$0);
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
   private <T> bmo.a<T> a(bmo.b<T> $$0) {
      return (bmo.a<T>)this.a.get($$0);
   }

   private <T> void a(bmo.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bmo.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmj<T> a, int b) {
   }
}
