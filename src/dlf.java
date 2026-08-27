import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlf(dlh b, dle c) {
   public static final Codec<dlf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlh.a.forGetter(dlf::a), dle.a.forGetter(dlf::b)).apply($$0, $$0.stable(dlf::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlh $$1, dle $$2) {
      return a.encodeStart($$0, new dlf($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dlh $$1, hs $$2) {
      return a($$0, $$1, new dle($$2.d(jc.aI)));
   }

   public dlh a() {
      return this.b;
   }

   public dle b() {
      return this.c;
   }
}
