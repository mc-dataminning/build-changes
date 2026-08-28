import com.mojang.serialization.MapCodec;

public class elc extends ekt {
   public static final MapCodec<elc> b = dxn.a.fieldOf("state").xmap(elc::new, $$0 -> $$0.c);
   private final dxn c;

   protected elc(dxn $$0) {
      this.c = $$0;
   }

   @Override
   protected eku<?> a() {
      return eku.a;
   }

   @Override
   public dxn a(bam $$0, jh $$1) {
      return this.c;
   }
}
