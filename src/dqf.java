import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqf extends djr {
   public static final MapCodec<dqf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dqf::new)
   );
   public static final dyf f = dye.B;

   @Override
   public MapCodec<dqf> a() {
      return e;
   }

   protected dqf(dyd $$0, dxn.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dxo $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dxo a(dxo $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dgz $$0, jh $$1) {
      Class<? extends bvb> $$2 = switch (this.d.f()) {
         case a -> bvb.class;
         case b -> bvx.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f);
   }
}
