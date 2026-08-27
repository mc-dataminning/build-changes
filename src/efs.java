import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efs(ege b, ecj c) implements efj {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egf.a.fieldOf("value").forGetter(efs::c), ecj.a.fieldOf("range").forGetter(efs::d)).apply($$0, efs::new)
   );

   @Override
   public efk b() {
      return efl.s;
   }

   @Override
   public Set<ees<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(eck $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static efj.a a(ege $$0, ecj $$1) {
      return () -> new efs($$0, $$1);
   }

   public ege c() {
      return this.b;
   }

   public ecj d() {
      return this.c;
   }
}
