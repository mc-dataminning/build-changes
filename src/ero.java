import com.mojang.serialization.MapCodec;

public class ero extends esg {
   public static final MapCodec<ero> a = ma.e.q().fieldOf("block").xmap(ero::new, $$0 -> $$0.b);
   private final dkm b;

   public ero(dkm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxv $$0, bam $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esh<?> a() {
      return esh.b;
   }
}
