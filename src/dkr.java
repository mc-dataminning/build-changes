import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkr extends dei {
   public static final MapCodec<dkr> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dkr::new)
   );
   public static final dso f = dsn.w;

   @Override
   public MapCodec<dkr> a() {
      return e;
   }

   protected dkr(dsm $$0, drw.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(drx $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected drx a(drx $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dbt $$0, iz $$1) {
      Class<? extends bsp> $$2 = switch (this.d.f()) {
         case a -> bsp.class;
         case b -> btk.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f);
   }
}
