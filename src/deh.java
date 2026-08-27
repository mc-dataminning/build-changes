import com.mojang.serialization.MapCodec;

public class deh extends cyt {
   public static final MapCodec<deh> d = b(deh::new);

   @Override
   public MapCodec<deh> a() {
      return d;
   }

   public deh(dmy.d $$0) {
      super($$0, ji.e);
   }

   @Override
   protected double b(dmz $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dmz $$0) {
      return true;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return 3;
   }
}
