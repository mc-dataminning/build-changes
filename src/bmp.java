import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bmp<S> {
   private final Map<bmp.b<?>, bmp.a<?>> a = new HashMap<>();
   private final bmm<S> b;
   private final bmn<S> c;

   protected bmp(bmm<S> $$0, bmn<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmn<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bmk<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bmk<T> $$0) {
      bmp.b<T> $$1 = new bmp.b<>($$0, this.c());
      bmp.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bmq<S, T> $$3 = this.b.a($$0);
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
   private <T> bmp.a<T> a(bmp.b<T> $$0) {
      return (bmp.a<T>)this.a.get($$0);
   }

   private <T> void a(bmp.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bmp.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bmk<T> a, int b) {
   }
}
