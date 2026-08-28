import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dol extends dma {
   public static final MapCodec<dol> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btg.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dol::new)
   );
   private final btg b;

   @Override
   public MapCodec<? extends dol> a() {
      return a;
   }

   public dol(btg $$0, dzy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
