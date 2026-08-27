import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dxp(dxr b, dxo c) {
   public static final Codec<dxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxr.a.forGetter(dxp::a), dxo.a.forGetter(dxp::b)).apply($$0, $$0.stable(dxp::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dxr $$1, dxo $$2) {
      return a.encodeStart($$0, new dxp($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dxr $$1, jl $$2) {
      return a($$0, $$1, new dxo($$2.d(lf.aT)));
   }

   public dxr a() {
      return this.b;
   }

   public dxo b() {
      return this.c;
   }
}
