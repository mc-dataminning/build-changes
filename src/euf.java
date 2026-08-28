import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euf(eui b, eui c) implements eui {
   public static final MapCodec<euf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euj.a.fieldOf("n").forGetter(euf::c), euj.a.fieldOf("p").forGetter(euf::d)).apply($$0, euf::new)
   );

   @Override
   public euh b() {
      return euj.d;
   }

   @Override
   public int a(eqd $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azc $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eqd $$0) {
      return (float)this.a($$0);
   }

   public static euf a(int $$0, float $$1) {
      return new euf(eug.a((float)$$0), eug.a($$1));
   }

   @Override
   public Set<esw<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eui c() {
      return this.b;
   }

   public eui d() {
      return this.c;
   }
}
