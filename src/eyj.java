import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyj(eyn b, eyn c) implements eyn {
   public static final MapCodec<eyj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyo.a.fieldOf("n").forGetter(eyj::c), eyo.a.fieldOf("p").forGetter(eyj::d)).apply($$0, eyj::new)
   );

   @Override
   public eym b() {
      return eyo.d;
   }

   @Override
   public int a(eug $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azv $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eug $$0) {
      return (float)this.a($$0);
   }

   public static eyj a(int $$0, float $$1) {
      return new eyj(eyk.a((float)$$0), eyk.a($$1));
   }

   @Override
   public Set<ewz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyn c() {
      return this.b;
   }

   public eyn d() {
      return this.c;
   }
}
