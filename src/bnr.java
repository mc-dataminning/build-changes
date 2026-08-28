import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnr<S> {
   private final Map<bnr.b<?>, bnr.a<?>> a = new HashMap<>();
   private final bno<S> b;
   private final bnp<S> c;

   protected bnr(bno<S> $$0, bnp<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnp<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bnm<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bnm<T> $$0) {
      bnr.b<T> $$1 = new bnr.b<>($$0, this.c());
      bnr.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bns<S, T> $$3 = this.b.a($$0);
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
   private <T> bnr.a<T> a(bnr.b<T> $$0) {
      return (bnr.a<T>)this.a.get($$0);
   }

   private <T> void a(bnr.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnr.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bnm<T> a, int b) {
   }
}
