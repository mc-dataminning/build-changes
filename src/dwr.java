import com.mojang.serialization.Codec;

public class dwr extends dwn {
   public static final Codec<dwr> a = asu.j.fieldOf("chance").xmap(dwr::new, $$0 -> $$0.c).codec();
   private final int c;

   private dwr(int $$0) {
      this.c = $$0;
   }

   public static dwr a(int $$0) {
      return new dwr($$0);
   }

   @Override
   protected boolean a(dwm $$0, ats $$1, ht $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dwp<?> b() {
      return dwp.b;
   }
}
