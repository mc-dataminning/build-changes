import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etf(eti b, eti c) implements eti {
   public static final MapCodec<etf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etj.a.fieldOf("n").forGetter(etf::c), etj.a.fieldOf("p").forGetter(etf::d)).apply($$0, etf::new)
   );

   @Override
   public eth b() {
      return etj.d;
   }

   @Override
   public int a(eph $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      aym $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eph $$0) {
      return (float)this.a($$0);
   }

   public static etf a(int $$0, float $$1) {
      return new etf(etg.a((float)$$0), etg.a($$1));
   }

   @Override
   public Set<erw<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eti c() {
      return this.b;
   }

   public eti d() {
      return this.c;
   }
}
