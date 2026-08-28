import com.mojang.serialization.MapCodec;

public class esn extends esf {
   public static final MapCodec<esn> a = ayk.a(mb.f).fieldOf("tag").xmap(esn::new, $$0 -> $$0.b);
   private final ayk<dkl> b;

   public esn(ayk<dkl> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxu $$0, bam $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected esg<?> a() {
      return esg.d;
   }
}
