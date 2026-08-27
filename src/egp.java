import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egp(egm b, egm c) implements egm {
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egn.a.fieldOf("min").forGetter(egp::c), egn.a.fieldOf("max").forGetter(egp::d)).apply($$0, egp::new)
   );

   @Override
   public egl b() {
      return egn.c;
   }

   public static egp a(float $$0, float $$1) {
      return new egp(egk.a($$0), egk.a($$1));
   }

   @Override
   public int a(ecs $$0) {
      return ary.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ecs $$0) {
      return ary.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<efa<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public egm c() {
      return this.b;
   }

   public egm d() {
      return this.c;
   }
}
