import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwe extends dlo {
   public static final MapCodec<dwe> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), eao.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dwe::new)
   );
   public static final eaz d = eap.aW;
   private final int e;

   @Override
   public MapCodec<dwe> a() {
      return c;
   }

   protected dwe(int $$0, eao $$1, dzy.d $$2) {
      super($$2, $$1);
      this.l(this.B.b().b(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(div $$0, iu $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bwd.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return azm.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(dzz $$0) {
      return $$0.c(d);
   }

   @Override
   protected dzz a(dzz $$0, int $$1) {
      return $$0.b(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d);
   }
}
