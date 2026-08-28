import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe extends djs {
   public static final MapCodec<dqe> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dqe::new)
   );
   public static final dye f = dyd.x;

   @Override
   public MapCodec<dqe> a() {
      return e;
   }

   protected dqe(dyc $$0, dxm.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dxn $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dxn a(dxn $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dha $$0, jh $$1) {
      Class<? extends bvf> $$2 = switch (this.d.f()) {
         case a -> bvf.class;
         case b -> bwb.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f);
   }
}
