import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpm(dpo b, dpl c) {
   public static final Codec<dpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpo.a.forGetter(dpm::a), dpl.a.forGetter(dpm::b)).apply($$0, $$0.stable(dpm::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dpo $$1, dpl $$2) {
      return a.encodeStart($$0, new dpm($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dpo $$1, iu $$2) {
      return a($$0, $$1, new dpl($$2.d(ke.aN)));
   }

   public dpo a() {
      return this.b;
   }

   public dpl b() {
      return this.c;
   }
}
