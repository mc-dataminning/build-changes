import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxr(dxt b, dxq c) {
   public static final Codec<dxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxt.a.forGetter(dxr::a), dxq.a.forGetter(dxr::b)).apply($$0, $$0.stable(dxr::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dxt $$1, dxq $$2) {
      return a.encodeStart($$0, new dxr($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dxt $$1, jl $$2) {
      return a($$0, $$1, new dxq($$2.d(lf.aT)));
   }

   public dxt a() {
      return this.b;
   }

   public dxq b() {
      return this.c;
   }
}
