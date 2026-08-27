import com.mojang.serialization.MapCodec;

public class dhi extends dbn implements czi {
   public static final MapCodec<dhi> c = b(dhi::new);

   @Override
   public MapCodec<dhi> a() {
      return c;
   }

   public dhi(dmd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      a($$0, $$2, new cpq(this));
   }
}
