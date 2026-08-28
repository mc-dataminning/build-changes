import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eas(eau b, ear c) {
   public static final Codec<eas> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eau.a.forGetter(eas::a), ear.a.forGetter(eas::b)).apply($$0, $$0.stable(eas::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eau $$1, ear $$2) {
      return a.encodeStart($$0, new eas($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eau $$1, kb $$2) {
      return a($$0, $$1, new ear($$2.d(lv.bb)));
   }

   public eau a() {
      return this.b;
   }

   public ear b() {
      return this.c;
   }
}
