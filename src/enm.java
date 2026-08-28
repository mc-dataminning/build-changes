import com.mojang.serialization.MapCodec;

public class enm extends eni {
   public static final MapCodec<enm> a = azn.m.fieldOf("chance").xmap(enm::new, $$0 -> $$0.c);
   private final int c;

   private enm(int $$0) {
      this.c = $$0;
   }

   public static enm a(int $$0) {
      return new enm($$0);
   }

   @Override
   protected boolean a(enh $$0, bam $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public enk<?> b() {
      return enk.b;
   }
}
