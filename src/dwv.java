import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwv(dwx b, dwu c) {
   public static final Codec<dwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwx.a.forGetter(dwv::a), dwu.a.forGetter(dwv::b)).apply($$0, $$0.stable(dwv::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dwx $$1, dwu $$2) {
      return a.encodeStart($$0, new dwv($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dwx $$1, jk $$2) {
      return a($$0, $$1, new dwu($$2.d(le.aT)));
   }

   public dwx a() {
      return this.b;
   }

   public dwu b() {
      return this.c;
   }
}
