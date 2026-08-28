import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnv extends dhm {
   public static final MapCodec<dnv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dnv::new)
   );
   public static final dvu f = dvt.w;

   @Override
   public MapCodec<dnv> a() {
      return e;
   }

   protected dnv(dvs $$0, dvc.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dvd $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dvd a(dvd $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dev $$0, jg $$1) {
      Class<? extends btz> $$2 = switch (this.d.f()) {
         case a -> btz.class;
         case b -> buv.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f);
   }
}
