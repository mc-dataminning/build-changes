import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record env(ens b, ens c) implements ens {
   public static final Codec<env> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ent.a.fieldOf("min").forGetter(env::c), ent.a.fieldOf("max").forGetter(env::d)).apply($$0, env::new)
   );

   @Override
   public enr b() {
      return ent.c;
   }

   public static env a(float $$0, float $$1) {
      return new env(enq.a($$0), enq.a($$1));
   }

   @Override
   public int a(ejy $$0) {
      return awm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ejy $$0) {
      return awm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<emg<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ens c() {
      return this.b;
   }

   public ens d() {
      return this.c;
   }
}
