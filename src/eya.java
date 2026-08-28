import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eya(eyn b, euf c) implements exr {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyo.a.fieldOf("value").forGetter(eya::c), euf.a.fieldOf("range").forGetter(eya::d)).apply($$0, eya::new)
   );

   @Override
   public exs b() {
      return ext.r;
   }

   @Override
   public Set<ewz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eug $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static exr.a a(eyn $$0, euf $$1) {
      return () -> new eya($$0, $$1);
   }

   public eyn c() {
      return this.b;
   }

   public euf d() {
      return this.c;
   }
}
