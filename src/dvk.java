import com.mojang.serialization.Codec;

public class dvk extends dvg {
   public static final Codec<dvk> a = asg.j.fieldOf("chance").xmap(dvk::new, $$0 -> $$0.c).codec();
   private final int c;

   private dvk(int $$0) {
      this.c = $$0;
   }

   public static dvk a(int $$0) {
      return new dvk($$0);
   }

   @Override
   protected boolean a(dvf $$0, ate $$1, ht $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dvi<?> b() {
      return dvi.b;
   }
}
