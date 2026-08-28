import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eib(eid b, eia c) {
   public static final Codec<eib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eid.a.forGetter(eib::a), eia.a.forGetter(eib::b)).apply($$0, $$0.stable(eib::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eid $$1, eia $$2) {
      return a.encodeStart($$0, new eib($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eid $$1, ju $$2) {
      return a($$0, $$1, new eia($$2.f(mi.bq)));
   }

   public eid a() {
      return this.b;
   }

   public eia b() {
      return this.c;
   }
}
