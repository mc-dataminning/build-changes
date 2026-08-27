import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djx extends ddo {
   public static final MapCodec<djx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, djx::new)
   );
   public static final dru f = drt.w;

   @Override
   public MapCodec<djx> a() {
      return e;
   }

   protected djx(drs $$0, drc.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(drd $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected drd a(drd $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(daz $$0, io $$1) {
      Class<? extends brw> $$2 = switch (this.d.f()) {
         case a -> brw.class;
         case b -> bsq.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f);
   }
}
