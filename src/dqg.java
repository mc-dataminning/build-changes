import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg extends djs {
   public static final MapCodec<dqg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dqg::new)
   );
   public static final dyh d = dyg.A;

   @Override
   public MapCodec<dqg> a() {
      return c;
   }

   protected dqg(dyf $$0, dxp.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dxq $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dxq a(dxq $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dgz $$0, ji $$1) {
      Class<? extends bva> $$2 = switch (this.b.f()) {
         case a -> bva.class;
         case b -> bvy.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d);
   }
}
