import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnn(dnp b, dnm c) {
   public static final Codec<dnn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnp.a.forGetter(dnn::a), dnm.a.forGetter(dnn::b)).apply($$0, $$0.stable(dnn::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dnp $$1, dnm $$2) {
      return a.encodeStart($$0, new dnn($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dnp $$1, ip $$2) {
      return a($$0, $$1, new dnm($$2.d(jz.aK)));
   }

   public dnp a() {
      return this.b;
   }

   public dnm b() {
      return this.c;
   }
}
