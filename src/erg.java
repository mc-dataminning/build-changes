import com.mojang.serialization.MapCodec;

public class erg extends ery {
   public static final MapCodec<erg> a = ma.e.q().fieldOf("block").xmap(erg::new, $$0 -> $$0.b);
   private final dke b;

   public erg(dke $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dxn $$0, bam $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erz<?> a() {
      return erz.b;
   }
}
