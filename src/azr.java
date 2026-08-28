import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class azr implements jf.a {
   final jg.a a;
   final azr.a b = new azr.a();
   final Map<alf<Object>, je.c<Object>> c = new HashMap<>();
   final Map<axr<Object>, ji.c<Object>> d = new HashMap<>();

   public azr(jg.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jf<T>> a(alf<? extends jr<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> ale<V> a(DynamicOps<V> $$0) {
      return ale.a($$0, new ale.c() {
         @Override
         public <T> Optional<ale.b<T>> a(alf<? extends jr<? extends T>> $$0) {
            return azr.this.a.a($$0).map(ale.b::a).or(() -> Optional.of(new ale.b<>(azr.this.b.b(), azr.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public azw a() {
      return new azw() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, jg.a $$2) {
            return $$0.encodeStart(azr.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jf<Object>, jh<Object> {
      @Override
      public Optional<je.c<Object>> a(alf<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public je.c<Object> b(alf<Object> $$0) {
         return this.c($$0);
      }

      private je.c<Object> c(alf<Object> $$0) {
         return azr.this.c.computeIfAbsent($$0, $$0x -> je.c.a(this, $$0x));
      }

      @Override
      public Optional<ji.c<Object>> a(axr<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public ji.c<Object> b(axr<Object> $$0) {
         return this.c($$0);
      }

      private ji.c<Object> c(axr<Object> $$0) {
         return azr.this.d.computeIfAbsent($$0, $$0x -> ji.a(this, $$0x));
      }

      public <T> jf<T> a() {
         return this;
      }

      public <T> jh<T> b() {
         return this;
      }
   }
}
