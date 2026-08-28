import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnl<S> {
   private final Map<bnl.b<?>, bnl.a<?>> a = new HashMap<>();
   private final bni<S> b;
   private final bnj<S> c;

   protected bnl(bni<S> $$0, bnj<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnj<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bng<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bng<T> $$0) {
      bnl.b<T> $$1 = new bnl.b<>($$0, this.c());
      bnl.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bnm<S, T> $$3 = this.b.a($$0);
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
   private <T> bnl.a<T> a(bnl.b<T> $$0) {
      return (bnl.a<T>)this.a.get($$0);
   }

   private <T> void a(bnl.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnl.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bng<T> a, int b) {
   }
}
