import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bpx<S> {
   private final Map<bpt<?>, bpx.a<S, ?>> a = new IdentityHashMap<>();

   public <T> bqa<S, T> a(bpt<T> $$0, bqc<S, T> $$1) {
      bpx.a<S, T> $$2 = (bpx.a<S, T>)this.a.computeIfAbsent($$0, bpx.a::new);
      if ($$2.b != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      } else {
         $$2.b = $$1;
         return $$2;
      }
   }

   public <T> bqa<S, T> a(bpt<T> $$0, bqf<S> $$1, bqc.a<S, T> $$2) {
      return this.a($$0, bqc.a($$1, $$2));
   }

   public <T> bqa<S, T> a(bpt<T> $$0, bqf<S> $$1, bqc.b<S, T> $$2) {
      return this.a($$0, bqc.a($$1, $$2));
   }

   public void a() {
      List<? extends bpt<?>> $$0 = this.a.entrySet().stream().filter($$0x -> $$0x.getValue() == null).map(Entry::getKey).toList();
      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Unbound names: " + $$0);
      }
   }

   public <T> bqa<S, T> a(bpt<T> $$0) {
      return (bqa<S, T>)Objects.requireNonNull(this.a.get($$0), () -> "No rule called " + $$0);
   }

   public <T> bqa<S, T> b(bpt<T> $$0) {
      return this.d($$0);
   }

   private <T> bpx.a<S, T> d(bpt<T> $$0) {
      return (bpx.a<S, T>)this.a.computeIfAbsent($$0, bpx.a::new);
   }

   public <T> bqf<S> c(bpt<T> $$0) {
      return new bpx.b<>(this.d($$0), $$0);
   }

   public <T> bqf<S> a(bpt<T> $$0, bpt<T> $$1) {
      return new bpx.b<>(this.d($$0), $$1);
   }

   static class a<S, T> implements bqa<S, T>, Supplier<String> {
      private final bpt<T> a;
      @Nullable
      bqc<S, T> b;

      private a(bpt<T> $$0) {
         this.a = $$0;
      }

      @Override
      public bpt<T> a() {
         return this.a;
      }

      @Override
      public bqc<S, T> b() {
         return Objects.requireNonNull(this.b, this);
      }

      public String c() {
         return "Unbound rule " + this.a;
      }
   }

   static record b<S, T>(bpx.a<S, T> a, bpt<T> b) implements bqf<S> {
      @Override
      public boolean a(bqb<S> $$0, bqd $$1, bpv $$2) {
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
