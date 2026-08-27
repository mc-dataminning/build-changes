import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfx extends dfw {
   public static final MapCodec<dfx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kr.e.q().fieldOf("host").forGetter(dfw::b), u()).apply($$0, dfx::new));

   @Override
   public MapCodec<dfx> a() {
      return b;
   }

   public dfx(dby $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(dij.i, ih.a.b));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return dij.b($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(dij.i);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(dij.i, $$0.k().o());
   }
}
