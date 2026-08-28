import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class bae implements jh.a {
   final ji.a a;
   final bae.a b = new bae.a();
   final Map<alq<Object>, jg.c<Object>> c = new HashMap<>();
   final Map<ayc<Object>, jk.c<Object>> d = new HashMap<>();

   public bae(ji.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jh<T>> a(alq<? extends jt<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> alp<V> a(DynamicOps<V> $$0) {
      return alp.a($$0, new alp.c() {
         @Override
         public <T> Optional<alp.b<T>> a(alq<? extends jt<? extends T>> $$0) {
            return bae.this.a.a($$0).map(alp.b::a).or(() -> Optional.of(new alp.b<>(bae.this.b.b(), bae.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public baj a() {
      return new baj() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, ji.a $$2) {
            return $$0.encodeStart(bae.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jh<Object>, jj<Object> {
      @Override
      public Optional<jg.c<Object>> a(alq<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jg.c<Object> b(alq<Object> $$0) {
         return this.c($$0);
      }

      private jg.c<Object> c(alq<Object> $$0) {
         return bae.this.c.computeIfAbsent($$0, $$0x -> jg.c.a(this, $$0x));
      }

      @Override
      public Optional<jk.c<Object>> a(ayc<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jk.c<Object> b(ayc<Object> $$0) {
         return this.c($$0);
      }

      private jk.c<Object> c(ayc<Object> $$0) {
         return bae.this.d.computeIfAbsent($$0, $$0x -> jk.a(this, $$0x));
      }

      public <T> jh<T> a() {
         return this;
      }

      public <T> jj<T> b() {
         return this;
      }
   }
}
