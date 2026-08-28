import com.mojang.serialization.MapCodec;

public class eir extends eik {
   public static final MapCodec<eir> b = dvd.a.fieldOf("state").xmap(dvc.a::b, dhy::m).xmap(eir::new, $$0 -> $$0.c);
   private final dhy c;

   public eir(dhy $$0) {
      this.c = $$0;
   }

   @Override
   protected eil<?> a() {
      return eil.f;
   }

   @Override
   public dvd a(azr $$0, jg $$1) {
      jl.a $$2 = jl.a.a($$0);
      return this.c.m().c(dok.i, $$2);
   }
}
