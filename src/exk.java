import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exk(exo b, exo c) implements exo {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exp.a.fieldOf("n").forGetter(exk::c), exp.a.fieldOf("p").forGetter(exk::d)).apply($$0, exk::new)
   );

   @Override
   public exn b() {
      return exp.d;
   }

   @Override
   public int a(eth $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azl $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eth $$0) {
      return (float)this.a($$0);
   }

   public static exk a(int $$0, float $$1) {
      return new exk(exl.a((float)$$0), exl.a($$1));
   }

   @Override
   public Set<ewa<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public exo c() {
      return this.b;
   }

   public exo d() {
      return this.c;
   }
}
