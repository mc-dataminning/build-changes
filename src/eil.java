import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eil(ein b, eik c) {
   public static final Codec<eil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ein.a.forGetter(eil::a), eik.a.forGetter(eil::b)).apply($$0, $$0.stable(eil::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ein $$1, eik $$2) {
      return a.encodeStart($$0, new eil($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ein $$1, ju $$2) {
      return a($$0, $$1, new eik($$2.f(mi.bq)));
   }

   public ein a() {
      return this.b;
   }

   public eik b() {
      return this.c;
   }
}
