import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpm extends diy {
   public static final MapCodec<dpm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dpm::new)
   );
   public static final dxm f = dxl.B;

   @Override
   public MapCodec<dpm> a() {
      return e;
   }

   protected dpm(dxk $$0, dwu.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dwv $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dwv a(dwv $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dgg $$0, ji $$1) {
      Class<? extends buj> $$2 = switch (this.d.f()) {
         case a -> buj.class;
         case b -> bvf.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f);
   }
}
