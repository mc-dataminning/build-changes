import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzu(dzw b, dzt c) {
   public static final Codec<dzu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzw.a.forGetter(dzu::a), dzt.a.forGetter(dzu::b)).apply($$0, $$0.stable(dzu::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzw $$1, dzt $$2) {
      return a.encodeStart($$0, new dzu($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzw $$1, ka $$2) {
      return a($$0, $$1, new dzt($$2.d(lu.bb)));
   }

   public dzw a() {
      return this.b;
   }

   public dzt b() {
      return this.c;
   }
}
