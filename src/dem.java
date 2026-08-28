import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dem(deg d) implements deq {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dem::new));

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      cxp $$5 = $$2.a();
      if ($$5.b(ku.d) && $$5.b(ku.e)) {
         asi $$7 = $$2.c() instanceof asi $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public deg b() {
      return this.d;
   }
}
