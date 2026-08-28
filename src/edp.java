import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edp(edr b, edo c) {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edr.a.forGetter(edp::a), edo.a.forGetter(edp::b)).apply($$0, $$0.stable(edp::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edr $$1, edo $$2) {
      return a.encodeStart($$0, new edp($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edr $$1, kf $$2) {
      return a($$0, $$1, new edo($$2.e(mc.bf)));
   }

   public edr a() {
      return this.b;
   }

   public edo b() {
      return this.c;
   }
}
