import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnp<S> {
   private final Map<bnp.b<?>, bnp.a<?>> a = new HashMap<>();
   private final bnm<S> b;
   private final bnn<S> c;

   protected bnp(bnm<S> $$0, bnn<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnn<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bnk<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bnk<T> $$0) {
      bnp.b<T> $$1 = new bnp.b<>($$0, this.c());
      bnp.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bnq<S, T> $$3 = this.b.a($$0);
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
   private <T> bnp.a<T> a(bnp.b<T> $$0) {
      return (bnp.a<T>)this.a.get($$0);
   }

   private <T> void a(bnp.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnp.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bnk<T> a, int b) {
   }
}
