import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bln<S> {
   private final Map<bln.b<?>, bln.a<?>> a = new HashMap<>();
   private final blk<S> b;
   private final bll<S> c;

   protected bln(blk<S> $$0, bll<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bll<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bli<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bli<T> $$0) {
      bln.b<T> $$1 = new bln.b<>($$0, this.c());
      bln.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         blo<S, T> $$3 = this.b.a($$0);
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
   private <T> bln.a<T> a(bln.b<T> $$0) {
      return (bln.a<T>)this.a.get($$0);
   }

   private <T> void a(bln.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bln.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bli<T> a, int b) {
   }
}
