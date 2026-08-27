import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbb extends cut {
   public static final MapCodec<dbb> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dbb::new)
   );
   public static final die f = did.w;

   @Override
   public MapCodec<dbb> a() {
      return e;
   }

   protected dbb(dic $$0, dhm.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dhn $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dhn a(dhn $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(csf $$0, hx $$1) {
      Class<? extends bkv> $$2 = switch (this.d.e()) {
         case a -> bkv.class;
         case b -> bll.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f);
   }
}
