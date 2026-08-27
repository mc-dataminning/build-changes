import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dld(dlf b, dlc c) {
   public static final Codec<dld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlf.a.forGetter(dld::a), dlc.a.forGetter(dld::b)).apply($$0, $$0.stable(dld::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlf $$1, dlc $$2) {
      return a.encodeStart($$0, new dld($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlf $$1, ht $$2) {
      return a($$0, $$1, new dlc($$2.d(jd.aI)));
   }

   public dlf a() {
      return this.b;
   }

   public dlc b() {
      return this.c;
   }
}
