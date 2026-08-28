import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dku extends del {
   public static final MapCodec<dku> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dku::new)
   );
   public static final dsr f = dsq.w;

   @Override
   public MapCodec<dku> a() {
      return e;
   }

   protected dku(dsp $$0, drz.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsa $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsa a(dsa $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dbw $$0, iz $$1) {
      Class<? extends bss> $$2 = switch (this.d.f()) {
         case a -> bss.class;
         case b -> btn.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f);
   }
}
