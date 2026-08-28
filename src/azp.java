import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class azp implements jf.a {
   final jg.a a;
   final azp.a b = new azp.a();
   final Map<ald<Object>, je.c<Object>> c = new HashMap<>();
   final Map<axp<Object>, ji.c<Object>> d = new HashMap<>();

   public azp(jg.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jf<T>> a(ald<? extends jr<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> alc<V> a(DynamicOps<V> $$0) {
      return alc.a($$0, new alc.c() {
         @Override
         public <T> Optional<alc.b<T>> a(ald<? extends jr<? extends T>> $$0) {
            return azp.this.a.a($$0).map(alc.b::a).or(() -> Optional.of(new alc.b<>(azp.this.b.b(), azp.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public azu a() {
      return new azu() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, jg.a $$2) {
            return $$0.encodeStart(azp.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jf<Object>, jh<Object> {
      @Override
      public Optional<je.c<Object>> a(ald<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public je.c<Object> b(ald<Object> $$0) {
         return this.c($$0);
      }

      private je.c<Object> c(ald<Object> $$0) {
         return azp.this.c.computeIfAbsent($$0, $$0x -> je.c.a(this, $$0x));
      }

      @Override
      public Optional<ji.c<Object>> a(axp<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public ji.c<Object> b(axp<Object> $$0) {
         return this.c($$0);
      }

      private ji.c<Object> c(axp<Object> $$0) {
         return azp.this.d.computeIfAbsent($$0, $$0x -> ji.a(this, $$0x));
      }

      public <T> jf<T> a() {
         return this;
      }

      public <T> jh<T> b() {
         return this;
      }
   }
}
