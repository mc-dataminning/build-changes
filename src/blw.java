import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class blw<S> {
   private final Map<blw.b<?>, blw.a<?>> a = new HashMap<>();
   private final blt<S> b;
   private final blu<S> c;

   protected blw(blt<S> $$0, blu<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public blu<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(blr<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(blr<T> $$0) {
      blw.b<T> $$1 = new blw.b<>($$0, this.c());
      blw.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         blx<S, T> $$3 = this.b.a($$0);
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
   private <T> blw.a<T> a(blw.b<T> $$0) {
      return (blw.a<T>)this.a.get($$0);
   }

   private <T> void a(blw.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new blw.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(blr<T> a, int b) {
   }
}
