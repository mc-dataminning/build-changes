import com.mojang.serialization.Codec;

public class dyy extends dyu {
   public static final Codec<dyy> a = atx.j.fieldOf("chance").xmap(dyy::new, $$0 -> $$0.c).codec();
   private final int c;

   private dyy(int $$0) {
      this.c = $$0;
   }

   public static dyy a(int $$0) {
      return new dyy($$0);
   }

   @Override
   protected boolean a(dyt $$0, auw $$1, hx $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dyw<?> b() {
      return dyw.b;
   }
}
