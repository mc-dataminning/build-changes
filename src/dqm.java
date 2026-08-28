import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqm extends dka {
   public static final MapCodec<dqm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dqm::new)
   );
   public static final dym f = dyl.x;

   @Override
   public MapCodec<dqm> a() {
      return e;
   }

   protected dqm(dyk $$0, dxu.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dxv $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dxv a(dxv $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dhi $$0, jh $$1) {
      Class<? extends bvk> $$2 = switch (this.d.f()) {
         case a -> bvk.class;
         case b -> bwg.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f);
   }
}
