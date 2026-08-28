import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eke extends ekb {
   protected final long c;
   protected final esa.a d;
   protected final float e;
   protected final esa f;

   protected static <P extends eke> P3<Mu<P>, Long, esa.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         esa.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayh.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected eke(long $$0, esa.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = esa.b(new edp(new ecr($$0)), $$1);
   }

   protected double a(ji $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
