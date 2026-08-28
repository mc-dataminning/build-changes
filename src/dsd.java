import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsd extends dlo {
   public static final MapCodec<dsd> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dsd::new)
   );
   public static final eaq d = eap.A;

   @Override
   public MapCodec<dsd> a() {
      return c;
   }

   protected dsd(eao $$0, dzy.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dzz $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dzz a(dzz $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(div $$0, iu $$1) {
      Class<? extends bwd> $$2 = switch (this.b.f()) {
         case a -> bwd.class;
         case b -> bxc.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d);
   }
}
