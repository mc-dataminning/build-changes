import com.mojang.serialization.MapCodec;

public class dre extends dlk {
   public static final MapCodec<dre> c = b(dre::new);

   @Override
   public MapCodec<dre> a() {
      return c;
   }

   public dre(eas.d $$0) {
      super($$0, kc.e);
   }

   @Override
   protected double b(eat $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(eat $$0) {
      return true;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
         $$3.aC();
      }
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return 3;
   }
}
