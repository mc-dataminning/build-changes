import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dky extends dep {
   public static final MapCodec<dky> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dst.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dky::new)
   );
   public static final dsv f = dsu.w;

   @Override
   public MapCodec<dky> a() {
      return e;
   }

   protected dky(dst $$0, dsd.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dse $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dse a(dse $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dca $$0, iz $$1) {
      Class<? extends bsw> $$2 = switch (this.d.f()) {
         case a -> bsw.class;
         case b -> btr.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f);
   }
}
