import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class blf<S> {
   private final Map<blf.b<?>, blf.a<?>> a = new HashMap<>();
   private final blc<S> b;
   private final bld<S> c;

   protected blf(blc<S> $$0, bld<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bld<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bla<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bla<T> $$0) {
      blf.b<T> $$1 = new blf.b<>($$0, this.c());
      blf.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         blg<S, T> $$3 = this.b.a($$0);
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
   private <T> blf.a<T> a(blf.b<T> $$0) {
      return (blf.a<T>)this.a.get($$0);
   }

   private <T> void a(blf.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new blf.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bla<T> a, int b) {
   }
}
