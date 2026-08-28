import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzc(dze b, dzb c) {
   public static final Codec<dzc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dze.a.forGetter(dzc::a), dzb.a.forGetter(dzc::b)).apply($$0, $$0.stable(dzc::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dze $$1, dzb $$2) {
      return a.encodeStart($$0, new dzc($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dze $$1, jx $$2) {
      return a($$0, $$1, new dzb($$2.d(lr.ba)));
   }

   public dze a() {
      return this.b;
   }

   public dzb b() {
      return this.c;
   }
}
