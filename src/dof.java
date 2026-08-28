import com.mojang.serialization.MapCodec;

public class dof extends doj {
   public static final MapCodec<dof> a = b(dof::new);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return false;
   }

   @Override
   protected int g(dta $$0, dca $$1, jd $$2) {
      return $$1.Q();
   }
}
