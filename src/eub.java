import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eub(eun b, eqh c) implements ets {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euo.a.fieldOf("value").forGetter(eub::c), eqh.a.fieldOf("range").forGetter(eub::d)).apply($$0, eub::new)
   );

   @Override
   public ett b() {
      return etu.t;
   }

   @Override
   public Set<etb<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqi $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static ets.a a(eun $$0, eqh $$1) {
      return () -> new eub($$0, $$1);
   }

   public eun c() {
      return this.b;
   }

   public eqh d() {
      return this.c;
   }
}
