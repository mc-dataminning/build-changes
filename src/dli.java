import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dli(dlk b, dlh c) {
   public static final Codec<dli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlk.a.forGetter(dli::a), dlh.a.forGetter(dli::b)).apply($$0, $$0.stable(dli::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlk $$1, dlh $$2) {
      return a.encodeStart($$0, new dli($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlk $$1, hr $$2) {
      return a($$0, $$1, new dlh($$2.d(jc.aJ)));
   }

   public dlk a() {
      return this.b;
   }

   public dlh b() {
      return this.c;
   }
}
