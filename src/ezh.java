import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezh(ezu b, evo c) implements eyy {
   public static final MapCodec<ezh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezv.a.fieldOf("value").forGetter(ezh::c), evo.a.fieldOf("range").forGetter(ezh::d)).apply($$0, ezh::new)
   );

   @Override
   public eyz b() {
      return eza.r;
   }

   @Override
   public Set<bah<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(evp $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eyy.a a(ezu $$0, evo $$1) {
      return () -> new ezh($$0, $$1);
   }

   public ezu c() {
      return this.b;
   }

   public evo d() {
      return this.c;
   }
}
