import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euo(evb b, eqt c) implements euf {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evc.a.fieldOf("value").forGetter(euo::c), eqt.a.fieldOf("range").forGetter(euo::d)).apply($$0, euo::new)
   );

   @Override
   public eug b() {
      return euh.r;
   }

   @Override
   public Set<etn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(equ $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static euf.a a(evb $$0, eqt $$1) {
      return () -> new euo($$0, $$1);
   }

   public evb c() {
      return this.b;
   }

   public eqt d() {
      return this.c;
   }
}
