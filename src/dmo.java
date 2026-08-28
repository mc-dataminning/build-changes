import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmo extends dkd {
   public static final MapCodec<dmo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsf.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dmo::new)
   );
   private final bsf b;

   @Override
   public MapCodec<? extends dmo> a() {
      return a;
   }

   public dmo(bsf $$0, dxn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
