import com.mojang.serialization.MapCodec;

public class dbf extends cvr {
   public static final MapCodec<dbf> d = b(dbf::new);

   @Override
   public MapCodec<dbf> a() {
      return d;
   }

   public dbf(djo.d $$0) {
      super($$0, jd.e);
   }

   @Override
   protected double b(djp $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(djp $$0) {
      return true;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return 3;
   }
}
