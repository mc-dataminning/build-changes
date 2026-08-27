import com.mojang.serialization.Codec;

public class dyp extends dyl {
   public static final Codec<dyp> a = atv.j.fieldOf("chance").xmap(dyp::new, $$0 -> $$0.c).codec();
   private final int c;

   private dyp(int $$0) {
      this.c = $$0;
   }

   public static dyp a(int $$0) {
      return new dyp($$0);
   }

   @Override
   protected boolean a(dyk $$0, auu $$1, hx $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dyn<?> b() {
      return dyn.b;
   }
}
