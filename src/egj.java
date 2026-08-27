import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egj(egm b, egm c) implements egm {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egn.a.fieldOf("n").forGetter(egj::c), egn.a.fieldOf("p").forGetter(egj::d)).apply($$0, egj::new)
   );

   @Override
   public egl b() {
      return egn.d;
   }

   @Override
   public int a(ecs $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ase $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ecs $$0) {
      return (float)this.a($$0);
   }

   public static egj a(int $$0, float $$1) {
      return new egj(egk.a((float)$$0), egk.a($$1));
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
