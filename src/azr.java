import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class azr implements jg.a {
   final jh.a a;
   final azr.a b = new azr.a();
   final Map<alf<Object>, jf.c<Object>> c = new HashMap<>();
   final Map<axr<Object>, jj.c<Object>> d = new HashMap<>();

   public azr(jh.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jg<T>> a(alf<? extends js<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> ale<V> a(DynamicOps<V> $$0) {
      return ale.a($$0, new ale.c() {
         @Override
         public <T> Optional<ale.b<T>> a(alf<? extends js<? extends T>> $$0) {
            return azr.this.a.a($$0).map(ale.b::a).or(() -> Optional.of(new ale.b<>(azr.this.b.b(), azr.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public azw a() {
      return new azw() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, jh.a $$2) {
            return $$0.encodeStart(azr.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jg<Object>, ji<Object> {
      @Override
      public Optional<jf.c<Object>> a(alf<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jf.c<Object> b(alf<Object> $$0) {
         return this.c($$0);
      }

      private jf.c<Object> c(alf<Object> $$0) {
         return azr.this.c.computeIfAbsent($$0, $$0x -> jf.c.a(this, $$0x));
      }

      @Override
      public Optional<jj.c<Object>> a(axr<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jj.c<Object> b(axr<Object> $$0) {
         return this.c($$0);
      }

      private jj.c<Object> c(axr<Object> $$0) {
         return azr.this.d.computeIfAbsent($$0, $$0x -> jj.a(this, $$0x));
      }

      public <T> jg<T> a() {
         return this;
      }

      public <T> ji<T> b() {
         return this;
      }
   }
}
