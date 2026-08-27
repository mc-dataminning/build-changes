import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ega(egm b, ecr c) implements efr {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egn.a.fieldOf("value").forGetter(ega::c), ecr.a.fieldOf("range").forGetter(ega::d)).apply($$0, ega::new)
   );

   @Override
   public efs b() {
      return eft.s;
   }

   @Override
   public Set<efa<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(ecs $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static efr.a a(egm $$0, ecr $$1) {
      return () -> new ega($$0, $$1);
   }

   public egm c() {
      return this.b;
   }

   public ecr d() {
      return this.c;
   }
}
