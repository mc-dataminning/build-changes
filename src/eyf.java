import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyf(eyj b, eyj c) implements eyj {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyk.a.fieldOf("n").forGetter(eyf::c), eyk.a.fieldOf("p").forGetter(eyf::d)).apply($$0, eyf::new)
   );

   @Override
   public eyi b() {
      return eyk.d;
   }

   @Override
   public int a(euc $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azs $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(euc $$0) {
      return (float)this.a($$0);
   }

   public static eyf a(int $$0, float $$1) {
      return new eyf(eyg.a((float)$$0), eyg.a($$1));
   }

   @Override
   public Set<ewv<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyj c() {
      return this.b;
   }

   public eyj d() {
      return this.c;
   }
}
