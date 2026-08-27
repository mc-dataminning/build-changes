import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dti(dtk b, dth c) {
   public static final Codec<dti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtk.a.forGetter(dti::a), dth.a.forGetter(dti::b)).apply($$0, $$0.stable(dti::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dtk $$1, dth $$2) {
      return a.encodeStart($$0, new dti($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dtk $$1, iz $$2) {
      return a($$0, $$1, new dth($$2.d(kj.aO)));
   }

   public dtk a() {
      return this.b;
   }

   public dth b() {
      return this.c;
   }
}
