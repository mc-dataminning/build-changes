import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzq(dzs b, dzp c) {
   public static final Codec<dzq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzs.a.forGetter(dzq::a), dzp.a.forGetter(dzq::b)).apply($$0, $$0.stable(dzq::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzs $$1, dzp $$2) {
      return a.encodeStart($$0, new dzq($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzs $$1, jo $$2) {
      return a($$0, $$1, new dzp($$2.d(li.aT)));
   }

   public dzs a() {
      return this.b;
   }

   public dzp b() {
      return this.c;
   }
}
