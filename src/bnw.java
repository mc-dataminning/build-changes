import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnw<S> {
   private final Map<bnw.b<?>, bnw.a<?>> a = new HashMap<>();
   private final bnt<S> b;
   private final bnu<S> c;

   protected bnw(bnt<S> $$0, bnu<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnu<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bnr<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bnr<T> $$0) {
      bnw.b<T> $$1 = new bnw.b<>($$0, this.c());
      bnw.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bnx<S, T> $$3 = this.b.a($$0);
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
   private <T> bnw.a<T> a(bnw.b<T> $$0) {
      return (bnw.a<T>)this.a.get($$0);
   }

   private <T> void a(bnw.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnw.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bnr<T> a, int b) {
   }
}
