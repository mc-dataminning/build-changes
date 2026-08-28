import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddn(ddh d) implements ddr {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddh.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, ddn::new));

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      cwq $$5 = $$2.a();
      if ($$5.b(kv.d) && $$5.b(kv.e)) {
         are $$7 = $$2.c() instanceof are $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public ddh b() {
      return this.d;
   }
}
