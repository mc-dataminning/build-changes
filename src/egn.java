import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egn(egk b, egk c) implements egk {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egl.a.fieldOf("min").forGetter(egn::c), egl.a.fieldOf("max").forGetter(egn::d)).apply($$0, egn::new)
   );

   @Override
   public egj b() {
      return egl.c;
   }

   public static egn a(float $$0, float $$1) {
      return new egn(egi.a($$0), egi.a($$1));
   }

   @Override
   public int a(ecq $$0) {
      return arx.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ecq $$0) {
      return arx.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eey<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public egk c() {
      return this.b;
   }

   public egk d() {
      return this.c;
   }
}
