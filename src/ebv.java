import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebv(ebx b, ebu c) {
   public static final Codec<ebv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebx.a.forGetter(ebv::a), ebu.a.forGetter(ebv::b)).apply($$0, $$0.stable(ebv::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ebx $$1, ebu $$2) {
      return a.encodeStart($$0, new ebv($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ebx $$1, kd $$2) {
      return a($$0, $$1, new ebu($$2.e(ly.bc)));
   }

   public ebx a() {
      return this.b;
   }

   public ebu b() {
      return this.c;
   }
}
