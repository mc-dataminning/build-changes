import com.mojang.serialization.Codec;

public class duh extends dud {
   public static final Codec<duh> a = aqw.j.fieldOf("chance").xmap(duh::new, $$0 -> $$0.c).codec();
   private final int c;

   private duh(int $$0) {
      this.c = $$0;
   }

   public static duh a(int $$0) {
      return new duh($$0);
   }

   @Override
   protected boolean a(duc $$0, art $$1, gv $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public duf<?> b() {
      return duf.b;
   }
}
