import com.mojang.serialization.MapCodec;

public class egt extends egp {
   public static final MapCodec<egt> a = axm.j.fieldOf("chance").xmap(egt::new, $$0 -> $$0.c);
   private final int c;

   private egt(int $$0) {
      this.c = $$0;
   }

   public static egt a(int $$0) {
      return new egt($$0);
   }

   @Override
   protected boolean a(ego $$0, ayk $$1, io $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public egr<?> b() {
      return egr.b;
   }
}
