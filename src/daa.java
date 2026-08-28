import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daa(czt d) implements dac {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, daa::new));

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      aqn $$6 = $$2.c() instanceof aqn $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public czt b() {
      return this.d;
   }
}
