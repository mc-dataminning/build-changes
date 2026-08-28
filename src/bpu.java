import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bpu<S> {
   private final Map<bpu.b<?>, bpu.a<?>> a = new HashMap<>();
   private final bpr<S> b;
   private final bps<S> c;

   protected bpu(bpr<S> $$0, bps<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bps<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bpp<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bpp<T> $$0) {
      bpu.b<T> $$1 = new bpu.b<>($$0, this.c());
      bpu.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bpv<S, T> $$3 = this.b.a($$0);
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
   private <T> bpu.a<T> a(bpu.b<T> $$0) {
      return (bpu.a<T>)this.a.get($$0);
   }

   private <T> void a(bpu.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bpu.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bpp<T> a, int b) {
   }
}
