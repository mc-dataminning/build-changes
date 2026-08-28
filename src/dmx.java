import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmx extends dkl {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsn.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dmx::new)
   );
   private final bsn b;

   @Override
   public MapCodec<? extends dmx> a() {
      return a;
   }

   public dmx(bsn $$0, dxt.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
