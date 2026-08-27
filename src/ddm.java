import com.mojang.serialization.MapCodec;

public class ddm extends cxy {
   public static final MapCodec<ddm> d = b(ddm::new);

   @Override
   public MapCodec<ddm> a() {
      return d;
   }

   public ddm(dmd.d $$0) {
      super($$0, jh.e);
   }

   @Override
   protected double b(dme $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dme $$0) {
      return true;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return 3;
   }
}
