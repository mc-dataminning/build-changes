import com.mojang.serialization.MapCodec;

public class esg extends ery {
   public static final MapCodec<esg> a = ayk.a(mb.f).fieldOf("tag").xmap(esg::new, $$0 -> $$0.b);
   private final ayk<dke> b;

   public esg(ayk<dke> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxn $$0, bam $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erz<?> a() {
      return erz.d;
   }
}
