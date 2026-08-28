import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bni<S> {
   private final Map<bni.b<?>, bni.a<?>> a = new HashMap<>();
   private final bnf<S> b;
   private final bng<S> c;

   protected bni(bnf<S> $$0, bng<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bng<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bnd<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bnd<T> $$0) {
      bni.b<T> $$1 = new bni.b<>($$0, this.c());
      bni.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bnj<S, T> $$3 = this.b.a($$0);
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
   private <T> bni.a<T> a(bni.b<T> $$0) {
      return (bni.a<T>)this.a.get($$0);
   }

   private <T> void a(bni.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bni.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bnd<T> a, int b) {
   }
}
