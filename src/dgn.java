import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgn(dgh d) implements dgr {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dgn::new));

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      czn $$5 = $$2.a();
      if ($$5.c(kk.d) && $$5.c(kk.e)) {
         arr $$7 = $$2.c() instanceof arr $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgh b() {
      return this.d;
   }
}
