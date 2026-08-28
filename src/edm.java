import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edm(edo b, edl c) {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edo.a.forGetter(edm::a), edl.a.forGetter(edm::b)).apply($$0, $$0.stable(edm::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edo $$1, edl $$2) {
      return a.encodeStart($$0, new edm($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edo $$1, kf $$2) {
      return a($$0, $$1, new edl($$2.e(mc.bf)));
   }

   public edo a() {
      return this.b;
   }

   public edl b() {
      return this.c;
   }
}
