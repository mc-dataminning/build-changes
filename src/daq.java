import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daq(daj d) implements das {
   public static final MapCodec<daq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, daq::new));

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exa $$4) {
      aqv $$6 = $$2.c() instanceof aqv $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public daj b() {
      return this.d;
   }
}
