import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dys(dyu b, dyr c) {
   public static final Codec<dys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyu.a.forGetter(dys::a), dyr.a.forGetter(dys::b)).apply($$0, $$0.stable(dys::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyu $$1, dyr $$2) {
      return a.encodeStart($$0, new dys($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyu $$1, jw $$2) {
      return a($$0, $$1, new dyr($$2.d(lq.aT)));
   }

   public dyu a() {
      return this.b;
   }

   public dyr b() {
      return this.c;
   }
}
