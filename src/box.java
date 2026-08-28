import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class box<S> {
   private final Map<box.b<?>, box.a<?>> a = new HashMap<>();
   private final bou<S> b;
   private final bov<S> c;

   protected box(bou<S> $$0, bov<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bov<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bos<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bos<T> $$0) {
      box.b<T> $$1 = new box.b<>($$0, this.c());
      box.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         boy<S, T> $$3 = this.b.a($$0);
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
   private <T> box.a<T> a(box.b<T> $$0) {
      return (box.a<T>)this.a.get($$0);
   }

   private <T> void a(box.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new box.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bos<T> a, int b) {
   }
}
