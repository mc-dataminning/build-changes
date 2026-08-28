import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyp(dyr b, dyo c) {
   public static final Codec<dyp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyr.a.forGetter(dyp::a), dyo.a.forGetter(dyp::b)).apply($$0, $$0.stable(dyp::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyr $$1, dyo $$2) {
      return a.encodeStart($$0, new dyp($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyr $$1, jw $$2) {
      return a($$0, $$1, new dyo($$2.d(lq.aT)));
   }

   public dyr a() {
      return this.b;
   }

   public dyo b() {
      return this.c;
   }
}
