import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlw extends dfm {
   public static final MapCodec<dlw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dlw::new)
   );
   public static final dtt f = dts.w;

   @Override
   public MapCodec<dlw> a() {
      return e;
   }

   protected dlw(dtr $$0, dtb.d $$1) {
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
   protected int b(dcw $$0, jd $$1) {
      Class<? extends bsr> $$2 = switch (this.d.f()) {
         case a -> bsr.class;
         case b -> btn.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f);
   }
}
