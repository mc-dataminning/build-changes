import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcy(dck d) implements dcu {
   public static final MapCodec<dcy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dcy::new));

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dck b() {
      return this.d;
   }
}
