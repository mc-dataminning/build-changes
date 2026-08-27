import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekb(ejy b, ejy c) implements ejy {
   public static final Codec<ekb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejz.a.fieldOf("min").forGetter(ekb::c), ejz.a.fieldOf("max").forGetter(ekb::d)).apply($$0, ekb::new)
   );

   @Override
   public ejx b() {
      return ejz.c;
   }

   public static ekb a(float $$0, float $$1) {
      return new ekb(ejw.a($$0), ejw.a($$1));
   }

   @Override
   public int a(ege $$0) {
      return aty.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ege $$0) {
      return aty.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<eim<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ejy c() {
      return this.b;
   }

   public ejy d() {
      return this.c;
   }
}
