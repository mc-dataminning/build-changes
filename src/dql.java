import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dql extends djz {
   public static final MapCodec<dql> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dql::new)
   );
   public static final dyl f = dyk.x;

   @Override
   public MapCodec<dql> a() {
      return e;
   }

   protected dql(dyj $$0, dxt.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dxu $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dxu a(dxu $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dhh $$0, jh $$1) {
      Class<? extends bvj> $$2 = switch (this.d.f()) {
         case a -> bvj.class;
         case b -> bwf.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f);
   }
}
