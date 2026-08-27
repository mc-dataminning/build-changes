import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record drr(drt b, drq c) {
   public static final Codec<drr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drt.a.forGetter(drr::a), drq.a.forGetter(drr::b)).apply($$0, $$0.stable(drr::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, drt $$1, drq $$2) {
      return a.encodeStart($$0, new drr($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, drt $$1, iw $$2) {
      return a($$0, $$1, new drq($$2.d(kg.aN)));
   }

   public drt a() {
      return this.b;
   }

   public drq b() {
      return this.c;
   }
}
