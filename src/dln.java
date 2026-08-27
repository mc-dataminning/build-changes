import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dln extends dep {
   public static final MapCodec<dln> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dln::new)
   );
   public static final dtt f = dts.w;

   @Override
   public MapCodec<dln> a() {
      return e;
   }

   protected dln(dtr $$0, dtb.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dtc $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dtc a(dtc $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dca $$0, ir $$1) {
      Class<? extends brv> $$2 = switch (this.d.f()) {
         case a -> brv.class;
         case b -> bso.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f);
   }
}
