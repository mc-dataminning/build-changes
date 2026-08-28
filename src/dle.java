import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dle extends dev {
   public static final MapCodec<dle> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsz.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dle::new)
   );
   public static final dtb f = dta.w;

   @Override
   public MapCodec<dle> a() {
      return e;
   }

   protected dle(dsz $$0, dsj.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsk $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsk a(dsk $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dcf $$0, ja $$1) {
      Class<? extends bsg> $$2 = switch (this.d.f()) {
         case a -> bsg.class;
         case b -> btb.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f);
   }
}
