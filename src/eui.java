import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eui(euv b, eqn c) implements etz {
   public static final MapCodec<eui> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euw.a.fieldOf("value").forGetter(eui::c), eqn.a.fieldOf("range").forGetter(eui::d)).apply($$0, eui::new)
   );

   @Override
   public eua b() {
      return eub.r;
   }

   @Override
   public Set<eth<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eqo $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static etz.a a(euv $$0, eqn $$1) {
      return () -> new eui($$0, $$1);
   }

   public euv c() {
      return this.b;
   }

   public eqn d() {
      return this.c;
   }
}
