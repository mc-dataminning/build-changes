import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends dki {
   public static final MapCodec<dqw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dqw::new)
   );
   public static final dzd d = dzc.A;

   @Override
   public MapCodec<dqw> a() {
      return c;
   }

   protected dqw(dzb $$0, dyl.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dym $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dym a(dym $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dhp $$0, jj $$1) {
      Class<? extends bvs> $$2 = switch (this.b.f()) {
         case a -> bvs.class;
         case b -> bwr.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d);
   }
}
