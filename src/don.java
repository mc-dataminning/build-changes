import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends dom {
   public static final MapCodec<don> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(dom::b), t()).apply($$0, don::new));

   @Override
   public MapCodec<don> a() {
      return b;
   }

   public don(dkl $$0, dxt.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dra.i, jm.a.b));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return dra.b($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(dra.i);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(dra.i, $$0.k().o());
   }
}
