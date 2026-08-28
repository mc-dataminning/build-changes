import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdq(fdm b, fdm c) implements fdm {
   public static final MapCodec<fdq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdn.a.fieldOf("min").forGetter(fdq::c), fdn.a.fieldOf("max").forGetter(fdq::d)).apply($$0, fdq::new)
   );

   @Override
   public fdl b() {
      return fdn.c;
   }

   public static fdq a(float $$0, float $$1) {
      return new fdq(fdj.a($$0), fdj.a($$1));
   }

   @Override
   public int a(ezh $$0) {
      return azm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ezh $$0) {
      return azm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fdm c() {
      return this.b;
   }

   public fdm d() {
      return this.c;
   }
}
