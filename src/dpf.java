import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpf(dph b, dpe c) {
   public static final Codec<dpf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dph.a.forGetter(dpf::a), dpe.a.forGetter(dpf::b)).apply($$0, $$0.stable(dpf::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dph $$1, dpe $$2) {
      return a.encodeStart($$0, new dpf($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dph $$1, iu $$2) {
      return a($$0, $$1, new dpe($$2.d(ke.aN)));
   }

   public dph a() {
      return this.b;
   }

   public dpe b() {
      return this.c;
   }
}
