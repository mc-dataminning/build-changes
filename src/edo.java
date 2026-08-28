import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edo(edq b, edn c) {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edq.a.forGetter(edo::a), edn.a.forGetter(edo::b)).apply($$0, $$0.stable(edo::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edq $$1, edn $$2) {
      return a.encodeStart($$0, new edo($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edq $$1, kf $$2) {
      return a($$0, $$1, new edn($$2.e(mc.bf)));
   }

   public edq a() {
      return this.b;
   }

   public edn b() {
      return this.c;
   }
}
