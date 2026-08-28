import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(dck d) implements dcu {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dcs::new));

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      arq $$6 = $$2.c() instanceof arq $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public dck b() {
      return this.d;
   }
}
