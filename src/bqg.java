import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bqg<S> {
   private final Map<bqc<?>, bqg.a<S, ?>> a = new IdentityHashMap<>();

   public <T> bqj<S, T> a(bqc<T> $$0, bql<S, T> $$1) {
      bqg.a<S, T> $$2 = (bqg.a<S, T>)this.a.computeIfAbsent($$0, bqg.a::new);
      if ($$2.b != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      } else {
         $$2.b = $$1;
         return $$2;
      }
   }

   public <T> bqj<S, T> a(bqc<T> $$0, bqo<S> $$1, bql.a<S, T> $$2) {
      return this.a($$0, bql.a($$1, $$2));
   }

   public <T> bqj<S, T> a(bqc<T> $$0, bqo<S> $$1, bql.b<S, T> $$2) {
      return this.a($$0, bql.a($$1, $$2));
   }

   public void a() {
      List<? extends bqc<?>> $$0 = this.a.entrySet().stream().filter($$0x -> $$0x.getValue() == null).map(Entry::getKey).toList();
      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Unbound names: " + $$0);
      }
   }

   public <T> bqj<S, T> a(bqc<T> $$0) {
      return (bqj<S, T>)Objects.requireNonNull(this.a.get($$0), () -> "No rule called " + $$0);
   }

   public <T> bqj<S, T> b(bqc<T> $$0) {
      return this.d($$0);
   }

   private <T> bqg.a<S, T> d(bqc<T> $$0) {
      return (bqg.a<S, T>)this.a.computeIfAbsent($$0, bqg.a::new);
   }

   public <T> bqo<S> c(bqc<T> $$0) {
      return new bqg.b<>(this.d($$0), $$0);
   }

   public <T> bqo<S> a(bqc<T> $$0, bqc<T> $$1) {
      return new bqg.b<>(this.d($$0), $$1);
   }

   static class a<S, T> implements bqj<S, T>, Supplier<String> {
      private final bqc<T> a;
      @Nullable
      bql<S, T> b;

      private a(bqc<T> $$0) {
         this.a = $$0;
      }

      @Override
      public bqc<T> a() {
         return this.a;
      }

      @Override
      public bql<S, T> b() {
         return Objects.requireNonNull(this.b, this);
      }

      public String c() {
         return "Unbound rule " + this.a;
      }
   }

   static record b<S, T>(bqg.a<S, T> a, bqc<T> b) implements bqo<S> {
      @Override
      public boolean a(bqk<S> $$0, bqm $$1, bqe $$2) {
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
