import com.mojang.serialization.Codec;

public class dun extends duj {
   public static final Codec<dun> a = arb.j.fieldOf("chance").xmap(dun::new, $$0 -> $$0.c).codec();
   private final int c;

   private dun(int $$0) {
      this.c = $$0;
   }

   public static dun a(int $$0) {
      return new dun($$0);
   }

   @Override
   protected boolean a(dui $$0, arx $$1, gw $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dul<?> b() {
      return dul.b;
   }
}
