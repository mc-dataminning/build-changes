import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpu(dpw b, dpt c) {
   public static final Codec<dpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpw.a.forGetter(dpu::a), dpt.a.forGetter(dpu::b)).apply($$0, $$0.stable(dpu::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dpw $$1, dpt $$2) {
      return a.encodeStart($$0, new dpu($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dpw $$1, iu $$2) {
      return a($$0, $$1, new dpt($$2.d(ke.aN)));
   }

   public dpw a() {
      return this.b;
   }

   public dpt b() {
      return this.c;
   }
}
