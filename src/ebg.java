import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebg(ebi b, ebf c) {
   public static final Codec<ebg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebi.a.forGetter(ebg::a), ebf.a.forGetter(ebg::b)).apply($$0, $$0.stable(ebg::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ebi $$1, ebf $$2) {
      return a.encodeStart($$0, new ebg($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ebi $$1, kb $$2) {
      return a($$0, $$1, new ebf($$2.d(lv.bc)));
   }

   public ebi a() {
      return this.b;
   }

   public ebf b() {
      return this.c;
   }
}
