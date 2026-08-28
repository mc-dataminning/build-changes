import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class blz<S> {
   private final Map<blz.b<?>, blz.a<?>> a = new HashMap<>();
   private final blw<S> b;
   private final blx<S> c;

   protected blz(blw<S> $$0, blx<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public blx<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(blu<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(blu<T> $$0) {
      blz.b<T> $$1 = new blz.b<>($$0, this.c());
      blz.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bma<S, T> $$3 = this.b.a($$0);
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
   private <T> blz.a<T> a(blz.b<T> $$0) {
      return (blz.a<T>)this.a.get($$0);
   }

   private <T> void a(blz.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new blz.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(blu<T> a, int b) {
   }
}
