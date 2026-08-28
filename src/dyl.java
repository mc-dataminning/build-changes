import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyl(dyn b, dyk c) {
   public static final Codec<dyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyn.a.forGetter(dyl::a), dyk.a.forGetter(dyl::b)).apply($$0, $$0.stable(dyl::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyn $$1, dyk $$2) {
      return a.encodeStart($$0, new dyl($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyn $$1, jw $$2) {
      return a($$0, $$1, new dyk($$2.d(lq.aT)));
   }

   public dyn a() {
      return this.b;
   }

   public dyk b() {
      return this.c;
   }
}
