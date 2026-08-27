import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class blp<S> {
   private final Map<blp.b<?>, blp.a<?>> a = new HashMap<>();
   private final blm<S> b;
   private final bln<S> c;

   protected blp(blm<S> $$0, bln<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bln<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(blk<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(blk<T> $$0) {
      blp.b<T> $$1 = new blp.b<>($$0, this.c());
      blp.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         blq<S, T> $$3 = this.b.a($$0);
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
   private <T> blp.a<T> a(blp.b<T> $$0) {
      return (blp.a<T>)this.a.get($$0);
   }

   private <T> void a(blp.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new blp.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(blk<T> a, int b) {
   }
}
