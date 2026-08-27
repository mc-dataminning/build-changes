import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dig(dii b, dif c) {
   public static final Codec<dig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dii.a.forGetter(dig::a), dif.a.forGetter(dig::b)).apply($$0, $$0.stable(dig::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dii $$1, dif $$2) {
      return a.encodeStart($$0, new dig($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dii $$1, hs $$2) {
      return a($$0, $$1, new dif($$2.d(jc.aI)));
   }

   public dii a() {
      return this.b;
   }

   public dif b() {
      return this.c;
   }
}
