import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bpf<S> {
   private final Map<bpf.b<?>, bpf.a<?>> a = new HashMap<>();
   private final bpc<S> b;
   private final bpd<S> c;

   protected bpf(bpc<S> $$0, bpd<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpd<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bpa<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bpa<T> $$0) {
      bpf.b<T> $$1 = new bpf.b<>($$0, this.c());
      bpf.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bpg<S, T> $$3 = this.b.a($$0);
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
   private <T> bpf.a<T> a(bpf.b<T> $$0) {
      return (bpf.a<T>)this.a.get($$0);
   }

   private <T> void a(bpf.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bpf.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bpa<T> a, int b) {
   }
}
