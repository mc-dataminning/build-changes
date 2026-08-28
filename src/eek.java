import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eek(eem b, eej c) {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eem.a.forGetter(eek::a), eej.a.forGetter(eek::b)).apply($$0, $$0.stable(eek::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eem $$1, eej $$2) {
      return a.encodeStart($$0, new eek($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eem $$1, kf $$2) {
      return a($$0, $$1, new eej($$2.e(mc.bh)));
   }

   public eem a() {
      return this.b;
   }

   public eej b() {
      return this.c;
   }
}
