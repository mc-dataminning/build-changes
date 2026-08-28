import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsq extends dma {
   public static final MapCodec<dsq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dsq::new)
   );
   public static final ebf d = ebe.A;

   @Override
   public MapCodec<dsq> a() {
      return c;
   }

   protected dsq(ebd $$0, ean.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(eao $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected eao a(eao $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(djh $$0, iv $$1) {
      Class<? extends bwi> $$2 = switch (this.b.f()) {
         case a -> bwi.class;
         case b -> bxj.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d);
   }
}
