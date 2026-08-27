import com.mojang.serialization.Codec;

public class dui extends due {
   public static final Codec<dui> a = aqy.j.fieldOf("chance").xmap(dui::new, $$0 -> $$0.c).codec();
   private final int c;

   private dui(int $$0) {
      this.c = $$0;
   }

   public static dui a(int $$0) {
      return new dui($$0);
   }

   @Override
   protected boolean a(dud $$0, aru $$1, gu $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dug<?> b() {
      return dug.b;
   }
}
