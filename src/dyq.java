import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyq(dys b, dyp c) {
   public static final Codec<dyq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dys.a.forGetter(dyq::a), dyp.a.forGetter(dyq::b)).apply($$0, $$0.stable(dyq::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dys $$1, dyp $$2) {
      return a.encodeStart($$0, new dyq($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dys $$1, jw $$2) {
      return a($$0, $$1, new dyp($$2.d(lq.aT)));
   }

   public dys a() {
      return this.b;
   }

   public dyp b() {
      return this.c;
   }
}
