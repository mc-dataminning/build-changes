import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlq(dls b, dlp c) {
   public static final Codec<dlq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dls.a.forGetter(dlq::a), dlp.a.forGetter(dlq::b)).apply($$0, $$0.stable(dlq::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dls $$1, dlp $$2) {
      return a.encodeStart($$0, new dlq($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dls $$1, hu $$2) {
      return a($$0, $$1, new dlp($$2.d(je.aI)));
   }

   public dls a() {
      return this.b;
   }

   public dlp b() {
      return this.c;
   }
}
