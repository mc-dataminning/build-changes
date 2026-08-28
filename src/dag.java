import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dag(czt d) implements dac {
   public static final MapCodec<dag> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czt.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dag::new));

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public czt b() {
      return this.d;
   }
}
