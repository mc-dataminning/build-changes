import com.mojang.serialization.MapCodec;

public class ejy extends eju {
   public static final MapCodec<ejy> a = ayl.l.fieldOf("chance").xmap(ejy::new, $$0 -> $$0.c);
   private final int c;

   private ejy(int $$0) {
      this.c = $$0;
   }

   public static ejy a(int $$0) {
      return new ejy($$0);
   }

   @Override
   protected boolean a(ejt $$0, azk $$1, je $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ejw<?> b() {
      return ejw.b;
   }
}
