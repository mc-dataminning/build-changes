import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bnv<S> {
   private final Map<bnv.b<?>, bnv.a<?>> a = new HashMap<>();
   private final bns<S> b;
   private final bnt<S> c;

   protected bnv(bns<S> $$0, bnt<S> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnt<S> a() {
      return this.c;
   }

   public <T> Optional<T> a(bnq<T> $$0) {
      Optional<T> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         this.c.a(this.c());
      }

      return $$1;
   }

   public <T> Optional<T> b(bnq<T> $$0) {
      bnv.b<T> $$1 = new bnv.b<>($$0, this.c());
      bnv.a<T> $$2 = this.a($$1);
      if ($$2 != null) {
         this.a($$2.b());
         return $$2.a;
      } else {
         bnw<S, T> $$3 = this.b.a($$0);
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
   private <T> bnv.a<T> a(bnv.b<T> $$0) {
      return (bnv.a<T>)this.a.get($$0);
   }

   private <T> void a(bnv.b<T> $$0, Optional<T> $$1) {
      this.a.put($$0, new bnv.a<>($$1, this.c()));
   }

   public abstract S b();

   public abstract int c();

   public abstract void a(int var1);

   static record a<T>(Optional<T> a, int b) {
   }

   static record b<T>(bnq<T> a, int b) {
   }
}
