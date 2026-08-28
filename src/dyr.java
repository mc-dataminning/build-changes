import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyr(dyt b, dyq c) {
   public static final Codec<dyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyt.a.forGetter(dyr::a), dyq.a.forGetter(dyr::b)).apply($$0, $$0.stable(dyr::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyt $$1, dyq $$2) {
      return a.encodeStart($$0, new dyr($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyt $$1, jw $$2) {
      return a($$0, $$1, new dyq($$2.d(lq.aT)));
   }

   public dyt a() {
      return this.b;
   }

   public dyq b() {
      return this.c;
   }
}
