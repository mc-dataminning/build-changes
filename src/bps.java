import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bps<S> {
   private final Map<bps.b<?>, bps.a<?>> a = new HashMap<>();
   private final bpp<S> b;
   private final bpq<S> c;

   protected bps(bpp<S> $$0, bpq<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpq<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bpn<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bpn<T> $$0) {
      bps.b<T> $$1 = new bps.b<>($$0, this.c());
      bps.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bpt<S, T> $$3 = this.b.a($$0);
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
   private <T> bps.a<T> a(bps.b<T> $$0) {
      return (bps.a<T>)this.a.get($$0);
   }

   private <T> void a(bps.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bps.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bpn<T> a, int b) {
   }
}
