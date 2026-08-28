import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkw extends den {
   public static final MapCodec<dkw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dkw::new)
   );
   public static final dst f = dss.w;

   @Override
   public MapCodec<dkw> a() {
      return e;
   }

   protected dkw(dsr $$0, dsb.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsc $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsc a(dsc $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dby $$0, iz $$1) {
      Class<? extends bsu> $$2 = switch (this.d.f()) {
         case a -> bsu.class;
         case b -> btp.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f);
   }
}
