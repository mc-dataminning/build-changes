import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exo(exs b, exs c) implements exs {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ext.a.fieldOf("n").forGetter(exo::c), ext.a.fieldOf("p").forGetter(exo::d)).apply($$0, exo::new)
   );

   @Override
   public exr b() {
      return ext.d;
   }

   @Override
   public int a(etl $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azn $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(etl $$0) {
      return (float)this.a($$0);
   }

   public static exo a(int $$0, float $$1) {
      return new exo(exp.a((float)$$0), exp.a($$1));
   }

   @Override
   public Set<ewe<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public exs c() {
      return this.b;
   }

   public exs d() {
      return this.c;
   }
}
