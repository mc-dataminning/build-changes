import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dap extends cuh {
   public static final MapCodec<dap> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dap::new)
   );
   public static final dhn f = dhm.w;

   @Override
   public MapCodec<dap> a() {
      return e;
   }

   protected dap(dhl $$0, dgv.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dgw $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dgw a(dgw $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(crs $$0, ht $$1) {
      Class<? extends bki> $$2 = switch (this.d.e()) {
         case a -> bki.class;
         case b -> bky.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f);
   }
}
