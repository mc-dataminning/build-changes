import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czz(czs d) implements dab {
   public static final MapCodec<czz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, czz::new));

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      aqn $$6 = $$2.c() instanceof aqn $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2::d);
   }

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   public czs b() {
      return this.d;
   }
}
