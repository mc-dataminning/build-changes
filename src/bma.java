import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bma<S> {
   private final Map<bma.b<?>, bma.a<?>> a = new HashMap<>();
   private final blx<S> b;
   private final bly<S> c;

   protected bma(blx<S> $$0, bly<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bly<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(blv<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(blv<T> $$0) {
      bma.b<T> $$1 = new bma.b<>($$0, this.c());
      bma.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmb<S, T> $$3 = this.b.a($$0);
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
   private <T> bma.a<T> a(bma.b<T> $$0) {
      return (bma.a<T>)this.a.get($$0);
   }

   private <T> void a(bma.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bma.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(blv<T> a, int b) {
   }
}
