import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class blt<S> {
   private final Map<blt.b<?>, blt.a<?>> a = new HashMap<>();
   private final blq<S> b;
   private final blr<S> c;

   protected blt(blq<S> $$0, blr<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public blr<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(blo<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(blo<T> $$0) {
      blt.b<T> $$1 = new blt.b<>($$0, this.c());
      blt.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         blu<S, T> $$3 = this.b.a($$0);
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
   private <T> blt.a<T> a(blt.b<T> $$0) {
      return (blt.a<T>)this.a.get($$0);
   }

   private <T> void a(blt.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new blt.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(blo<T> a, int b) {
   }
}
