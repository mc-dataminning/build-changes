import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnd<S> {
   private final Map<bnd.b<?>, bnd.a<?>> a = new HashMap<>();
   private final bna<S> b;
   private final bnb<S> c;

   protected bnd(bna<S> $$0, bnb<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnb<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmy<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmy<T> $$0) {
      bnd.b<T> $$1 = new bnd.b<>($$0, this.c());
      bnd.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bne<S, T> $$3 = this.b.a($$0);
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
   private <T> bnd.a<T> a(bnd.b<T> $$0) {
      return (bnd.a<T>)this.a.get($$0);
   }

   private <T> void a(bnd.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnd.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmy<T> a, int b) {
   }
}
