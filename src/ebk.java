import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebk(ebm b, ebj c) {
   public static final Codec<ebk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebm.a.forGetter(ebk::a), ebj.a.forGetter(ebk::b)).apply($$0, $$0.stable(ebk::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ebm $$1, ebj $$2) {
      return a.encodeStart($$0, new ebk($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ebm $$1, kc $$2) {
      return a($$0, $$1, new ebj($$2.e(lw.bd)));
   }

   public ebm a() {
      return this.b;
   }

   public ebj b() {
      return this.c;
   }
}
