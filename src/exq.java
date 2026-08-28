import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exq(eyd b, etv c) implements exh {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eye.a.fieldOf("value").forGetter(exq::c), etv.a.fieldOf("range").forGetter(exq::d)).apply($$0, exq::new)
   );

   @Override
   public exi b() {
      return exj.r;
   }

   @Override
   public Set<ewp<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(etw $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static exh.a a(eyd $$0, etv $$1) {
      return () -> new exq($$0, $$1);
   }

   public eyd c() {
      return this.b;
   }

   public etv d() {
      return this.c;
   }
}
