import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlx extends dlw {
   public static final MapCodec<dlx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lx.e.q().fieldOf("host").forGetter(dlw::b), t()).apply($$0, dlx::new));

   @Override
   public MapCodec<dlx> a() {
      return b;
   }

   public dlx(dhy $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dok.i, jl.a.b));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return dok.b($$0, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(dok.i);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(dok.i, $$0.k().o());
   }
}
