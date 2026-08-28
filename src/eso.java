import com.mojang.serialization.MapCodec;

public class eso extends esg {
   public static final MapCodec<eso> a = ayk.a(mb.f).fieldOf("tag").xmap(eso::new, $$0 -> $$0.b);
   private final ayk<dkm> b;

   public eso(ayk<dkm> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxv $$0, bam $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esh<?> a() {
      return esh.d;
   }
}
