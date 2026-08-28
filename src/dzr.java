import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzr(dzt b, dzq c) {
   public static final Codec<dzr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzt.a.forGetter(dzr::a), dzq.a.forGetter(dzr::b)).apply($$0, $$0.stable(dzr::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzt $$1, dzq $$2) {
      return a.encodeStart($$0, new dzr($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzt $$1, ka $$2) {
      return a($$0, $$1, new dzq($$2.d(lu.bb)));
   }

   public dzt a() {
      return this.b;
   }

   public dzq b() {
      return this.c;
   }
}
