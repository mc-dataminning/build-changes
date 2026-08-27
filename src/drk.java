import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drk(drm b, drj c) {
   public static final Codec<drk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drm.a.forGetter(drk::a), drj.a.forGetter(drk::b)).apply($$0, $$0.stable(drk::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, drm $$1, drj $$2) {
      return a.encodeStart($$0, new drk($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, drm $$1, iw $$2) {
      return a($$0, $$1, new drj($$2.d(kg.aN)));
   }

   public drm a() {
      return this.b;
   }

   public drj b() {
      return this.c;
   }
}
