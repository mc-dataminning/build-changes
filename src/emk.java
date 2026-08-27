import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emk(emw b, ejb c) implements emb {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emx.a.fieldOf("value").forGetter(emk::c), ejb.a.fieldOf("range").forGetter(emk::d)).apply($$0, emk::new)
   );

   @Override
   public emc b() {
      return emd.s;
   }

   @Override
   public Set<elk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ejc $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static emb.a a(emw $$0, ejb $$1) {
      return () -> new emk($$0, $$1);
   }

   public emw c() {
      return this.b;
   }

   public ejb d() {
      return this.c;
   }
}
