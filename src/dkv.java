import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkv extends dem {
   public static final MapCodec<dkv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dkv::new)
   );
   public static final dss f = dsr.w;

   @Override
   public MapCodec<dkv> a() {
      return e;
   }

   protected dkv(dsq $$0, dsa.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsb $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsb a(dsb $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dbx $$0, iz $$1) {
      Class<? extends bst> $$2 = switch (this.d.f()) {
         case a -> bst.class;
         case b -> bto.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f);
   }
}
