import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkx extends deo {
   public static final MapCodec<dkx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dss.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dkx::new)
   );
   public static final dsu f = dst.w;

   @Override
   public MapCodec<dkx> a() {
      return e;
   }

   protected dkx(dss $$0, dsc.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsd $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsd a(dsd $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dbz $$0, iz $$1) {
      Class<? extends bsv> $$2 = switch (this.d.f()) {
         case a -> bsv.class;
         case b -> btq.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f);
   }
}
