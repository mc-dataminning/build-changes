import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eng(ens b, ejx c) implements emx {
   public static final Codec<eng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ent.a.fieldOf("value").forGetter(eng::c), ejx.a.fieldOf("range").forGetter(eng::d)).apply($$0, eng::new)
   );

   @Override
   public emy b() {
      return emz.s;
   }

   @Override
   public Set<emg<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ejy $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static emx.a a(ens $$0, ejx $$1) {
      return () -> new eng($$0, $$1);
   }

   public ens c() {
      return this.b;
   }

   public ejx d() {
      return this.c;
   }
}
