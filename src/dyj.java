import com.mojang.serialization.Codec;

public class dyj extends dyf {
   public static final Codec<dyj> a = atq.j.fieldOf("chance").xmap(dyj::new, $$0 -> $$0.c).codec();
   private final int c;

   private dyj(int $$0) {
      this.c = $$0;
   }

   public static dyj a(int $$0) {
      return new dyj($$0);
   }

   @Override
   protected boolean a(dye $$0, aup $$1, hx $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dyh<?> b() {
      return dyh.b;
   }
}
