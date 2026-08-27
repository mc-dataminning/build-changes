import com.mojang.serialization.Codec;

public class duj extends duf {
   public static final Codec<duj> a = aqy.j.fieldOf("chance").xmap(duj::new, $$0 -> $$0.c).codec();
   private final int c;

   private duj(int $$0) {
      this.c = $$0;
   }

   public static duj a(int $$0) {
      return new duj($$0);
   }

   @Override
   protected boolean a(due $$0, aru $$1, gu $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public duh<?> b() {
      return duh.b;
   }
}
