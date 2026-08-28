import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efh(efj b, efg c) {
   public static final Codec<efh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efj.a.forGetter(efh::a), efg.a.forGetter(efh::b)).apply($$0, $$0.stable(efh::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, efj $$1, efg $$2) {
      return a.encodeStart($$0, new efh($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, efj $$1, kg $$2) {
      return a($$0, $$1, new efg($$2.f(me.bm)));
   }

   public efj a() {
      return this.b;
   }

   public efg b() {
      return this.c;
   }
}
