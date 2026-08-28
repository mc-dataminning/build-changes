import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpn extends diz {
   public static final MapCodec<dpn> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dpn::new)
   );
   public static final dxn f = dxm.B;

   @Override
   public MapCodec<dpn> a() {
      return e;
   }

   protected dpn(dxl $$0, dwv.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dww $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dww a(dww $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dgh $$0, ji $$1) {
      Class<? extends buk> $$2 = switch (this.d.f()) {
         case a -> buk.class;
         case b -> bvg.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f);
   }
}
