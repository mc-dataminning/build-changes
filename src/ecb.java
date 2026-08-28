import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecb(ecd b, eca c) {
   public static final Codec<ecb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecd.a.forGetter(ecb::a), eca.a.forGetter(ecb::b)).apply($$0, $$0.stable(ecb::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ecd $$1, eca $$2) {
      return a.encodeStart($$0, new ecb($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ecd $$1, ke $$2) {
      return a($$0, $$1, new eca($$2.e(lz.bc)));
   }

   public ecd a() {
      return this.b;
   }

   public eca b() {
      return this.c;
   }
}
