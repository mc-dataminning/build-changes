import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class azt implements jg.a {
   final jh.a a;
   final azt.a b = new azt.a();
   final Map<alh<Object>, jf.c<Object>> c = new HashMap<>();
   final Map<axt<Object>, jj.c<Object>> d = new HashMap<>();

   public azt(jh.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jg<T>> a(alh<? extends js<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> alg<V> a(DynamicOps<V> $$0) {
      return alg.a($$0, new alg.c() {
         @Override
         public <T> Optional<alg.b<T>> a(alh<? extends js<? extends T>> $$0) {
            return azt.this.a.a($$0).map(alg.b::a).or(() -> Optional.of(new alg.b<>(azt.this.b.b(), azt.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public azy a() {
      return new azy() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, jh.a $$2) {
            return $$0.encodeStart(azt.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jg<Object>, ji<Object> {
      @Override
      public Optional<jf.c<Object>> a(alh<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jf.c<Object> b(alh<Object> $$0) {
         return this.c($$0);
      }

      private jf.c<Object> c(alh<Object> $$0) {
         return azt.this.c.computeIfAbsent($$0, $$0x -> jf.c.a(this, $$0x));
      }

      @Override
      public Optional<jj.c<Object>> a(axt<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jj.c<Object> b(axt<Object> $$0) {
         return this.c($$0);
      }

      private jj.c<Object> c(axt<Object> $$0) {
         return azt.this.d.computeIfAbsent($$0, $$0x -> jj.a(this, $$0x));
      }

      public <T> jg<T> a() {
         return this;
      }

      public <T> ji<T> b() {
         return this;
      }
   }
}
