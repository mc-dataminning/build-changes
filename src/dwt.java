import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwt extends dma {
   public static final MapCodec<dwt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), ebd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dwt::new)
   );
   public static final ebo d = ebe.aW;
   private final int e;

   @Override
   public MapCodec<dwt> a() {
      return c;
   }

   protected dwt(int $$0, ebd $$1, ean.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(djh $$0, iv $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwi.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(eao $$0) {
      return $$0.c(d);
   }

   @Override
   protected eao a(eao $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d);
   }
}
