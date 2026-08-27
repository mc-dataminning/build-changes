import com.mojang.serialization.Codec;

public class dyq extends dym {
   public static final Codec<dyq> a = atw.j.fieldOf("chance").xmap(dyq::new, $$0 -> $$0.c).codec();
   private final int c;

   private dyq(int $$0) {
      this.c = $$0;
   }

   public static dyq a(int $$0) {
      return new dyq($$0);
   }

   @Override
   protected boolean a(dyl $$0, auv $$1, hx $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dyo<?> b() {
      return dyo.b;
   }
}
