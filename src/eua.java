import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eua(eum b, eqg c) implements etr {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eun.a.fieldOf("value").forGetter(eua::c), eqg.a.fieldOf("range").forGetter(eua::d)).apply($$0, eua::new)
   );

   @Override
   public ets b() {
      return ett.t;
   }

   @Override
   public Set<eta<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqh $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static etr.a a(eum $$0, eqg $$1) {
      return () -> new eua($$0, $$1);
   }

   public eum c() {
      return this.b;
   }

   public eqg d() {
      return this.c;
   }
}
