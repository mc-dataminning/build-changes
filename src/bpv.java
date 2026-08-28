import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bpv<S> {
   private final Map<bpr<?>, bpv.a<S, ?>> a = new IdentityHashMap<>();

   public <T> bpy<S, T> a(bpr<T> $$0, bqa<S, T> $$1) {
      bpv.a<S, T> $$2 = (bpv.a<S, T>)this.a.computeIfAbsent($$0, bpv.a::new);
      if ($$2.b != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      } else {
         $$2.b = $$1;
         return $$2;
      }
   }

   public <T> bpy<S, T> a(bpr<T> $$0, bqd<S> $$1, bqa.a<S, T> $$2) {
      return this.a($$0, bqa.a($$1, $$2));
   }

   public <T> bpy<S, T> a(bpr<T> $$0, bqd<S> $$1, bqa.b<S, T> $$2) {
      return this.a($$0, bqa.a($$1, $$2));
   }

   public void a() {
      List<? extends bpr<?>> $$0 = this.a.entrySet().stream().filter($$0x -> $$0x.getValue() == null).map(Entry::getKey).toList();
      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Unbound names: " + $$0);
      }
   }

   public <T> bpy<S, T> a(bpr<T> $$0) {
      return (bpy<S, T>)Objects.requireNonNull(this.a.get($$0), () -> "No rule called " + $$0);
   }

   public <T> bpy<S, T> b(bpr<T> $$0) {
      return this.d($$0);
   }

   private <T> bpv.a<S, T> d(bpr<T> $$0) {
      return (bpv.a<S, T>)this.a.computeIfAbsent($$0, bpv.a::new);
   }

   public <T> bqd<S> c(bpr<T> $$0) {
      return new bpv.b<>(this.d($$0), $$0);
   }

   public <T> bqd<S> a(bpr<T> $$0, bpr<T> $$1) {
      return new bpv.b<>(this.d($$0), $$1);
   }

   static class a<S, T> implements bpy<S, T>, Supplier<String> {
      private final bpr<T> a;
      @Nullable
      bqa<S, T> b;

      private a(bpr<T> $$0) {
         this.a = $$0;
      }

      @Override
      public bpr<T> a() {
         return this.a;
      }

      @Override
      public bqa<S, T> b() {
         return Objects.requireNonNull(this.b, this);
      }

      public String c() {
         return "Unbound rule " + this.a;
      }
   }

   static record b<S, T>(bpv.a<S, T> a, bpr<T> b) implements bqd<S> {
      @Override
      public boolean a(bpz<S> $$0, bqb $$1, bpt $$2) {
         T $$3 = $$0.a(this.a);
         if ($$3 == null) {
            return false;
         } else {
            $$1.a(this.b, $$3);
            return true;
         }
      }
   }
}
