import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bny<S> {
   private final Map<bny.b<?>, bny.a<?>> a = new HashMap<>();
   private final bnv<S> b;
   private final bnw<S> c;

   protected bny(bnv<S> $$0, bnw<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnw<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bnt<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bnt<T> $$0) {
      bny.b<T> $$1 = new bny.b<>($$0, this.c());
      bny.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bnz<S, T> $$3 = this.b.a($$0);
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
   private <T> bny.a<T> a(bny.b<T> $$0) {
      return (bny.a<T>)this.a.get($$0);
   }

   private <T> void a(bny.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bny.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bnt<T> a, int b) {
   }
}
