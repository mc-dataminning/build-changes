import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnx<S> {
   private final Map<bnx.b<?>, bnx.a<?>> a = new HashMap<>();
   private final bnu<S> b;
   private final bnv<S> c;

   protected bnx(bnu<S> $$0, bnv<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnv<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bns<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bns<T> $$0) {
      bnx.b<T> $$1 = new bnx.b<>($$0, this.c());
      bnx.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bny<S, T> $$3 = this.b.a($$0);
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
   private <T> bnx.a<T> a(bnx.b<T> $$0) {
      return (bnx.a<T>)this.a.get($$0);
   }

   private <T> void a(bnx.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnx.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bns<T> a, int b) {
   }
}
