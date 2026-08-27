import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlo(dlq b, dln c) {
   public static final Codec<dlo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlq.a.forGetter(dlo::a), dln.a.forGetter(dlo::b)).apply($$0, $$0.stable(dlo::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlq $$1, dln $$2) {
      return a.encodeStart($$0, new dlo($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlq $$1, hu $$2) {
      return a($$0, $$1, new dln($$2.d(je.aI)));
   }

   public dlq a() {
      return this.b;
   }

   public dln b() {
      return this.c;
   }
}
