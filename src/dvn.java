import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvn(dvp b, dvm c) {
   public static final Codec<dvn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvp.a.forGetter(dvn::a), dvm.a.forGetter(dvn::b)).apply($$0, $$0.stable(dvn::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dvp $$1, dvm $$2) {
      return a.encodeStart($$0, new dvn($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dvp $$1, iz $$2) {
      return a($$0, $$1, new dvm($$2.d(ks.aP)));
   }

   public dvp a() {
      return this.b;
   }

   public dvm b() {
      return this.c;
   }
}
