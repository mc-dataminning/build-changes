import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dzb(dzd b, dza c) {
   public static final Codec<dzb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzd.a.forGetter(dzb::a), dza.a.forGetter(dzb::b)).apply($$0, $$0.stable(dzb::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzd $$1, dza $$2) {
      return a.encodeStart($$0, new dzb($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dzd $$1, jx $$2) {
      return a($$0, $$1, new dza($$2.d(lr.ba)));
   }

   public dzd a() {
      return this.b;
   }

   public dza b() {
      return this.c;
   }
}
