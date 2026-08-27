import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egh(egk b, egk c) implements egk {
   public static final Codec<egh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egl.a.fieldOf("n").forGetter(egh::c), egl.a.fieldOf("p").forGetter(egh::d)).apply($$0, egh::new)
   );

   @Override
   public egj b() {
      return egl.d;
   }

   @Override
   public int a(ecq $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      asc $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ecq $$0) {
      return (float)this.a($$0);
   }

   public static egh a(int $$0, float $$1) {
      return new egh(egi.a((float)$$0), egi.a($$1));
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
