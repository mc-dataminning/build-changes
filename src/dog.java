import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog extends dhx {
   public static final MapCodec<dog> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dog::new)
   );
   public static final dwf f = dwe.w;

   @Override
   public MapCodec<dog> a() {
      return e;
   }

   protected dog(dwd $$0, dvn.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dvo $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dvo a(dvo $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dff $$0, jh $$1) {
      Class<? extends bui> $$2 = switch (this.d.f()) {
         case a -> bui.class;
         case b -> bve.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f);
   }
}
