import com.mojang.serialization.MapCodec;

public class ddy extends ddo implements czi {
   public static final MapCodec<ddy> a = b(ddy::new);

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   public ddy(dmd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      $$0.a($$2.d(), ddz.c(), 2);
   }

   @Override
   public ib a(ib $$0) {
      return $$0.d();
   }
}
