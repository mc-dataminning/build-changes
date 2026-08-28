import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bpn<S> {
   private final Map<bpn.b<?>, bpn.a<?>> a = new HashMap<>();
   private final bpk<S> b;
   private final bpl<S> c;

   protected bpn(bpk<S> $$0, bpl<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpl<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bpi<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bpi<T> $$0) {
      bpn.b<T> $$1 = new bpn.b<>($$0, this.c());
      bpn.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bpo<S, T> $$3 = this.b.a($$0);
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
   private <T> bpn.a<T> a(bpn.b<T> $$0) {
      return (bpn.a<T>)this.a.get($$0);
   }

   private <T> void a(bpn.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bpn.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bpi<T> a, int b) {
   }
}
