import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlc extends det {
   public static final MapCodec<dlc> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dlc::new)
   );
   public static final dsy f = dsx.w;

   @Override
   public MapCodec<dlc> a() {
      return e;
   }

   protected dlc(dsw $$0, dsg.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dsh $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dsh a(dsh $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dcd $$0, ja $$1) {
      Class<? extends bsd> $$2 = switch (this.d.f()) {
         case a -> bsd.class;
         case b -> bsy.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f);
   }
}
