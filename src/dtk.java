import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtk(dtm b, dtj c) {
   public static final Codec<dtk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtm.a.forGetter(dtk::a), dtj.a.forGetter(dtk::b)).apply($$0, $$0.stable(dtk::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dtm $$1, dtj $$2) {
      return a.encodeStart($$0, new dtk($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dtm $$1, iz $$2) {
      return a($$0, $$1, new dtj($$2.d(kj.aO)));
   }

   public dtm a() {
      return this.b;
   }

   public dtj b() {
      return this.c;
   }
}
