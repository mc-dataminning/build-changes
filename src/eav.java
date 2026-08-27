import com.mojang.serialization.Codec;

public class eav extends ear {
   public static final Codec<eav> a = avq.j.fieldOf("chance").xmap(eav::new, $$0 -> $$0.c).codec();
   private final int c;

   private eav(int $$0) {
      this.c = $$0;
   }

   public static eav a(int $$0) {
      return new eav($$0);
   }

   @Override
   protected boolean a(eaq $$0, awp $$1, hz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eat<?> b() {
      return eat.b;
   }
}
