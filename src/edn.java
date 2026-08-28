import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edn(edp b, edm c) {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edp.a.forGetter(edn::a), edm.a.forGetter(edn::b)).apply($$0, $$0.stable(edn::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edp $$1, edm $$2) {
      return a.encodeStart($$0, new edn($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, edp $$1, kf $$2) {
      return a($$0, $$1, new edm($$2.e(mc.bf)));
   }

   public edp a() {
      return this.b;
   }

   public edm b() {
      return this.c;
   }
}
