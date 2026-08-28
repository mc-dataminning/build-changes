import com.mojang.serialization.MapCodec;

public class eiz extends eiv {
   public static final MapCodec<eiz> a = axw.l.fieldOf("chance").xmap(eiz::new, $$0 -> $$0.c);
   private final int c;

   private eiz(int $$0) {
      this.c = $$0;
   }

   public static eiz a(int $$0) {
      return new eiz($$0);
   }

   @Override
   protected boolean a(eiu $$0, ayw $$1, jd $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eix<?> b() {
      return eix.b;
   }
}
