import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class azv implements jh.a {
   final ji.a a;
   final azv.a b = new azv.a();
   final Map<alj<Object>, jg.c<Object>> c = new HashMap<>();
   final Map<axv<Object>, jk.c<Object>> d = new HashMap<>();

   public azv(ji.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jh<T>> a(alj<? extends jt<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> ali<V> a(DynamicOps<V> $$0) {
      return ali.a($$0, new ali.c() {
         @Override
         public <T> Optional<ali.b<T>> a(alj<? extends jt<? extends T>> $$0) {
            return azv.this.a.a($$0).map(ali.b::a).or(() -> Optional.of(new ali.b<>(azv.this.b.b(), azv.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public baa a() {
      return new baa() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, ji.a $$2) {
            return $$0.encodeStart(azv.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jh<Object>, jj<Object> {
      @Override
      public Optional<jg.c<Object>> a(alj<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jg.c<Object> b(alj<Object> $$0) {
         return this.c($$0);
      }

      private jg.c<Object> c(alj<Object> $$0) {
         return azv.this.c.computeIfAbsent($$0, $$0x -> jg.c.a(this, $$0x));
      }

      @Override
      public Optional<jk.c<Object>> a(axv<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jk.c<Object> b(axv<Object> $$0) {
         return this.c($$0);
      }

      private jk.c<Object> c(axv<Object> $$0) {
         return azv.this.d.computeIfAbsent($$0, $$0x -> jk.a(this, $$0x));
      }

      public <T> jh<T> a() {
         return this;
      }

      public <T> jj<T> b() {
         return this;
      }
   }
}
