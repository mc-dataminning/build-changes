import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmi extends dmh {
   public static final MapCodec<dmi> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lz.e.q().fieldOf("host").forGetter(dmh::b), t()).apply($$0, dmi::new));

   @Override
   public MapCodec<dmi> a() {
      return b;
   }

   public dmi(dij $$0, dvn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dov.i, jm.a.b));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return dov.b($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(dov.i);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(dov.i, $$0.k().o());
   }
}
