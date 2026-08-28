import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezk(ezx b, evr c) implements ezb {
   public static final MapCodec<ezk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezy.a.fieldOf("value").forGetter(ezk::c), evr.a.fieldOf("range").forGetter(ezk::d)).apply($$0, ezk::new)
   );

   @Override
   public ezc b() {
      return ezd.r;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(evs $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ezb.a a(ezx $$0, evr $$1) {
      return () -> new ezk($$0, $$1);
   }

   public ezx c() {
      return this.b;
   }

   public evr d() {
      return this.c;
   }
}
