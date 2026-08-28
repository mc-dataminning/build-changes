import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezi(ezv b, evp c) implements eyz {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezw.a.fieldOf("value").forGetter(ezi::c), evp.a.fieldOf("range").forGetter(ezi::d)).apply($$0, ezi::new)
   );

   @Override
   public eza b() {
      return ezb.r;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(evq $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eyz.a a(ezv $$0, evp $$1) {
      return () -> new ezi($$0, $$1);
   }

   public ezv c() {
      return this.b;
   }

   public evp d() {
      return this.c;
   }
}
