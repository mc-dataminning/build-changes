import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyo(dyq b, dyn c) {
   public static final Codec<dyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyq.a.forGetter(dyo::a), dyn.a.forGetter(dyo::b)).apply($$0, $$0.stable(dyo::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyq $$1, dyn $$2) {
      return a.encodeStart($$0, new dyo($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyq $$1, jw $$2) {
      return a($$0, $$1, new dyn($$2.d(lq.aT)));
   }

   public dyq a() {
      return this.b;
   }

   public dyn b() {
      return this.c;
   }
}
