import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlf extends dew {
   public static final MapCodec<dlf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dlf::new)
   );
   public static final dtc f = dtb.w;

   @Override
   public MapCodec<dlf> a() {
      return e;
   }

   protected dlf(dta $$0, dsk.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsl $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsl a(dsl $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dcg $$0, ja $$1) {
      Class<? extends bsh> $$2 = switch (this.d.f()) {
         case a -> bsh.class;
         case b -> btc.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f);
   }
}
