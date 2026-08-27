import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dvw(dvy b, dvv c) {
   public static final Codec<dvw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvy.a.forGetter(dvw::a), dvv.a.forGetter(dvw::b)).apply($$0, $$0.stable(dvw::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dvy $$1, dvv $$2) {
      return a.encodeStart($$0, new dvw($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dvy $$1, jb $$2) {
      return a($$0, $$1, new dvv($$2.d(ku.aQ)));
   }

   public dvy a() {
      return this.b;
   }

   public dvv b() {
      return this.c;
   }
}
